2026年 8月 2日 星期日 22时45分42秒 CST
# Q-list
## 列出所有和'Pi agent'相关的笔记，如果我现在想学习它，推荐3篇优先看的笔记。为什么你推荐它们？
## 创始人亲自讲设计理念
- 开头多长时间Mario在讲claude code的弊端? 都有哪些弊端? Mario为什么不认可?
以下是所有和 **Pi Agent** 相关的笔记清单：

---

## 📋 所有 Pi Agent 相关笔记（共 13 篇）

### Bilibili 视频剪辑（11 篇）
1. `[[Clippings/Bilibili/2026-07-28-【中配】Pi 编码代理：唯一真正的 Claude Code 对手 - IndyDevDan.md]]` — Pi vs Claude Code 对比评测
2. `[[Clippings/Bilibili/2026-07-28-【中配】【PI Agent】PI Agent创始人Mario_Zechner介绍框架.md]]` — 创始人亲自讲设计理念
3. `[[Clippings/Bilibili/2026-07-28-17分钟学会 Pi Agent 90% 核心功能：轻量级终端编码助手教程.md]]` — 快速上手教程（安装+命令+扩展）
4. `[[Clippings/Bilibili/2026-07-28-Pi Agent 源码系统课：从真实运行到自己组装 Agent.md]]` — 54 分钟源码深度课
5. `[[Clippings/Bilibili/2026-07-28-Pi Agent：比Claude Code和Codex更适合普通人的AI工具.md]]` — 面向非程序员的工作流视频（搜索/PDF/TTS/视频生成）
6. `[[Clippings/Bilibili/2026-07-28-【AI-Engineer】17分钟掌握Pi Agent：90%的核心功能.md]]` — 开发者工作流速成（项目初始化/调试/重构）
7. `[[Clippings/Bilibili/2026-07-28-pi agent 最佳实践 | Harness Agent 定制全流程实战.md]]` — TypeScript extensions / skills / themes 定制实战
8. `[[Clippings/Bilibili/2026-07-28-一口气学会Pi Agent极简Harness系统设计.md]]` — 白板和源码分析，含 Waku Agent 调用 Pi 的演示
9. `[[Clippings/2026-07-28-使用pi-agent的三种姿势，它凭什么成为openclaw的底层框架.md]]` — 极简 Coding Agent 300 行代码实现
10. `[[Clippings/2026-07-28-pi-coding-agent 教程.md]]` — 综合教程，含多 Agent 编排
11. `[[Clippings/2026-07-28-哦对了，我将pi源码写成了一本书…….md]]` — 开源项目上线难题拆解

### 文章（1 篇）
12. `[[Clippings/Claude Code、Cursor 都不听话?这个国人开源的"AI 编码脚手架",GitHub 60 小时冲上千 star.md]]` — 背景介绍文

### 日记（1 篇）
13. `[[600-dairy/2026-07-29.md]]` — 当天 Pi Agent 研究计划

---

## 🏆 推荐优先阅读 Top 3

### **第 1 篇（优先）：创始人 Mario 亲自介绍框架**
[[Clippings/Bilibili/2026-07-28-【中配】【PI Agent】PI Agent创始人Mario_Zechner介绍框架.md]]

**为什么先看它：** 这是理解 Pi Agent 一切设计的前提。Mario 亲自解释了"为什么要做 Pi"——源于他对 Claude Code / OpenCode 等工具"功能爆炸、上下文不可控"的切身体会。他给出了核心设计哲学：
- **核心极简**：只有 4 个工具（read / write / edit / bash）
- **可编程边缘**：Skills、Extensions、Packages 让你按需叠加
- **会话是树**：`/fork` 支持分支式探索，而非线性对话
- 对比分析了 Claude Code 的"宇宙飞船"问题、OpenCode 的 prompt cache 失效问题、LSP 干扰问题

看完这篇，你对"Pi 为什么这样设计"会有根基性的理解，后面所有教程都能听懂。

---

### **第 2 篇：一口气学会极简 Harness 系统设计**
[[Clippings/Bilibili/2026-07-28-一口气学会Pi Agent极简Harness系统设计.md]]

**为什么这篇二：** 它是"为什么"到"怎么做"的桥梁。视频从零开始展示：
- 4 种形态（TUI / CLI / JSON 事件流 / RPC）
- 系统提示词（<1500 tokens）如何构建
- Agent Loop 核心：792 行的 `agent-loop.ts`
- **Skills = 程序性记忆**（vs Extensions = 新工具）vs MCP
- 用 Waku Agent 把 Pi 当编码子 Agent 调用的实战
- 会话树结构与 `/fork` 的使用

看完你能从代码层面理解 Pi 的运行机制，而不是只停留在概念。

---

### **第 3 篇：比 Claude Code 和 Codex 更适合普通人的 AI 工具**
[[Clippings/Bilibili/2026-07-28-Pi Agent：比Claude Code和Codex更适合普通人的AI工具.md]]

**为什么这篇第三：** 前两篇解决了"是什么"和"为什么"，这篇解决"怎么用"——而且是面向非程序员视角的完整工作流：
- 安装（含国内镜像加速）
- 添加模型（支持 GPT-5.5 推理模式）
- 实战 5 个 Skill：搜索（Tavily/Brave）→ 读 PDF → TTS 语音 → GPT Image 2 生图 → Hyperframes 做视频
- 最终完成一个完整项目：英伟达 GB200 机柜成本调研 → 生成带配音的中文演讲视频

这让你看到 Pi 的真正威力：**Skill 串起来 = 完整工作流**，而不仅是写代码的工具。

---

### 📚 后续可选
- 想深入源码 → [[Clippings/Bilibili/2026-07-28-Pi Agent 源码系统课：从真实运行到自己组装 Agent.md]]（54 分钟，覆盖 Provider/Loop/Tool/Session/Extension）
- 想定制化开发 → [[Clippings/Bilibili/2026-07-28-pi agent 最佳实践 | Harness Agent 定制全流程实战.md]]
- 想对比评测 → [[Clippings/Bilibili/2026-07-28-【中配】Pi 编码代理：唯一真正的 Claude Code 对手 - IndyDevDan.md]]



从字幕来看，Mario 在 **约 05:00 开始讲 Claude Code 的弊端，一直讲到 09:54**，总共约 **5 分钟**，是他整个演讲中篇幅最长的一个批判段落。

---

## Mario 不认可的 7 个弊端

### 1. 功能膨胀 → 失去可预测性（05:00–05:37）
Claude Code 从"能预测、契合工作流"的工具，变成了功能越加越多的"宇宙飞船"，用户实际只用到 5%，了解不到 10%，剩下 90% 像"暗物质"一样没人知道它在干什么。Mario 认为作为用户你需要知道 agent 在做什么。

### 2. 可观测性差 / 上下文管理失控（05:47–06:04）
Claude Code 在后台会注入大量额外内容到你的上下文中，Mario 在 2025 年夏天专门做了工具去拦截观察，发现这些注入"非常有害且不断变化"——几乎每天每个新版本都在改注入节点和内容。

### 3. UI 闪烁 bug（06:04–07:11）
终端界面频繁闪烁，Claude Code 方面说是"游戏引擎"的问题，Mario 作为有游戏开发背景的人觉得很受冒犯——明明只是 React 重绘布局花了 12ms，根本不该甩锅给终端本身。虽然后来修了，但伤害已经造成。

### 4. 无模型选择（09:14–09:27）
Claude Code 是 Anthropic 原生工具，锁定了 Claude 模型，没有选择空间。Mario 需要灵活切换不同模型。

### 5. 扩展性极差（09:27–09:39）
钩子事件触发时要反复启动进程，开销巨大，无法自定义工作流。

### 6. 后台偷偷改上下文，打破稳定工作流（07:47–08:53）
这是 Mario 最核心的不满：用户在试图建立可预测的工作流时，工具供应商却在底层不断改动注入逻辑，导致 LLM 的输出变得不可控。"这不是一个稳定的工具"。

### 7. 不适合老派工程师的掌控需求（09:40–09:54）
Mario 坦言不是 Claude Code 本身不好，而是"它不再适合我了"——他需要的是能完全掌控上下文、透明可观测的工具。

---

## Mario 为什么不认可的根本原因

用他的一句话概括（08:52）：

> **"我需要对此有控制权。我没指望他们给我一个稳定的东西。"**

他的核心诉求是 **可预测性 + 可观测性 + 可控性**。Claude Code 的设计哲学是"我们帮你管理一切"，而 Mario 认为这恰恰是问题所在——你不知道它在你背后做了什么，它又每天在改，你的工作流就永远建立在流沙上。

这也是他后来构建 Pi 的核心理念：**极简核心（只有 4 个工具）+ 可编程边缘（你来决定加什么）**，把控制权交还给用户。
