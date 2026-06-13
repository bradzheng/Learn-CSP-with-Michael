# CS 173 (Discrete Structures) 深度解析

> 调研日期: 2026-06-12 | 目标: 为转入 CS+GGIS 做前置准备 (需 B+)

---

## 一、CS 173 是什么？

**CS 173 — Discrete Structures** 是 UIUC Siebel School of Computing and Data Science 的离散数学课程，也是计算机科学最重要的理论基础课之一。

这门课教的是 **"计算机科学的数学语言"**——不是算数，而是逻辑、证明、集合、图论这些支撑整个 CS 的理论工具。它训练的核心能力是 **阅读和书写数学证明**。

> 对转入 CS+GGIS 来说，CS 173 和 CS 225 是最关键的两门前置课，**都需要 B+ 以上**。

---

## 二、教学内容全览

**教材**: Margaret Fleck 的 *Building Blocks for Theoretical Computer Science*（免费在线，CS 173 自用教材）
**辅助参考**: Rosen *Discrete Mathematics and Its Applications*（经典教材，可选）

### 课程分为三大模块

### 📐 模块一：逻辑与证明 (Logic & Proofs)

这是 CS 173 的**核心内核**——整个学期都在反复训练证明能力。

| 主题 | 具体内容 |
|------|---------|
| **命题逻辑** | 逻辑连接词 (∧, ∨, ¬, →)，真值表，逻辑等价，范式 |
| **谓词逻辑** | 量词 (∀, ∃)，嵌套量词，谓词逻辑中的证明 |
| **直接证明** | 从假设到结论的链式推理 |
| **反证法** | Proof by contradiction (假设结论不成立 → 推出矛盾) |
| **对偶证明** | Proof by contrapositive |
| **分情况证明** | Proof by cases |
| **反例** | 用反例证明一个命题不成立 |

### 🔢 模块二：离散结构 (Discrete Structures)

| 主题 | 具体内容 |
|------|---------|
| **数论** | 整除性、素数、GCD、欧几里得算法、模算术 |
| **集合** | 集合运算、笛卡尔积、幂集、容斥原理、集合恒等式 |
| **关系** | 自反性/对称性/传递性、等价关系、偏序、Hasse 图 |
| **函数** | 单射/满射/双射、复合、逆函数 |
| **大 O 记号** | 渐近分析 (O, Ω, Θ)，函数增长率 |

### 🌳 模块三：图论与递归 (Graphs, Induction & Recursion)

| 主题 | 具体内容 |
|------|---------|
| **数学归纳法** | 弱归纳 (weak induction)、强归纳 (strong induction)、结构归纳法 |
| **递归定义** | 闭式解 (closed form)、分治、超立方体 |
| **图论** | 图同构、连通性、欧拉回路/汉密尔顿路径、图着色、二分图 |
| **树** | 生成树、递归树、上下文无关文法、堆 |
| **计数** | 乘法和加法原理、鸽笼原理、排列组合、二项式定理 |
| **状态机** | 状态转移图、不变性 (invariants) |
| **可数性** | 康托尔对角线论证、不可计算性 (简要介绍) |
| **平面图** | 欧拉公式、Kuratowski 定理、四色定理 |

### 课程组织方式 — "Examlet" 系统

CS 173 采用独特的 **Examlet（小测验）** 模式替代传统期中考试：

| Examlet | 覆盖内容 |
|---------|---------|
| A | 代数、对数基础 |
| B | 逻辑、真值表、量化逻辑 |
| C | 集合、集合包含证明 |
| D | 关系 (等价关系、偏序) |
| E | 函数、单射/满射、鸽笼原理 |
| F | 图论、图同构、图着色 |
| G | 数学归纳法 |
| H | 递归定义、递归关系 |
| I | 递归树、分治算法 |
| J | 计数、排列组合 |

> 每个 Examlet 约 10-20 分钟，整学期约 8-10 次，允许 drop 最低分的几次。期末有综合考试。

---

## 三、最接近的公开课推荐

### 🥇 MIT 6.042J / 6.1200J — Mathematics for Computer Science

| 项目 | 内容 |
|------|------|
| **平台** | MIT OCW（免费） |
| **教材** | *Mathematics for Computer Science* (Lehman, Leighton, Meyer) — 免费 PDF |
| **与 CS 173 相似度** | ⭐⭐⭐⭐⭐ **极高** |
| **覆盖主题** | 证明、归纳、数论、图论、计数、概率 + 更多概率论 (CS 173 博士版) |
| **视频** | ✅ 全套 lecture 录像 (YouTube / OCW) |
| **作业** | ✅ 含解答 |
| **难度** | 略高于 CS 173 (MIT 本科生水平) |
| **链接** | https://ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015/ |

**推荐理由**: 内容覆盖面最接近，同样是 CS 导向的离散数学，免费且质量极高。提前学完这门课相当于 CS 173 拿到 A 级别的准备。

---

### 🥈 Margaret Fleck 的官方教材 + 学习资料

| 项目 | 内容 |
|------|------|
| **教材** | *Building Blocks for Theoretical Computer Science* (v1.3b/v1.4) |
| **链接** | https://mfleck.cs.illinois.edu/building-blocks/index-sp2020.html |
| **完整 PDF** | https://mfleck.cs.illinois.edu/building-blocks/version-1.0/whole-book.pdf |
| **练习题** | https://mfleck.cs.illinois.edu/study-problems/ |
| **与 CS 173 相似度** | ⭐⭐⭐⭐⭐ **完全一致** — 就是 CS 173 的官方课本 |
| **价格** | 免费 |

**推荐理由**: 这就是 CS 173 的官方教材。提前通读 + 做习题 = 直接预习课内内容。

---

### 🥉 Rosen — *Discrete Mathematics and Its Applications*

| 项目 | 内容 |
|------|------|
| **类型** | 经典教科书 (7th/8th ed) |
| **与 CS 173 相似度** | ⭐⭐⭐⭐ |
| **优势** | 内容最全面，例题极多，被 Stanford/CMU/Berkeley 等广泛使用 |
| **劣势** | 比较贵 (~$150)，有些内容过于宽泛 |

**推荐理由**: 最经典的学习资料，适合作为辅助深度理解。

---

### 其他推荐

| 资源 | 类型 | 链接 |
|------|------|------|
| **Trevor Bazett 离散数学** | YouTube 系列 (14小时) | https://www.youtube.com/playlist?list=PLHXZ9OQGMqxersk8fUxiUMSIx0DBqsKZS |
| **Kimberly Brehm 离散数学** | YouTube 系列 | https://www.youtube.com/playlist?list=PLl-gb0E4MII28GykmtuBXNUNoej-vY5Rz |
| **Coursera 离散数学** (UC San Diego) | 在线课程 | Coursera 搜索 "Discrete Mathematics" |
| **Brilliant.org 离散数学路径** | 交互式学习 | https://brilliant.org/ |

---

## 四、如何获取 CS 173 往年考题

### 官方公开的 Examlet 和考题（免费）

UIUC 课程网站多年来公开了大量往年考题和解答。以下是直接可用的链接：

### 近年考题

**Summer 2024** — 讨论题 (含解答):
- [Examlet C](https://courses.grainger.illinois.edu/cs173/su2024/ALL-lectures/solutions/SUMMER_Discussion_Problems_C_Solutions.pdf) — 图论、欧拉回路、图同构、着色、归纳法
- [Examlet D](https://courses.grainger.illinois.edu/cs173/su2024/ALL-lectures/solutions/SUMMER_Discussion_Problems_D_Solutions.pdf) — 递归定义、递归关系、归纳法、树、文法
- [Examlet F](https://courses.grainger.illinois.edu/cs173/su2024/ALL-lectures/solutions/SUMMER_Discussion_Problems_F_Solutions.pdf) — 幂集、划分、鸽笼原理、组合、二项式定理

**Spring 2020** — Examlet 含解答:
- [Examlet 1](https://courses.grainger.illinois.edu/cs173/sp2020/Common/Sols/examlet1/white_sols.pdf) — 逻辑、代数、对数
- [Examlet 3](https://courses.grainger.illinois.edu/cs173/sp2020/Common/Sols/examlet3/colored.pdf) — 集合包含证明
- [Examlet 4](https://courses.grainger.illinois.edu/cs173/sp2020/Common/Sols/examlet4/colored.pdf) — 关系 (传递性、反对称)

**Spring 2019** — Examlet 含解答:
- [Examlet 1](https://courses.grainger.illinois.edu/cs173/sp2019/Common/Sols/examlet1/white_solutions.pdf) — 逻辑、代数化简
- [Examlet 3](https://courses.grainger.illinois.edu/cs173/sp2019/Common/Sols/examlet3/colored.pdf) — 集合包含证明
- [Examlet 8](https://courses.grainger.illinois.edu/cs173/sp2019/Common/Sols/examlet8/white.pdf) — 递归、递归关系、闭式解

**Spring 2015** — **最完整的往年题合集**:
- [Examlets 1-7 + 期末 + 解答](https://courses.grainger.illinois.edu/cs173/sp2015/B-lecture/Exams/)

**Spring 2018**:
- [Examlets 1-5 + 解答](https://courses.grainger.illinois.edu/cs173/sp2018/B-lecture/Exams/index.html)

### 在线练习平台

| 平台 | 内容 | 链接 |
|------|------|------|
| **Numerade** | CS 173 配套视频讲解 | https://www.numerade.com/notes/directory/school/2893/courses/140459/files/2999831 |
| **CS 173 学习资料页** | 官方整理的补充习题 | https://mfleck.cs.illinois.edu/study-problems/ |
| **Reddit r/UIUC** | 历年学生分享经验和考题讨论 | https://www.reddit.com/r/UIUC/ |
| **Course Hero / Chegg** | 可能有学生上传的考题 (需付费) | — |

### 获取往年题的最佳策略

1. **第一站**: Spring 2015 [Examlets 1-7 合集](https://courses.grainger.illinois.edu/cs173/sp2015/B-lecture/Exams/) — 最全、最系统
2. **第二站**: Summer 2024 [讨论题](https://courses.grainger.illinois.edu/cs173/su2024/ALL-lectures/solutions/) — 最新的题目形式
3. **第三站**: 直接修改 URL 尝试其他学期 → `https://courses.grainger.illinois.edu/cs173/{term}/`
   - 可用 term: `fa2024`, `sp2024`, `su2023`, `fa2022`, `sp2022` 等
   - 访问 `/Exams/` 或 `/ALL-lectures/Exams/` 路径
4. **第四站**: [mfleck.cs.illinois.edu/study-problems/](https://mfleck.cs.illinois.edu/study-problems/) — 官方精选习题 (按章节分类)

---

## 五、提前自学计划 (2026 年暑假)

### 目标： 2027 Fall 修 CS 173 并拿到 A

| 阶段 | 时间 | 内容 | 资源 |
|------|------|------|------|
| **Phase 1** | 暑假 | 数学基础复习 | 集合、指对数、阶乘、求和 |
| **Phase 2** | 暑假 | 逻辑与证明入门 | Fleck Ch.2-3 + MIT 6.042 Lec 1-3 |
| **Phase 3** | 暑假 | 集合与关系 | Fleck Ch.5-6 |
| **Phase 4** | 大一开始后 | 同步跟课进度 | Fleck Ch.7-18 + 作业 |
| **考前** | — | 刷往年 Examlets | Spring 2015 + 近年考题 |

### 每日建议

- 每天 30-60 分钟，不要突击
- 每学完一章做 Fleck 的课后习题 + 对答案
- 多看 MIT 6.042J 的 lecture video (Tom Leighton 讲得非常清楚)
- **重点攻克**: 归纳法证明 (induction) — 这是 CS 173 最常见的卡点

---

## 六、CS 173 在关键路径中的位置

```
CS 124 → CS 128 → CS 173 ←→ CS 225 (两门可并行)
                       ↓
              CS 300/400 级课程
```

- CS 173 **不需要** CS 225 作为先修，两门课可以同学期上
- CS 173 **是** 大多数 CS 300-level 课程的先修 (或与 CS 225 并列)
- 对转入 CS+GGIS: CS 173 **和** CS 225 都需要 **B+ 或以上**
- **建议**: 大二 Fall 修 CS 173，争取 A

---

## 关键资源汇总

| 资源 | 链接 |
|------|------|
| CS 173 官方教材 (Fleck) | https://mfleck.cs.illinois.edu/building-blocks/version-1.0/whole-book.pdf |
| CS 173 官方习题 | https://mfleck.cs.illinois.edu/study-problems/ |
| MIT 6.042J 课程 | https://ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015/ |
| MIT 教材 PDF | https://ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015/readings/MIT6_042JS15_textbook.pdf |
| Spring 2015 全套 Examlets | https://courses.grainger.illinois.edu/cs173/sp2015/B-lecture/Exams/ |
| Summer 2024 讨论题 | https://courses.grainger.illinois.edu/cs173/su2024/ALL-lectures/solutions/ |
| Spring 2018 Examlets | https://courses.grainger.illinois.edu/cs173/sp2018/B-lecture/Exams/index.html |
| 历史考题通配 URL | `https://courses.grainger.illinois.edu/cs173/{term}/` |
| Numerade CS 173 视频 | https://www.numerade.com/notes/directory/school/2893/courses/140459/files/2999831 |
| 推荐 YouTube 系列 | https://www.youtube.com/playlist?list=PLHXZ9OQGMqxersk8fUxiUMSIx0DBqsKZS |

> ⚠️ 注意: 上述 courses.grainger.illinois.edu 的链接为 UIUC 公开资源，不需要 NetID 也能访问。考题每年可能微调，但核心题型多年不变。
