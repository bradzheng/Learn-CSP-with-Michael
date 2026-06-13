# CS 225 (Data Structures) 深度解析

> 调研日期: 2026-06-12 | 目标: 为转入 CS+GGIS 做前置准备 (需 B+)

---

## 一、CS 225 是什么？

**CS 225 — Data Structures** 是 UIUC Siebel School of Computing and Data Science 的数据结构核心课程，也是全校公认的 **"gatekeeper" 课**——它是几乎所有 CS 300+ 课程的前置要求。

- **编程语言**: C++ (从零开始教 C++，但要求有编程基础)
- **先修要求**: CS 128 (或 CS 126) + CS 173 (或 MATH 213)
- **主讲教授**: Wade Fagen-Ulmschneider (Teaching Associate Professor)
- **课程网站 (每个学期公开)**: https://courses.grainger.illinois.edu/cs225/

> ⚠️ 对转入 CS+GGIS 来说，CS 225 **和 CS 173 一样需要 B+ 或以上**，是最关键的两道门槛之一。

---

## 二、教学内容全览

### 课程节奏总览

```
Week  1-3:  C++ Crash Course (从零上手 C++)
Week  3-5:  Linear Structures (链表、栈、队列)
Week  5-9:  Trees (BST、AVL、B-Tree、kd-Tree、Huffman)
Week  9-10: Heaps & Priority Queues (堆与优先队列)
Week 10-11: Hashing (哈希表)
Week 12-15: Graphs + Disjoint Sets (图论 + 并查集)
```

### 📘 模块一：C++ Crash Course (前 3 周)

前 1/4 学期用来从零上手 C++，内容紧凑密集：

| 主题 | 具体内容 |
|------|---------|
| **内存模型** | Stack vs Heap，作用域与生命周期 |
| **指针与引用** | `*`, `&`, `->`, 动态内存分配 (`new`/`delete`) |
| **类的设计** | 构造函数、析构函数、拷贝构造函数、拷贝赋值运算符 |
| **Rule of Three** | 三大件: destructor, copy constructor, copy assignment operator |
| **模板** | `template <typename T>`，泛型编程 |
| **继承** | 基类、派生类、虚函数 (`virtual`) |
| **迭代器** | `begin()`, `end()`, `operator++`, `operator*`, `operator!=` |
| **STL 基础** | `vector`, `list`, `stack`, `queue` 等标准库容器使用 |

> 🎯 **自学建议**: 如果你暑假提前学 C++，前 3 周会轻松很多。

### 🔗 模块二：线性结构 (Week 3-5)

| 数据结构 | 重点内容 |
|---------|---------|
| **Singly Linked List** | 单向链表，插入/删除/查找 |
| **Doubly Linked List** | 双向链表，尾指针优化 |
| **Skip List** | 跳表 (多层链表，概率性平衡) |
| **Stack (栈)** | LIFO, `push`/`pop`, 数组 vs 链表实现 |
| **Queue (队列)** | FIFO, `enqueue`/`dequeue`, 环形数组实现 |

**复杂度对比**: Unsorted Array vs Sorted Array vs Unsorted List vs Sorted List

### 🌳 模块三：树 (Week 5-9)

这是 CS 225 的 **核心篇幅**，也是难度最大的部分：

| 数据结构 | 重点内容 |
|---------|---------|
| **Binary Tree (二叉树)** | 前序/中序/后序遍历，BFS，DFS，递归 |
| **Binary Search Tree (BST)** | 查找、插入、删除、前驱后继 (IOP) |
| **AVL Tree** | 自平衡 BST，左旋/右旋/LR-RL，`O(log n)` 操作，**证明高度平衡** |
| **B-Tree** | 多路搜索树，阶数 m，分裂与合并 |
| **kd-Tree** | k 维空间划分，最近邻搜索 (用于 PhotoMosaic MP) |
| **Huffman Encoding Tree** | 前缀编码，无损压缩 |

> 最常见的挂科原因: AVL 旋转搞不清、B-Tree 分裂写不对。

### 📊 模块四：堆与优先队列 (Week 9-10)

| 主题 | 具体内容 |
|------|---------|
| **Binary Heap** | 完全二叉树，数组表示 (`A[2i]`, `A[2i+1]`) |
| **Heap Operations** | `push`, `pop`, `heapify`, `increaseKey` |
| **Priority Queue** | 基于堆的优先队列实现 |
| **Heap Sort** | 堆排序 |

### 🔑 模块五：哈希表 (Week 10-11)

| 主题 | 具体内容 |
|------|---------|
| **Hash Functions** | 哈希函数设计 (整数/字符串) |
| **Compression** | 键 → 数组下标的映射 |
| **Separate Chaining** | 拉链法 (每个桶一个链表) |
| **Open Addressing** | 线性探测、二次探测、双重哈希 |
| **Rehashing** | 扩容 + 重哈希，负载因子 (load factor) |
| **Cuckoo Hashing** | 布谷鸟哈希 (较新内容) |

### 🕸️ 模块六：图论 + 并查集 (Week 12-15)

| 主题 | 具体内容 |
|------|---------|
| **Graph 基础** | `G = (V, E)`, 度、路径、环、连通分量 |
| **表示方法** | 邻接矩阵 vs 邻接表 |
| **BFS** | 广度优先遍历，最短路径 (无权图) |
| **DFS** | 深度优先遍历，拓扑排序 |
| **Minimum Spanning Tree** | Kruskal 算法, Prim 算法 |
| **Shortest Path** | Dijkstra 算法 (单源最短路径) |
| **Disjoint Sets (Union-Find)** | 按秩合并、路径压缩，几乎 `O(1)` 操作 |

---

## 三、Machine Problems (编程大作业)

CS 225 有 **7 个 MP**，占总分很大比重。这是它比一般数据结构的课更重的地方：

| MP | 名称 | 核心知识点 | 总代码量 |
|----|------|-----------|---------|
| **MP1** | Image Manipulation | C++ 基础，像素操作 | ~100 行 |
| **MP2** | Stickers | 图像合成，类设计 | ~150 行 |
| **MP3** | Lists | 链表实现 | ~200 行 |
| **MP4** | Flood Fill | BFS/DFS 遍历，递归 | ~250 行 |
| **MP5** | PhotoMosaic 🌟 | **kd-Tree, 最近邻搜索** | ~400 行 |
| **MP6** | (Debugging) | GDB 调试训练 | — |
| **MP7** | Mazes 🌟 | **Disjoint Sets + BFS** | ~300 行 |

> 🌟 MP5 和 MP7 是 CS 225 的"看家项目"，面试时经常被提到。

---

## 四、最接近的公开课推荐

### 🥇 UIUC Coursera — Accelerated CS Fundamentals 系列

| 项目 | 内容 |
|------|------|
| **平台** | Coursera |
| **讲师** | **Wade Fagen-Ulmschneider** (和 CS 225 同一教授！) |
| **系列课程 (3 门)** | ① Object-Oriented Data Structures in C++ → ② Ordered Data Structures → ③ Unordered Data Structures |
| **与 CS 225 相似度** | ⭐⭐⭐⭐⭐ **完全一致** — 就是 Wade 将 CS 225 浓缩为在线版 |
| **价格** | 可免费旁听 (Audit)，证书需付费 |
| **链接** | Coursera 搜索 "Accelerated Computer Science Fundamentals" |

**推荐理由**: **同一位教授**把 CS 225 的核心内容录成了这三门课程。暑假提前学完 ≈ 提前拿到 CS 225 的完整教学内容。

---

### 🥈 Princeton — Algorithms Part I & II (Coursera)

| 项目 | 内容 |
|------|------|
| **讲师** | Robert Sedgewick (《Algorithms, 4th Ed》作者) |
| **语言** | Java (但原理相同) |
| **评分** | ⭐ 4.9 / 12,000+ 评价 — **Coursera 最高分课程之一** |
| **与 CS 225 相似度** | ⭐⭐⭐⭐ |
| **价格** | **免费旁听** |
| **链接** | https://www.coursera.org/learn/algorithms-part1 |

**推荐理由**: 学术上最严谨的数据结构和算法在线课程，Sedgewick 是图灵奖级别的教学。虽然用 Java，但数据结构的原理和 CS 225 高度重叠。

---

### 🥉 其他推荐

| 课程 | 平台 | 语言 | 特点 |
|------|------|------|------|
| **Stanford CS106B** | 免费/YouTube | C++ | 斯坦福的数据结构课，与 CS 225 内容和语言最接近 |
| **MIT 6.006 — Intro to Algorithms** | MIT OCW 免费 | Python | 算法方面更深，数据结构的覆盖面不如 CS 225 |
| **UC San Diego DSA Specialization** | Coursera | C++/Java/Python | 覆盖面最广，但深度不如 Princeton 和 UIUC |
| **Abdul Bari — DSA Mastery** | Udemy (~$15) | 伪代码 | 视觉效果最好的教学，适合视觉学习者 |
| **freeCodeCamp DSA** | YouTube 免费 | JavaScript | 最入门，适合完全没有 DS 基础时热身 |

### 对比总结

| 课程 | 与 CS 225 相似度 | 深度 | 价格 | 最适合... |
|------|----------------|------|------|----------|
| **UIUC Coursera (Wade)** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | 免费 | **完全相同的内容，最推荐** |
| **Princeton Algorithms** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | 免费 | 深入算法分析 |
| **Stanford CS106B** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | 免费 | C++ 数据结构实战 |
| **MIT 6.006** | ⭐⭐⭐ | ⭐⭐⭐⭐⭐ | 免费 | 算法理论深度 |
| **Abdul Bari** | ⭐⭐⭐ | ⭐⭐⭐⭐ | ~$15 | 可视化理解 |

---

## 五、如何获取 CS 225 往年考题

### 官方公开的考题（免费，无需登录）

UIUC 课程网站多年来公开了大量往年期中/期末考题和解答：

### 📂 往年考题合集

| 学期 | 内容 | 链接 |
|------|------|------|
| **Fall 2018** | 多个 practice exams 含解答 | [fa2018/exams/practice/](https://courses.grainger.illinois.edu/cs225/fa2018/exams/practice/) |
| **Fall 2017** | Sample exams + 老题 (含 Spring/Summer 历年) | [fa2017/exams/practice/](https://courses.grainger.illinois.edu/cs225/fa2017/exams/practice/) |
| **Spring 2018** | 更多 practice exams + 期末 | [sp2018/exams/practice/](https://courses.physics.illinois.edu/cs225/sp2018/exams/practice/) |

### 📄 具体的题目文件列表

来自 Fall 2018 的 practice 目录（含解答）：

| 文件 | 覆盖内容 |
|------|---------|
| `su05mt2.pdf` + `su05mt2soln.pdf` | 链表、跳表、树、BST、BFS 队列 |
| `fa09final.pdf` | 图 (DFS/BFS)、B-Tree、堆、并查集、跳表、优先队列 |
| `sp10final.pdf` | 哈希表、B-Tree、堆、Dijkstra、MST、DFS、C++ 内存管理 |

来自 Fall 2017 的 practice 目录：

| 文件 | 覆盖内容 |
|------|---------|
| `sample1mt2.pdf` | BST 插入分析、堆 IncreasePriority、AVL/B-Tree/Red-Black 理论 |
| `sample2mt3soln.pdf` (含解答) | Kruskal、Dijkstra、DFS 拓扑排序、Prim、BFS 生成树 |
| `sp12mt2.pdf` | AVL 旋转、二叉树性质、四叉树、Flood Fill、并查集、哈希 |
| `fa10mt2.pdf` | 栈/队列实现、BST/B-Tree/AVL 分析、四叉树 |
| `sp14mt2.pdf` | 栈/队列、BST、B-Tree、四叉树 |

### 🔍 更老的学期（更多题目）

UIUC 课程网站 URL 模式中隐藏着大量历史试题。你可以通过修改 URL 来探索:

```
https://courses.grainger.illinois.edu/cs225/{term}/exams/
# 例如: fa2007, sp2010, fa2012, sp2014, sp2016, fa2017, fa2018, sp2018, sp2019...
```

或者访问 `practice/` 子目录:
```
https://courses.grainger.illinois.edu/cs225/fa2017/exams/practice/
```

> 不少老题带解答 (`soln`)，可以直接自测后核对。

### 📖 其他来源

| 来源 | 内容 | 链接/说明 |
|------|------|----------|
| **CS 225 期末考试复习 (GitHub)** | 一份非常完整的期末复习笔记 | 搜索 `pkgamma/cs225-final-review` |
| **CS 225 课程笔记 (GitHub)** | 中文 + 英文笔记汇总 | 搜索 `ToughMamba/data-structures-uiuc` |
| **Numerade** | CS 225 配套视频讲解 | https://www.numerade.com/notes/directory/school/2893/courses/220669/files/1516391 |
| **Studocu** | Fall 2007 Midterm 1 含解答 | https://www.studocu.com/en-ie/document/university-of-illinois-at-urbana-champaign/data-structures/fall-07-midterm-1soln/21086355 |
| **Reddit r/UIUC** | 学生经验分享，搜索 "CS 225 exam" | https://www.reddit.com/r/UIUC/ |

### 最佳刷题策略

1. **第一站**: Fall 2018 [practice 目录](https://courses.grainger.illinois.edu/cs225/fa2018/exams/practice/) — 找 `su05mt2` 和 `fa09final` 带解答的
2. **第二站**: Fall 2017 [practice 目录](https://courses.grainger.illinois.edu/cs225/fa2017/exams/practice/) — 刷 `sample1mt2`, `sample2mt3`, `sp12mt2`
3. **第三站**: 找最新学期的 `exams/` 目录探索 (尝试 `fa2024`, `sp2025`, `su2025`)
4. **第四站**: GitHub 上的 `cs225-final-review` 仓库，系统性复习

---

## 六、提前自学计划 (2026 年暑假 — 大一)

### 目标：2028 Spring 修 CS 225 并拿到 A

| 阶段 | 时间 | 内容 | 资源 |
|------|------|------|------|
| **Phase 0** | 暑假 | **C++ 基础特训** | 学 C++ 基础 (指针、类、模板) |
| **Phase 1** | 暑假 | 线性结构 + 复杂度分析 | UIUC Coursera: Object-Oriented DS in C++ |
| **Phase 2** | 暑假 | 树 + AVL + B-Tree | UIUC Coursera: Ordered Data Structures |
| **Phase 3** | 大一下 | 哈希 + 图 + 并查集 | UIUC Coursera: Unordered Data Structures |
| **考前** | — | 刷往年题 | 见上方考题合集 |

### 关键建议

1. **C++ 是最大坎**: CS 225 前 3 周会快速过 C++，零基础会非常吃力。**暑假提前学 C++ 是最高 ROI 的投入**
2. **MP5 和 MP7 最耗时**: kd-Tree 和 Maze 项目各需要 20+ 小时，请提前规划时间
3. **数学要求低于 CS 173**: CS 225 更偏实现而不是证明，但 Big-O 分析需要数学思维
4. **与 CS 173 可并行**: CS 225 和 CS 173 **互相不构成先修关系**，可以同一学期修

---

## 七、CS 225 在关键路径中的位置

```
CS 124 → CS 128 → CS 225 ←→ CS 173 (可并行)
                      ↓
            CS 300/400 级课程
```

- **CS 225 是几乎所有 CS 300+ 课程的前置**（包括 CS 341 System Programming, CS 374 Algorithms, CS 440 AI 等）
- CS 225 和 CS 173 可以**同时修**，互相不构成先修
- 对转入 CS+GGIS: 需要 **B+ 或以上**
- 建议时间线: 大一修 CS 124/128 → 大二 Fall 或 Spring 修 CS 225

---

## 关键资源汇总

| 资源 | 链接 |
|------|------|
| CS 225 官网 (当前学期) | https://courses.grainger.illinois.edu/cs225/ |
| UIUC Coursera (同一教授) | Coursera 搜索 "Accelerated Computer Science Fundamentals" |
| Princeton Algorithms Part I | https://www.coursera.org/learn/algorithms-part1 |
| Fall 2018 Practice Exams | https://courses.grainger.illinois.edu/cs225/fa2018/exams/practice/ |
| Fall 2017 Practice Exams | https://courses.grainger.illinois.edu/cs225/fa2017/exams/practice/ |
| Spring 2018 Practice Exams | https://courses.physics.illinois.edu/cs225/sp2018/exams/practice/ |
| CS 225 Final Review (GitHub) | 搜索 `pkgamma/cs225-final-review` |
| CS 225 笔记 (GitHub) | 搜索 `ToughMamba/data-structures-uiuc` / `ChendiDotLin/CS225-Data-Structure` |
| 参考教材 (可选) | *Data Structures and Algorithm Analysis in C++* — Mark Allen Weiss |
| Stanford CS106B | YouTube 搜索 "Stanford CS106B" |
| C++ 自学推荐: | learncpp.com (免费 / 极高质量) |

> ⚠️ 所有 courses.grainger.illinois.edu 链接对公众开放，无需 NetID。
