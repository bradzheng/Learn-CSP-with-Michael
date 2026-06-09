# 附录 A：命令参考

本参考涵盖与 PM 工作流相关的 Claude Code 命令和选项。在任何会话中运行 `/help` 获取完整、当前的列表——Claude Code 会定期添加功能。

## 每次会话都会用到的命令

| 命令 | 用途 |
|------|------|
| `/help` | 显示所有可用命令 |
| `/status` | 显示会话状态：权限模式、文件修改、token 消耗、估算成本 |
| `/cost` | 显示详细 token 分解和成本估算 |
| `/exit` | 结束当前会话 |
| `/clear` | 结束当前会话并以零上下文开始新会话 |
| `/compact` | 将对话历史压缩为摘要以减少上下文（可选保留特定主题） |
| `/init` | 创建新的 CLAUDE.md 文件及文档模板 |
| `/memory` | 查看或编辑项目的 CLAUDE.md 文件 |
| `/login` | 使用浏览器连接认证 Claude 账户 |

## 实用工具

| 命令 | 用途 |
|------|------|
| `/doctor` | 对安装运行诊断健康检查 |
| `/terminal-setup` | 安装 Shift+Enter 键绑定以在终端输入中插入新行 |

## 启动 Claude Code 的选项

| 标志 | 示例 | 用途 |
|------|------|------|
| `--continue` 或 `-c` | `claude -c` | 继续最近的会话 |
| `--resume` | `claude --resume abc123` | 恢复特定会话（通过 ID） |
| `--permission-mode` | `claude --permission-mode plan` | 设置会话权限模式 |

## 控制 Claude Code 的自主性

通过 `--permission-mode` 标志设置，或在会话期间使用 `Shift+Tab` 循环切换。

| 模式 | 行为 | PM 使用场景 |
|------|------|------------|
| `plan` | 只读。无文件修改，无命令执行 | 代码库调查、bug 分类、数据分析（90% 的 PM 工作） |
| `acceptEdits` | 自动文件修改，命令有提示 | 生成发布说明、创建 PRD、更新 CLAUDE.md |
| `default` | 对所有操作提示 | 学习时、在敏感变更时需要明确批准 |
| `bypassPermissions` | 完全自主（需要 `--dangerously-skip-permissions`） | PM 很少使用 |

## 更快导航和控制

| 快捷键 | 功能 |
|--------|------|
| `Shift+Tab` | 在权限模式间循环（default → acceptEdits → plan） |
| `Esc Esc` | 回退：撤销最后的变更或对话轮次 |

## 输入与导航

| 快捷键 | 功能 |
|--------|------|
| `Shift+Enter` | 不发送消息的换行（需要在 macOS 上运行 `/terminal-setup`） |

## 设置存放位置

- **全局**：`~/.claude/settings.json`（适用于所有项目）
- **项目**：`.claude/settings.json`（团队共享，提交到 git）
- **本地**：`.claude/settings.local.json`（个人覆盖，被 gitignore）

## 设置默认模式

创建或编辑 `~/.claude/settings.json`：

```json
{
  "defaultMode": "plan"
}
```

## 快速参考卡片

- 启动安全会话：`claude --permission-mode plan`
- 检查安装状态：`claude doctor`
- 监控成本：`/cost`
- 压缩上下文：`/compact`
- 查看可用命令：`/help`
- 循环切换模式：`Shift+Tab`
- 干净退出：`/exit`

命令和选项以出版日期为准。运行 `/help` 和 `claude --help` 获取最新信息。
