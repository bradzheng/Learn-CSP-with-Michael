# 第 10 章 MCP：连接到你的 PM 工具栈

## 10.1 MCP 如何消除导出-导入循环

模型上下文协议（Model Context Protocol，MCP）让 Claude Code 直接连接到外部工具——无需导出 CSV、上传到 Claude.ai 并复制粘贴回来。Claude Code 原生查询你的工具并就地更新。

**没有 MCP**：从 Jira 导出工单 → 保存为 CSV → 上传到 Claude Code → 分析 → 将结果复制粘贴回 Jira。

**有 MCP**：Claude Code 直接查询 Jira → 分析工作 → 用发现结果更新工单。

MCP 消除的是工具之间的手动交接——正是这些交接耗费动力并引入错误。

Claude Code 可以连接到各种工具：Jira（问题追踪器）、Slack（消息和频道）、GitHub/GitLab（仓库和 PR）、Figma（设计文件）、数据库（分析查询）、自定义 API。

## 10.2 配置你的第一个集成

MCP 配置存放在 `.claude/mcp.json`（项目级别）或 `~/.claude/mcp.json`（用户级别）。

**示例配置（Jira + Slack）：**

```json
{
  "mcpServers": {
    "jira": {
      "command": "npx",
      "args": ["-y", "@anthropic/jira-mcp-server"],
      "env": {
        "JIRA_URL": "https://your-company.atlassian.net",
        "JIRA_EMAIL": "you@company.com",
        "JIRA_API_TOKEN": "your-token"
      }
    },
    "slack": {
      "command": "npx",
      "args": ["-y", "@anthropic/slack-mcp-server"],
      "env": { "SLACK_BOT_TOKEN": "xoxb-..." }
    }
  }
}
```

MCP 服务器以独立进程运行。Claude Code 按需启动它们。

**权限范围**：MCP 服务器可以请求不同的权限级别——只读访问或读写访问。授予与你的信任水平匹配的最小权限。

## 10.3 在不离开 Claude Code 的情况下查询和更新 Jira

配置好 Jira MCP 后，Claude Code 可以：

- **查询工单**："显示当前 sprint 中所有阻塞的工单"、"提取分配给前端团队的所有 P1 bug"
- **创建工单**："为批量用户导入功能创建任务分解，给我本周冲刺中的四个任务"
- **更新工单**："用我在此对话中的发现更新 PM-1234 的描述，并添加包含文件引用的评论"
- **检查状态**："PM-1567 的状态是什么？谁在处理？"

**提示词模式**："根据我的 sprint 中的工单生成一份状态报告。按工单状态分组，并包含阻碍项。"

Claude Code 查询 Jira、按状态分组并格式化为报告——所有这些都在一个环境中完成。

## 10.4 自动拉取上下文和发布更新

MCP 的真正优势在于上下文收集和自动更新：

- **冲刺规划**："拉取当前 sprint 中所有工单的摘要及每个工单的分配情况。根据最近的 git 活动对其完成度进行评论。"
- **状态更新**："找到 PRD 中引用但尚未在 Jira 中创建工单的用户故事。为每个创建草稿工单，链接到 PRD。"
- **Slack 集成**："将状态更新发布到 #product-updates 频道，摘要发布说明中的关键变更。"

工作流：Claude Code 从 Jira 读取当前 sprint → 与 git 活动交叉引用 → 生成附有状态评论的冲刺摘要 → 发布到 Slack（如要求）。

**成本**：MCP 添加了工具调用，这增加了少量 token 开销。典型的 Jira/Slack 集成为会话成本增加不到 10%，但通过消除手动复制粘贴节省的时间远超此成本。

## 10.5 以编程方式提取设计规范

Figma MCP 让 Claude Code 访问设计文件：

> "从 [Figma 链接] 的设计文件中提取按钮样式和颜色令牌，并与 `src/styles/theme.js` 中定义的内容进行比较。标记任何差异。"

Claude Code 读取 Figma → 提取设计令牌 → 与代码库实现比较 → 生成差异报告。

## 10.6 无需编写 SQL 拉取指标

数据库 MCP 连接允许自然语言查询：

> "上个月有多少用户执行了导出操作？按计划层级细分。" → Claude Code 生成 SQL，运行它，并以表格形式呈现结果。

或："显示过去 3 个月按周划分的用户激活率趋势。"Claude Code 查询数据库 → 格式化为表格 → 可选地生成火花线图趋势描述。

**安全考虑**：数据库 MCP 应使用只读凭证。永远不要授予可能修改数据的 MCP 服务器写入权限，除非经过工程审查。MCP 集成是第 10 章中最强大的概念，但也最具风险。
