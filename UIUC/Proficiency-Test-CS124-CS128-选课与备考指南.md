## 一、Proficiency Test 学分与GPA计算规则（UIUC全校+CS系细则）
### 1. 学分规则
1. 通过考试（≥C-分数线）：拿到该课完整3学分，计入毕业总学分要求。
    - CS124、CS128均为3学分/门
2. 重要限制：**能力测试学分不计入UIUC校内45学分底线要求**（学士学位必须至少45个UIUC本校上课学分，proficiency、AP、转学分都不算这45小时）。
3. 不能重复抵扣：如果你已有AP/IB/转学分抵过这两门，不能再考proficiency重复拿学分。
4. 挂考无记录：分数低于C-=挂，成绩单完全不留痕迹，不会出现F，多数情况可下一学期重考（CS系一般允许重考一次，以官网为准）。

### 2. GPA计算（核心关键点）
1. 成绩单标记：通过后成绩栏标注 **PS（Pass）**，**无任何字母绩点分**。
2. **PS成绩完全不参与任何GPA核算**：
    - 不计入累积CGPA、学期SGPA
    - 不影响荣誉学位、学术 probation、奖学金、研究生申请GPA基线
3. 对比正常选课：
    - 正常上课：A=4.0、B=3.0、C-=1.67，分数全额算GPA
    - Proficiency通过：只拿学分、零绩点贡献；等于**白嫖学分、不拉高也不拉低均分**
4. 特殊场景提醒：
    - 若之后你为了刷GPA重新注册CS124/128正常上课：新成绩正常计入GPA，proficiency的PS不会覆盖、不叠加计算。

### 3. CS系及格门槛
两门统一底线：试卷得分等效 **C-及以上** 才算通过拿PS学分；CS124满分200分，系里内部有固定及格线（每年小幅浮动，考前proficiency页面会公示）。

## 二、CS124 & CS128 往年真题/模拟题获取渠道（官方权威）
### 1. CS124 备考题库（Java/Kotlin）
官方入口：https://www.cs124.org/proficiency
1. PrairieLearn 练习专区（最核心模拟）
    - 用你的Illinois NetID登录 PrairieLearn
    - 加入课程：`CS 124: Introduction to Computer Science I, Proficiency Exam`
    - 内含：完整Practice Exam（题型、分值、难度对标正式测验）+ 全学期作业题（部分作业比考试略难，用来夯实代码能力）
    - 编程题可无限次提交自测；选择题单次作答机会和真实考试一致。
2. 配套自学讲义：learncs.online（CS124完整课录播+课件，完全同步考试考点）
3. 考试结构参考（2小时机考）：
    - 20道选择（80分）+6道编程大题（120分），总分200

### 2. CS128 备考题库（C++）
官方页面：https://cs128.org/ + 总Proficiency首页 https://proficiency.cs.illinois.edu/
1. PrairieLearn 128 Proficiency练习集
    - 同样用校账号登录PL，检索CS128 proficiency练习空间
    - 包含模拟测验、学期Quiz原题、MP大作业简化版习题（MP是128核心工程题，考试编程题风格同源）
2. 自学资料：learncpp.online（128授课内容公开镜像，覆盖OOP、内存、GDB/Valgrind、基础数据结构）
3. 考试形式：2小时机考，选择+代码编写+调试改错题型，和课内期中/期末结构对齐

### 3. 总CS Proficiency统一门户（查考试时间、报名、FAQ）
https://proficiency.cs.illinois.edu/
- 春秋学期开学第一周开放报名窗口，考试一般在开学前两周
- 页面会同步两门的**官方考纲、当年及格分数线、监考形式（CBTF机房）**

### 4. 补充民间/二手资源（辅助，不能替代官方PL题库）
1. ACM UIUC Wiki：https://wiki.acm.illinois.edu/classes/CS/CS124/、CS128板块有往届学生整理考点笔记、易错点总结
2. Uloop：少量往届期中期末卷可搜，但**没有完整proficiency真题流出**（CS系不对外放完整历年proficiency原卷，只提供PL内授权模拟题）
3. Discord UIUC CS社群、Reddit r/UIUC：往届考生经验帖，可问备考侧重点，但无完整原题分享

## 三、实操报名步骤简要
1. 开学第一周访问proficiency.cs.illinois.edu看窗口期
2. 联系当期CS124/CS128授课讲师提交考试申请确认资格
3. 拿到许可后在系统预约CBTF机房考试时段
4. 考前至少1周刷完PrairieLearn全套practice exam+对应学期作业

## 总结速记
1. GPA：过了只给PS学分，**不加任何绩点**；挂考无痕
2. 资料唯一官方模拟：PrairieLearn两门proficiency专属练习空间；无公开完整历年真题
3. 学分：3学分到手，但不算45小时校内底线学分

# 'PrairieLearn'是什么？
### 一、基础定义
**PrairieLearn（简称PL）** 是UIUC本校教授团队自研、开源免费的**在线自动测评/练习平台**，2014年诞生于伊利诺伊香槟分校工学院，现在北美多所顶尖大学（伯克利、普渡等）广泛使用，是UIUC CS系、工程系最核心的作业、测验、能力测试载体。



### 二、核心能力（对你备考CS124/128最关键）
1. **代码自动判题（CS核心）**
    原生支持Java（CS124）、C++（CS128）、Python等语言；提交代码后瞬间运行测试用例、给出得分、报错日志、部分分，和正式proficiency考试判分逻辑完全一致。
2. **随机变体题库**
    同一知识点会生成多套不同数字/逻辑的题目，你可以无限反复刷题练熟练度，不会背原题就能通关，完美匹配能力考的考核思路。
3. **题型全覆盖**
    选择、填空、代码编写、改错、拖拽推导、绘图等，和CS124/128 proficiency机考题型1:1对标。
4. **CBTF机房统考绑定**
    UIUC的正式期中、期末、proficiency能力测试，全部在Grainger图书馆楼下CBTF机房用PL系统监考作答，线上练习环境=考场真实环境。

### 三、在你CS124/CS128跳课场景里的作用
1. **官方唯一模拟题库来源**
    CS系不在外网放proficiency完整真题，只在PL开设独立练习空间：
    - `CS 124 Proficiency Exam`
    - `CS 128 Proficiency Exam`
    里面包含**全套模拟考卷、课内MP大作业简化题、季度Quiz原题**，是备考唯一权威资料。
2. **完全复刻考试评分标准**
    练习卷总分、及格分数线、代码扣分规则、作答时长限制，和真实proficiency考试统一标准；你刷完PL模拟，就能精准自测能不能稳过C-线拿PS学分。
3. **登录方式**
    直接访问官网 https://us.prairielearn.com，用你的**Illinois NetID**单点登录，不需要额外注册；搜索对应proficiency课程空间即可加入练习。

### 四、和普通LMS（Canvas/Blackboard）的区别
- Canvas只发课件、收文件；PL是**带编译运行、实时自动打分的编程练习引擎**
- CS124/128平时课内所有MP编程作业、随堂小测也全在PL提交计分，等于你提前熟悉整套考试工具流

### 五、简短上手步骤
1. 打开 us.prairielearn.com → NetID登录
2. 顶部搜索框搜 `CS 124 proficiency` / `CS 128 proficiency`
3. 加入课程空间，打开Practice Exam完整模拟卷
4. 写完代码点提交，立刻看运行结果与得分，反复刷到稳定高分

需要我给你整理一份**PL登录+加入124/128备考空间的逐行点击步骤**吗？
