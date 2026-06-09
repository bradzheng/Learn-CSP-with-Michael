# UIUC CS 124 + CS 128 课程详解

> 适用对象：UIUC CS+GGIS ICT 转专业规划中的大一新生
>
> 更新日期：2025 年 6 月（基于 2024-2026 学年课程信息）
>
> 两门课是 CS 核心序列的起点，CS 128 是 CS 173/225 的前置课。

---

## CS 124 — 计算机科学导论 I（Introduction to Computer Science I）

### 基本信息

| 项目 | 详情 |
|------|------|
| 学分 | 3 |
| 前置课 | 3 年高中数学 或 MATH 112 |
| 讲授教授 | Geoffrey Challen |
| 可选语言 | **Kotlin**（推荐）或 Java |
| 授课形式 | 完全在线（异步互动课程） |
| 课程网站 | [cs124.org](https://www.cs124.org) |
| 公开资料 | [learncs.online](https://www.learncs.online)（全部课程材料免费开放） |

### 课程内容

| 模块 | 主题 |
|------|------|
| 基础 | 变量、类型、运算符、输入输出 |
| 控制流 | 条件语句、循环 |
| 函数 | 函数定义与调用、参数、返回值、递归 |
| 数据结构入门 | 数组、列表、Map、Set、Collection |
| 字符串 | 字符串操作与处理 |
| 面向对象 | 类与构造函数、对象、方法 |
| 高级 OOP | 多态、继承、接口、异常处理 |
| 数据结构进阶 | 链表、树、递归 |
| 算法入门 | 排序算法 |
| 工具 | 库的使用、Git 基础、Android Studio |

### 考试/评估形式

| 组成部分 | 详情 | 容错 |
|----------|------|------|
| **每日作业** | 每节课后的小编程题/调试题，在线完成 | 允许 **drop 9 次** |
| **每周测验**（15 次）| CBTF（Computer-Based Testing Facility），含选择题、调试题、编程题 | 允许 **drop 3 次**，不调分 |
| **最终项目（MP）** | Android 应用开发项目，约 3 个 checkpoint，含 Git workflow + Android Studio | **不可 drop**，必须按时完成 |

### 评分与等级

- 具体权重未公开，但每日作业 + quiz + MP 构成最终总评
- 标准 UIUC 等级线（与 CS 128 相似）：
  - 93% → A，90% → A-，87% → B+，83% → B，80% → B-
  - 70% → C-，60% → D

### 难度评估

| 维度 | 评价 |
|------|------|
| 内容难度 | ⭐⭐（真正零基础友好） |
| 学习曲线 | ⭐⭐⭐（前 2/3 平缓，**最后 1/3 急剧变陡**） |
| workload | ⭐⭐（每周 4-8h，含每日作业 + quiz 复习） |
| 拿 A 难度 | ⭐⭐⭐（需要持续不掉链子，MP 不能崩） |
| 特殊挑战 | 学期末 MP + quiz 重叠期压力大 |

### 关键提醒

1. **适合零基础**——从变量类型讲起，对新手友好
2. **别被开头骗了**——后 1/3（继承/多态/链表/树/递归）难度跳跃明显，正是这里淘汰不认真的人
3. **Android MP 别拖**——到最后几周赶工很痛苦，tutoring office hours 会排长队
4. **有 AP CS A 5 分 + 编程经验** → 可直接考 **proficiency exam**，跳过此课，直接进入 CS 128
5. **公开资料 learncs.online 可提前自学**——如果你入学前暑假有 2-3 周空闲，把全部课程过一遍，CS 124 基本就稳了

---

## CS 128 — 计算机科学导论 II（Introduction to Computer Science II）

### 基本信息

| 项目 | 详情 |
|------|------|
| 学分 | 3 |
| 前置课 | CS 124 或 ECE 220 |
| 讲授教授 | Michael R. Nowak |
| 语言 | **C++** |
| 授课形式 | 录播视频 + weekly recitation + 在线互动 lesson |
| 课程网站 | [cs128.org](https://cs128.org) |
| 平台 | PrairieLearn（独立于 NetID 的 CS 128 专用账号） |

### 课程内容

| 模块 | 主题 |
|------|------|
| C++ 基础 | 编译流程、Unix 环境、项目组织、头文件 |
| 内存管理 | 栈/堆、指针、引用、动态内存分配、new/delete |
| 调试工具 | **GDB**（调试图）、**Valgrind**（内存泄漏检测） |
| 面向对象 | 类、构造函数/析构函数、封装、接口设计 |
| 算法实现 | 从规范编写算法、分解问题 |
| 测试 | 用 **Catch2** 框架编写单元测试 |
| 代码质量 | 模块化设计、规范编程、代码风格与规范性 |

### Machine Problems（MPs）— 编程作业

**Spring 2026 版（约 7 个 MP）**

| MP | 内容方向 | 说明 |
|----|----------|------|
| MP0 | Pre-flight（热身） | 环境配置、编译流程确认，10 分 |
| MP1 | C++ 基础 | 输入输出、函数、控制流 |
| MP2 | 指针与内存 | 动态分配、指针操作、Valgrind |
| MP3 | 类与对象 | OOP 设计、构造函数、接口 |
| MP4 | 容器与模板 | 模板类、迭代器 |
| MP5 | 链表/树等结构 | 自定义数据结构实现 |
| MP6 | 综合项目 | 整合前述所有技能 |

- 每个 MP 100 分（MP0 除外），**不允许合作**，视同考试
- **自动批改**（PrairieLearn），不编译 = 0 分
- 可迟交（折减后 67%-70% 计分）
- 2 次"无理由迟交豁免"（late penalty waiver）
- 提前交（周五前）→ +5% extra credit
- ⚠️ **硬门槛**：**每个 MP 至少拿到 67%**，否则总成绩封顶 B+

### 考试形式

| 项目 | 详情 |
|------|------|
| **测验** | 在 **CBTF** 进行，含选择题 + 编程题 + 调试题 |
| 频率 | 约每 2-3 周一次 |
| 编程题 | **不限尝试次数**（50 分钟限时内） |
| 性质 | **累计型**（从开学第一天的内容覆盖到你考试前一天） |
| 容错 | 仅 **drop 1 个**最低分 |
| 追赶机制 | 若 Quiz N+1 比 Quiz N 分高，Quiz N 自动调整为两者平均分 |
| 备考 | **无模拟题**——官方说"graded lessons + recitation + MP 就是你的练习" |

> ⚠️ 学生普遍反馈：quiz 常为**单道综合题决定 100% 分数**，一个小 bug 就是 0 分，压力极大。

### 评分权重

#### Spring 2026（最新）

| 类别 | 权重 |
|------|------|
| **Quizzes** | **60%** |
| Machine Problems (MPs) | 25% |
| Graded Lessons | 10% |
| Recitation | 5% |

#### Spring 2024（对比）

| 类别 | 权重 |
|------|------|
| Machine Problems (MPs) | 55% |
| Quizzes | 25% |
| Graded Lessons | 10% |
| Recitation | 10% |

> 📌 权重每学期可能调整。2026 版将 quiz 拉到 60%，压力更大。

### Grade Scale

| 分数 | ≥93% | ≥90% | ≥87% | ≥83% | ≥80% | ≥77% | ≥73% | ≥70% | ≥60% |
|------|------|------|------|------|------|------|------|------|------|
| 等级 | A | A- | B+ | B | B- | C+ | C | C- | D |

- 百分比是**截断**不是四舍五入
- 低于 60% = F

### 难度评估

| 维度 | 评价 |
|------|------|
| 内容难度 | ⭐⭐⭐⭐（C++ 内存管理 + 指针 + OOP，对新手不友好） |
| workload | ⭐⭐⭐（每周 6-12h，MP 耗时但可管理） |
| 考试压力 | ⭐⭐⭐⭐⭐（quiz 占 60% 且 all-or-nothing 单题制） |
| 拿 B+ 难度 | ⭐⭐⭐⭐（quiz 是关键，一次崩了可能跌出 B+） |
| 教授难度 | 评分 4.1/5 难度，~20% would take again |

### 学生真实反馈

- "CS 128 是从 CS 124 跳到 CS 225 中间的一大步"
- "quiz 全或无，一道编程题全部决定，小失误 = 0 分"
- "lecture 视频比较无聊，靠 cs128.org 和 learncpp.com 自学效果更好"
- "MP 本身不难但描述又长又复杂，读懂题目比实现更难"
- "提前交 MP 有 5% extra credit，积少成多"

### 关键提醒

1. **C++ 指针和内存管理是核心难点**，这概念在后续 CS 225 里继续深入
2. **Quiz 是成绩命脉**（2026 版占 60%），每周必须复习，不能堆
3. **MP 的 67% 硬门槛不能忽视**，任何一个 MP 低于 67%，总成绩封顶 B+
4. **无模拟题** → 把 graded lessons、MP、recitation 当备考资料，反复练
5. **Valgrind/GDB 必须熟练**——debug 工具是 MP 和 quiz 的必备技能
6. **可以考虑 proficiency exam**——HKN 称这是"最难的一门 proficiency"但**失败了无惩罚**，尝试一下至少能提前掌握课程范围
7. main 学习资源：**cs128.org + learncpp.com + cppreference.com**

---

## CS 124 vs CS 128 对比

| | CS 124 | CS 128 |
|------|------|------|
| 学分 | 3 | 3 |
| 语言 | Kotlin（推荐）/ Java | **C++** |
| 类型 | 编程入门 | 编程进阶 + 内存管理 |
| 授课 | 100% 在线异步 | 在线视频 + recitation |
| 高频考核 | 每日作业 | Graded Lessons |
| 大考 | 15 次 CBTF quizz（drop 3） | 约 7-9 次 CBTF quizz（drop 1） |
| 编程作业 | 1 个 Android MP | 6-7 个 C++ MP |
| 最大挑战 | 期末 MP + quiz 重叠 | Quiz 60% 权重 + all-or-nothing 单题制 |
| 公开资料 | ✅ learncs.online 全部免费 | ❌ 仅课程网站有限公开 |
| ICT 要求 | 无显式要求（但为 128 前置）| 必须 ≥ B-（CS 173 的前置条件之一） |

---

## 三、网上相近公开课程推荐

### CS 124 等价课程

#### 🥇 第一推荐：UIUC 自有 — learncs.online（免费）

| 项目 | 详情 |
|------|------|
| 来源 | 就是 CS 124 教授 Geoffrey Challen 制作的公开版 |
| 链接 | [learncs.online](https://www.learncs.online) |
| 语言 | 可选 Kotlin 或 Java |
| 内容 | 与在校 CS 124 **完全一致的每日互动课程 + 习题** |
| 不包含 | 每周 CBTF quiz、Android MP、助教支持 |
| 适用 | 提前预习的首选——内容 100% 对应，零成本 |

> 📌 入学前暑假花 2-3 周过完全部课程，CS 124 基本稳拿 A。

#### 🥈 第二推荐：Harvard CS50 — Introduction to Computer Science

| 项目 | 详情 |
|------|------|
| 平台 | edX / Harvard OCW / YouTube |
| 链接 | [cs50.harvard.edu](https://cs50.harvard.edu) |
| 语言 | C、Python、SQL、HTML/CSS/JavaScript |
| 视频 | ✅ 完整高质量讲座 |
| 作业 | ✅ 含自动批改的 problem sets |
| 适合 | 零基础全面入门 |
| 与 CS 124 差异 | CS50 多语言多范式，比 CS 124 更广但不用 Kotlin |

#### 🥉 备选

| 课程 | 平台 | 语言 | 说明 |
|------|------|------|------|
| **JetBrains Academy: Kotlin Basics** | JetBrains Academy | Kotlin | Kotlin 专项学习，与 CS 124 语言一致 |
| **Codecademy: Learn Java** | Codecademy | Java | Java 入门，CS 124 的 Java 选项偏好者 |
| **MIT 6.100A / 6.0001** | MIT OCW | Python | MIT 经典入门课，语言不同但 CS 思维培养通用 |

---

### CS 128 等价课程

#### 🥇 第一推荐：learncpp.com（免费 + 最贴合 CS 128 内容）

| 项目 | 详情 |
|------|------|
| 链接 | [learncpp.com](https://www.learncpp.com) |
| 费用 | 完全免费 |
| 内容 | C++ 从零到中级，层层递进 |
| 覆盖 | 编译、变量、函数、指针、引用、内存管理、类、OOP、模板、STL、异常、调试 |
| 特色 | 含大量代码示例和章节测验 |
| 与 CS 128 匹配度 | ⭐⭐⭐⭐⭐（CS 128 学生和 HKN Wiki **点名推荐**） |

#### 🥈 第二推荐：UIUC Coursera — Object-Oriented Data Structures in C++ (Course 1)

| 项目 | 详情 |
|------|------|
| 平台 | Coursera |
| 链接 | [coursera.org/learn/cs-fundamentals-1](https://www.coursera.org/learn/cs-fundamentals-1) |
| 讲师 | Wade Fagen-Ulmschneider（就是 CS 225 教授） |
| 内容 | C++ 基础、内存模型、类、OOP、模板、继承 |
| 与 CS 128 关系 | 与 CS 128 后半部分高度重合，且是 CS 225 的预习 |
| 费用 | 可 audit 免费观看 |
| 时间 | ~4 周（Course 1 部分） |

> 📌 这是 **一石二鸟之选**：学完直接衔接 CS 225，同时覆盖 CS 128 核心内容。

#### 🥉 第三推荐：cppreference.com（CS 128 官推参考资源）

| 项目 | 详情 |
|------|------|
| 链接 | [cppreference.com](https://cppreference.com) |
| 类型 | C++ 语言/标准库的权威参考文档 |
| 适用 | 查询语法、STL 用法、语言特性 |
| 配合 | 与 learncpp.com 搭配使用（learncpp 学 + cppreference 查） |

#### 🔹 备选

| 课程 | 平台 | 说明 |
|------|------|------|
| **Codecademy: Learn C++** | Codecademy | 交互式 C++ 入门，适合完全零 C++ 基础 |
| **CS50 Week 1-5（C 部分）** | edX / YouTube | 学 C 语言指针/内存，与 C++ 内存管理相通 |
| **YouTube: The Cherno C++ Series** | YouTube | 高质量 C++ 教程，对指针/OOP/构造/析构讲解深入 |
| ***C++ Distilled*** (Ira Pohl) | 纸质书 | 紧凑的 C++ 参考书，CS 128 HKN Wiki 推荐 |

---

## 四、往年考试题目获取渠道

### CS 124 渠道

| 渠道 | 类型 | 获取方式 |
|------|------|----------|
| **[learncs.online](https://www.learncs.online)** | 每日课后习题 | 完全免费开放，与在校 quiz 风格高度相似 |
| **HKN Wiki — CS 124** | 课程攻略 + Proficiency 备考指导 | [wiki.hkn.illinois.edu/cs124](https://wiki.hkn.illinois.edu/course%20wiki/cs%20course%20offerings/cs124/) |
| **[cs124.org/practice](https://www.cs124.org/practice/)** | 官方在线练习题（Java/Kotlin 可选）| 免费开放，可直接在线刷题 |
| **校园社群** | 往届学生笔记/quiz 回忆 | UIUC CS 相关的 Discord 群、微信群、Reddit r/UIUC |
| **CourseHero / Chegg** | 往届 homework/MP 参考 | 需付费，注意学术诚信政策 |
| **Tutoring office hours** | 助教答疑 | 在校生可以带着问题直接问，比找 past paper 更有效 |

### CS 128 渠道

| 渠道 | 类型 | 获取方式 |
|------|------|----------|
| **[cs128.org](https://cs128.org)** | 课程大纲 + Graded Lessons | 官方课程网站，lesson 内容可直接查阅 |
| **HKN Wiki — CS 128** | 课程攻略 + Proficiency 备考指导 | [wiki.hkn.illinois.edu/cs128](https://wiki.hkn.illinois.edu/proficiency%20exams/cs128/) |
| **GitHub** | 部分往届 MP 描述/template 代码 | 搜索 `UIUC CS128` 或 `illinois-cs-128`，注意很多 repo 不是官方的 |
| **[learncpp.com](https://www.learncpp.com)** | 章节测验 | 覆盖面与 CS 128 quiz 高度重合 |
| **校园社群** | 往届 quiz 回忆、MP 攻略 | UIUC CS Discord/微信群/Reddit r/UIUC |
| **PrairieLearn** | 课程内 practice（如有） | 仅在校生可访问，注意 quiz **无官方模拟题** |
| **Office Hours / TA** | 答疑与方向指导 | 带具体问题去问，比漫无目的地搜 past paper 更高效 |

### ⚠️ 重要注意事项

1. **CS 128 没有公开的历年真题**——quiz 通过 CBTF + PrairieLearn 在线进行，题目不公开。官方立场是"graded lessons + MP + recitation 就是最好的备考材料"。

2. **不要依赖第三方付费资料**（CourseHero/Chegg 上的 past paper）——CS 128 每学期调整 quiz 题型和内容，旧题参考价值有限。更关键的是，使用未经授权的 past paper 可能违反学术诚信。

3. **最有效的备考方式**：
   - CS 124：直接刷 learncs.online 所有课后题
   - CS 128：learncpp.com 全站学习 + 自己用 Catch2 写单元测试练手 + 把每个 MP 吃透
   - 两门课都去 office hours，比任何 past paper 都有用

---

## 五、给 CS+GGIS 转专业新生的策略

### 课程进度与 ICT 关键路径

```
大一秋：CS 124 + MATH 220/221 ─────（打基础，CS 124 争取 A）
大一春：CS 128 + CS 173 ──────────（CS 128 争取 B+ 以上，CS 173 是 ICT 关键课 ①）
大二秋：CS 225 ──────────────────（ICT 关键课 ②，前置 CS 128 + CS 173）
大二秋末/春初：提交 ICT 申请 ────（全部前提条件满足 ✅）
```

### 核心策略

| 阶段 | 行动 |
|------|------|
| **入学前暑假** | 用 learncs.online 过完 CS 124 全部内容（2-3 周），入学即可碾压 |
| **大一秋（CS 124）** | 每日按时做 homework，Android MP 提前开动。如果有 AP CS 5 分考虑直接 proficiency out |
| **大一寒假** | 用 learncpp.com 学 C++ 全章节 + 看 UIUC Coursera Course 1，为 CS 128 打底 |
| **大一春（CS 128）** | 每周围绕 quiz 复习，MP 第一时间开工。quiz 前把自己写的代码跑通所有 edge case |
| **CS 128 quiz 备战** | 没有 past paper 怎么办？自己出题——把 MP 的代码改成 quiz 题的形式，反复练 |
| **Proficiency 策略** | 如果有 C++ 基础，大一开学前考 CS 128 proficiency，失败无惩罚，成功直接跳到 CS 173+225 |

---

> **一句话总结**：CS 124 是入门，跟住节奏就能拿 A；CS 128 是分水岭，quiz 占 60% 且 all-or-nothing 制是它的残酷之处。提前用 learncs.online + learncpp.com 自学打底，是在这两门课上稳拿好成绩的最有效策略。
