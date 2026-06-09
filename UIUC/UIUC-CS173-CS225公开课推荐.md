# UIUC CS 173 / CS 225 等价公开课推荐

> 适用场景：提前自学预习、补强薄弱环节、替代参考学习
>
> 更新日期：2025 年 6 月

---

## 一、CS 173（离散数学）等价课程

### 🥇 第一推荐：MIT 6.042J — Mathematics for Computer Science

**推荐理由：与 CS 173 内容匹配度高达 90%+，且 CS 173 教材本身深受 MIT 课程影响。**

| 对比维度 | MIT 6.042J | UIUC CS 173 |
|----------|-----------|-------------|
| 证明方法 | 直接证明、反证法、归纳法、结构归纳 | 同 |
| 逻辑与集合 | 命题/谓词逻辑、集合论、关系、函数 | 同 |
| 数论 | 模运算、欧几里得算法、RSA | 同 |
| 图论 | 图定义、树、匹配、染色、生成树 | 同（CS 173 图论略浅） |
| 计数/组合 | 排列组合、鸽巢原理、容斥原理 | CS 173 较少 |
| Big-O / 渐进 | Big-O/Ω/Θ 记号、递推式 | 同 |
| 形式语言/自动机 | ❌ 不包含 | CS 173 **包含**（DFA、NFA、正则表达式） |
| 概率论 | ✅ 有独立模块 | CS 173 较少涉及 |
| 编程要求 | Python 辅助 | 无编程 |

**资源详情：**

| 项目 | 详情 |
|------|------|
| 平台 | MIT OpenCourseWare（完全免费） |
| 课程页 | [ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015](https://ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015/) |
| 教材 | *Mathematics for Computer Science*（Lehman, Leighton, Meyer，免费 PDF） |
| 视频 | 25 讲完整录像（Fall 2010 版最全） |
| 作业 | 含完整 solution 的 problem sets |
| 考试 | 含答案历史期中/期末 |
| 语言 | 英语 |
| 自估耗时 | 80-120 小时（完整学完） |

**与 CS 173 的核心差异：** MIT 6.042J 多出了概率论模块，但缺少了形式语言/自动机（DFA/NFA/正则表达式）部分。CS 173 的形式语言内容需要另外补充（见下文补充资源）。

---

### 🥈 第二推荐：UIUC 自有资源 — CS 173 公开教材

CS 173 的主要教授 Margaret Fleck 将教材《*Building Blocks for Theoretical Computer Science*》完全免费公开。

| 项目 | 详情 |
|------|------|
| 教材 | [Building Blocks for Theoretical Computer Science](https://mfleck.cs.illinois.edu/building-blocks/)（Fleck 自编，免费电子版/PDF） |
| 版本 | 持续更新中 |
| 配套 | 包含 skills list 和 study problems |
| 课程主页 | [mfleck.cs.illinois.edu/discrete-structures/](https://mfleck.cs.illinois.edu/discrete-structures/) |
| 历年考试 | Grainger 课程网站可找到部分历史 examlet 题目 |
| 语言 | 英语 |

> 📌 **最佳组合**：用 MIT 6.042J 视频 + Fleck 教材，覆盖 CS 173 全部内容（Fleck 教材补上了形式语言部分）。

---

### 🥉 第三推荐：Coursera — Introduction to Discrete Mathematics for Computer Science Specialization（UC San Diego）

| 项目 | 详情 |
|------|------|
| 平台 | Coursera |
| 机构 | University of California, San Diego |
| 课程数 | 5 门子课程组成的 specialization |
| 覆盖内容 | 数学归纳法、组合数学、图论、数论、概率论、数理逻辑 |
| 优点 | 结构化、有证书、Coursera 上评分高（4.5+） |
| 缺点 | 收费（可 audit 免费观看）、视频为主无教材、形式语言部分缺失 |
| 语言 | 英语 |
| 自估耗时 | 60-100 小时 |

---

### 补充资源：形式语言与自动机

CS 173 **独有的自动机/形式语言部分**在大多数离散数学 MOOC 中不覆盖，推荐以下补充：

| 资源 | 说明 |
|------|------|
| **Fleck 教材 Ch. 10-13** | 直接读 Building Blocks 的形式语言章节，最对口 |
| **MIT 18.404J Theory of Computation** | Michael Sipser 讲授，OCW 免费，前几讲覆盖 DFA/NFA/正则表达式 |
| **Easy Theory (YouTube)** | [youtube.com/@EasyTheory](https://youtube.com/@EasyTheory) — DFA/NFA/正则/CFG 视频讲解简洁清晰 |
| **Sipser *Introduction to the Theory of Computation*** | 经典教材，第 1 章覆盖 DFA/NFA/正则表达式 |

---

## 二、CS 225（数据结构）等价课程

### 🥇 第一推荐：UIUC Coursera — Accelerated Computer Science Fundamentals Specialization

**推荐理由：同为 UIUC 出品，主讲人 Wade Fagen 就是在校 CS 225 的主讲教授，课程内容与 CS 225 匹配度最高，使用 C++。**

| 对比维度 | UIUC Coursera | UIUC CS 225 |
|----------|--------------|-------------|
| 执教 | Wade Fagen-Ulmschneider | Wade Fagen（同一人） |
| 编程语言 | C++ | C++ |
| 内存管理 | 指针、栈/堆、new/delete、valgrind | 同 |
| 类与 OOP | 构造函数、析构函数、拷贝语义、继承、模板 | 同 |
| 线性结构 | 数组、链表、栈、队列 | 同 |
| 树 | 二叉树、BST、AVL、B 树、堆 | 同 |
| 哈希表 | 哈希函数、冲突解决 | 同 |
| 图算法 | BFS、DFS、MST、最短路径 | 同 |
| 算法分析 | Big-O、摊还分析 | 同 |
| 排序 | 快排、归并、堆排序 | 同 |
| MP 编程作业 | 每周编程挑战（类似 MP） | 7 个 MP |
| Lab | 部分课程含实验 | 14 个 lab |
| 并查集 | ✅ | ✅ |
| 动态规划 | 较少 | 有 |

**课程结构（3 门子课程）：**

| # | 课程名 | 内容 |
|---|--------|------|
| 1 | **Object-Oriented Data Structures in C++** | C++ 基础、内存模型、类、OOP、模板 |
| 2 | **Ordered Data Structures** | 数组、链表、栈、队列、树、AVL、B 树、堆、算法分析 |
| 3 | **Unordered Data Structures** | 哈希表、并查集、图、最短路径 |

**资源详情：**

| 项目 | 详情 |
|------|------|
| 平台 | Coursera |
| 链接 | [coursera.org/specializations/cs-fundamentals](https://coursera.org/specializations/cs-fundamentals) |
| 评分 | ⭐ 4.7/5（Course 1 有 2,900+ 评价） |
| 费用 | 可单课 audit（免费），证书需付费 |
| 总时长 | ~92 小时（官方估计） |
| 语言 | 英语 + 中文字幕 |
| GitHub 辅助 | `github.com/wadefagen/coursera`（代码示例） |

**与 CS 225 的核心差异：**
- UIUC Coursera 版内容稍精炼（3 门课共约 92h），在校 CS 225 约 120-180h
- 缺少 PhotoMosaic / Flood Fill 等图像主题 MP（这是在校 CS 225 的特色）
- 不包含 CBTF 考试压力（开卷 vs 闭卷机考）
- 更多 C++ 语言教学（在校 CS 225 假设 CS 128 已经打好 C++ 基础）

> 📌 备考 UIUC Online MCS 入学考试的学生，这个 specialization 拿到 B+ 以上可直接满足数据结构前置要求。

---

### 🥈 第二推荐：UC Berkeley CS 61B — Data Structures and Algorithms

**推荐理由：公认的全球最优秀数据结构和算法公开课之一，作业和项目质量极高。**

| 项目 | 详情 |
|------|------|
| 课程页 | [sp24.datastructur.es](https://sp24.datastructur.es/)（Spring 2024 最新） |
| 视频 | YouTube + Bilibili（含中英双语字幕） |
| 教材 | 无强制教材，slides 即课程内容 |
| 语言 | **Java**（不是 C++） |
| 自动批改 | Gradescope 免费 autograder（邀请码 MB7ZPY 或 P5WVGW） |
| 作业 | 14 Labs + 10 Homework + 3 个大型 Projects |
| Proj2（Gitlet） | 公认全 Berkeley 最好的 CS 项目之一，高度推荐 |
| 自估耗时 | 200-400 小时（完整完成所有内容） |
| 费用 | 完全免费 |

**与 CS 225 的核心差异：**
- ⚠️ **使用 Java，不是 C++**。Java 无指针/手动内存管理，这恰是 CS 225 的核心难点之一。
- CS 61B 的项目（尤其是 Gitlet）比 CS 225 的 MP 更深更大。
- CS 61B 包含更多软件工程实践（Git、IntelliJ、模块化设计）。
- CS 61B 的算法覆盖面更广但数据结构实现层面没有 CS 225 那么贴近底层内存。

> 📌 CS 61B 和 CS 225 都是极为优秀的数据结构课，但各自语言不同、侧重点不同。如果目标是提前准备 UIUC CS 225，UIUC Coursera 版更对口；如果追求最好的学习体验，CS 61B 更受推崇。

---

### 🥉 第三推荐：斯坦福 CS166 — Advanced Data Structures

| 项目 | 详情 |
|------|------|
| 课程页 | [web.stanford.edu/class/cs166](https://web.stanford.edu/class/archive/cs/cs166/cs166.1256/) |
| 教授 | Keith Schwarz |
| 等级 | **高级**（假设已掌握基础数据结构） |
| 内容 | 后缀自动机、van Emde Boas 树、持久化数据结构、Fenwick 树、Splay 树等 |
| 视频 | ❌ 无官方视频（仅 slides + handouts） |
| 推荐度 | 适合学完 CS 225 之后的进阶，**不适合替代** CS 225 |

---

### 🔹 备选推荐

| 课程 | 平台 | 语言 | 适合场景 |
|------|------|------|----------|
| **Princeton Algorithms I & II**（Sedgewick） | Coursera | Java | 追求算法深度（非数据结构实现），全球公认算法课第一 |
| **MIT 6.006 Introduction to Algorithms** | MIT OCW | Python | 算法视角，适合 Python 背景的学习者 |
| **Stanford CS106B** | Stanford 网站 | C++ | Stanford 版数据结构入门，C++ 语言，但公开资料不完整 |
| **UIUC CS 225 课程网站（公开）** | [courses.grainger.illinois.edu/cs225](https://courses.grainger.illinois.edu/cs225/) | C++ | 历年 slides、MP 描述、考试大纲可直接查看（不含 autograder） |

---

## 三、最佳学习路径推荐

### 路径 A：提前自学 CS 173（大一秋季进行）

```
第 1-4 周：MIT 6.042J 逻辑与证明 + Fleck 教材 Ch. 1-3
第 5-8 周：MIT 6.042J 数论与图论 + Fleck 教材 Ch. 4-7
第 9-12 周：MIT 6.042J Big-O/递推 + Fleck 教材 Ch. 8-13（形式语言）
同步做：每周至少 3-5 道证明题
```

### 路径 B：提前自学 CS 225（大一暑假/寒假进行）

```
前置检查：已完成 CS 128 或同等水平的 C++ 能力
第 1-2 周：UIUC Coursera Course 1（OOP in C++）
第 3-5 周：UIUC Coursera Course 2（Ordered Data Structures）
第 6-7 周：UIUC Coursera Course 3（Unordered Data Structures）
第 8 周：补充做 LeetCode Easy/Medium 数据结构题
```

### 路径 C：省钱免费方案

| 课程 | 免费资源 | 覆盖度 |
|------|----------|--------|
| CS 173 | **MIT 6.042J 视频 + Fleck 教材 + Easy Theory YouTube** | 95% |
| CS 225 | **CS 225 公开 slides + LeetCode + GitHub MP 描述 + UC Berkeley CS 61B（Java 补充数据结构理解）** | 80%（缺 autograder） |

---

## 四、各课程与 UIUC ICT 的相关性

| 课程 | CS 173 匹配度 | CS 225 匹配度 | 直接帮助 ICT？ |
|------|:--:|:--:|------|
| **MIT 6.042J** (OCW) | ⭐⭐⭐⭐⭐ | — | 打好离散数学基础，提升 CS 173 grade |
| **UIUC Coursera** (Fagen) | — | ⭐⭐⭐⭐⭐ | 提前掌握 C++ 数据结构，提升 CS 225 grade |
| **UC Berkeley CS 61B** | — | ⭐⭐⭐⭐（Java） | 数据结构概念同步，但 C++ 内存管理部分需另外补 |
| **Princeton Algorithms** (Sedgewick) | — | ⭐⭐⭐（算法视角） | 提升算法思维，对 CS 225 考试有帮助 |
| **Fleck 教材** (Building Blocks) | ⭐⭐⭐⭐⭐ | — | 直接使用 CS 173 教授编写的教材，无需适配 |

---

## 五、一句话总结

- **CS 173 替代** → **MIT 6.042J**（视频 + 教材）+ **Fleck Building Blocks**（补形式语言）。完全免费，匹配度 95%。
- **CS 225 替代** → **UIUC Coursera Accelerated CS Fundamentals**（同一教授 Wade Fagen，同用 C++，匹配度 90%）。可 audit 免费观看。
- **挑战更高水平** → **UC Berkeley CS 61B**（Java，项目更深、全球公认最好的数据结构课之一）。

> 提前自学这些课的目的不是为了替代 UIUC 的学分（ICT 只认你在 UIUC 修的 CS 173/225 成绩），而是为了**让你在真正上这两门课时轻松拿 B+ 以上**。所以建议在大一春修 CS 173 之前（大一秋），用 MIT 6.042J 把证明能力和数学思维先打好底；在大二秋修 CS 225 之前（暑假），用 UIUC Coursera 提前过一遍 C++ 数据结构的核心概念和代码实现。
