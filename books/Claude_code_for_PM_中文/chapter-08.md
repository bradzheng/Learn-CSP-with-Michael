# 第 8 章 技能剖析——结构与设计模式

## 8.1 从临时提示词到可重复工作流

你已经执行了反馈综合、竞争分析、bug 调查文档。每次你把提示词粘贴进 Claude Code 时，你都在重复流程结构——每次凭记忆。技能（Skill）消除了这种重复。

技能是存储在 `.claude/skills/` 中的文档化工作流，Claude Code 按需执行。定义一次流程，每次以一致的方式运行。输入变化，流程保持稳定。

## 8.2 什么是技能？

技能是一个 Markdown 文件（`SKILL.md`），它告诉 Claude Code 如何执行特定类型的任务。它包含描述（技能做什么）、输入（需要什么数据/文件）、流程步骤、输出格式和质量标准。

技能可以存放在两个位置：
- **项目**：`.claude/skills/`（团队共享，提交到 git）
- **个人**：`~/.claude/skills/`（跨所有项目跟随你，用于通用 PM 工作流）

## 8.3 技能组件

一个技能文件包含 frontmatter（YAML）和正文（Markdown 指令）。

```yaml
---
name: feedback-synthesis
description: Synthesize customer feedback from CSV/JSON into a theme report with supporting quotes.
---
```

正文定义 Claude Code 执行的步骤。为什么用 YAML frontmatter？它允许 Claude Code 在不读取整个文件的情况下匹配技能，实现自动调用。

## 8.4 SKILL.md 文件的详细构成

**Frontmatter 字段：** `name`（必需：唯一标识符，kebab-case）、`description`（必需：单行摘要——当用户请求匹配该描述时，Claude Code 可自动调用此技能）、`arguments`（可选：技能接受的命名参数，如 `chapter` 或 `source`）。

**正文部分：**
1. **目的声明**：技能完成什么任务
2. **预期输入部分**：Claude Code 应期望什么数据/文件
3. **流程步骤**：编号或项目符号的指令序列
4. **输出格式规范**：产生的 markdown 结构
5. **质量标准**：验证标准（"每个主题必须有 2+ 支持引用"）
6. **已知边缘情况或限制**：坦诚说明技能可能失败的地方

示例技能——`standup-notes`（从昨日 git 提交生成立会笔记）：

```markdown
---
name: standup-notes
description: Generate standup notes from yesterday's git commits.
---

## Steps
1. Run `git log --since="yesterday" --oneline` to get commits.
2. Group by author. For each author, list their commits with messages.
3. Format as bullet points: `- [Author]: [description] (commit hash)`
4. Save to `standup-notes/YYYY-MM-DD.md`.
```

**设计原则**：约束性（更具体的指令 = 更一致的输出）、全面性（包含边缘情况和错误处理）、自适应（使用条件逻辑处理变化："如果 X 存在，使用 X；否则问用户"）。

## 8.5 PM 技能的设计模式

**图 8.3：五种 PM 技能模式**

1. **转换（Transform）**：原始数据 → 结构化报告（例如：反馈 CSV → 主题报告）
2. **调查（Investigate）**：问题 → 带证据的答案（例如："这个 bug 的原因是什么？" → 文件引用 + 假设）
3. **生成（Generate）**：参数 → 工件（例如：功能名称 → PRD 草稿）
4. **审计（Audit）**：工件 → 检查结果（例如：PRD → 质量评分 + 缺失元素）
5. **协调（Orchestrate）**：目标 → 多步骤工作流（例如："准备发布" → 变更日志 + 工单验证 + 利益相关者邮件）

## 8.6 确定性与可重复性

技能的目标：相同的输入应产生基本相同的输出。这不意味着逐字相同（AI 具有固有的可变性），但结构应相同，主题应相似，措辞应稳定。

如果输出差异很大，你的技能需要更严格的约束。添加更多具体的指令。指定确切的输出格式。

## 8.7 技能组合

技能可以串联："运行 feedback-synthesis，然后将结果传递给 roadmap-impact 以创建优先排序工单。"Claude Code 逐步执行每个技能——第一个的输出成为第二个的输入。第 9 章涵盖构建完整的 PM 技能库。
