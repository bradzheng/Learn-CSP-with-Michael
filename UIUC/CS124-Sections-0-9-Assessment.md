# CS 124 — Sections 0–9 综合评估测试

> **Created:** 2026-06-09 | **For:** UIUC Fall 2026 GGIS 新生 (自学 CS 124)  
> **覆盖范围:** learncs.online Kotlin 课程 Lessons 0–9  
> **时间:** 90 分钟 | **总题数:** 50 题 | **总分:** 100

---

## 📋 课程 Section 对照表

| Section | 标题 | 核心内容 |
|---------|------|---------|
| **0** | Hello, World! | `main()`, `print()`, `println()`, 程序结构 |
| **1** | Variables and Types | `val`/`var`, `Int`, `Double`, `String`, `Boolean`, 类型推断 |
| **2** | Operations on Variables | 算术运算, 字符串模板 `"$x"`, 类型转换 `.toInt()` 等 |
| **3** | Conditional Expressions & Statements | `if`/`else if`/`else`, 比较运算符, `when` 表达式 |
| **4** | Compound Conditionals | `&&`, `||`, `!`, 嵌套条件, 短路求值 |
| **5** | Arrays | `IntArray`, `arrayOf()`, `.size`, 索引访问, 遍历 |
| **6** | Loops | `while`, `for`, `do-while`, `..`, `until`, `downTo`, `step` |
| **7** | Algorithms I | 线性搜索, 找最大/最小, 计数, 求和 |
| **8** | Practice with Loops & Algorithms | 综合练习 |
| **9** | Functions | `fun`, 参数, 返回类型, `return`, 作用域, 函数调用 |

---

# 第一部分：概念理解题 (Conceptual Questions) — 25 题，每题 2 分

---

## Section 0: Hello, World!

**Q1.** 以下 Kotlin 代码的输出是什么？
```kotlin
fun main() {
    println("Hello")
    print("World")
    println("!")
}
```
A. `HelloWorld!` (三行)  
B. `Hello\nWorld!`  
C. `Hello` (第一行), `World!` (第二行)  
D. `HelloWorld!` (一行)  

**Q2.** 以下代码有什么问题？
```kotlin
print("Result: ")
println(42)
println("Done")
```
A. 没有问题，可以正常运行  
B. `println` 不能输出数字  
C. `print` 和 `println` 不能混用  
D. 缺少 `main()` 函数  

---

## Section 1: Variables and Types

**Q3.** 以下代码的输出是？
```kotlin
fun main() {
    val x = 10
    var y = 5
    y = x + y
    x = 20
    println(y)
}
```
A. `15`  
B. `20`  
C. 编译错误  
D. `25`

**Q4.** 关于 `val` 和 `var`，以下哪个说法是**错误**的？
A. `val` 声明的变量不能被重新赋值  
B. `var` 声明的变量可以被重新赋值  
C. `val` 变量在声明时必须初始化  
D. `var` 声明的变量类型不能被 Kotlin 自动推断  

**Q5.** Kotlin 中 `String` 类型与 Java 的异同点——哪句是正确的？
A. Kotlin 的 `String` 是可变的 (mutable)  
B. Kotlin 的 `String` 同 Java 一样是不可变的 (immutable)  
C. Kotlin 没有 `String` 类型  
D. Kotlin 的 `String` 不需要用双引号  

---

## Section 2: Operations on Variables

**Q6.** 以下代码的输出是？
```kotlin
fun main() {
    val a = 7
    val b = 3
    println(a / b)
    println(a % b)
}
```
A. `2.333...` 和 `1`  
B. `2` 和 `1`  
C. `2` 和 `0`  
D. 编译错误  

**Q7.** Kotlin 中 `"Hello, " + 42` 的结果是什么？
A. 编译错误：不能将 String 和 Int 相加  
B. `"Hello, 42"`  
C. `null`  
D. 运行时异常  

**Q8.** 以下代码中 `message` 的值是什么？
```kotlin
val name = "Alice"
val age = 20
val message = "$name is $age years old"
```
A. `"$name is $age years old"`  
B. `"Alice is 20 years old"`  
C. `"name is age years old"`  
D. 编译错误  

**Q9.** 如何将字符串 `"42"` 转换成 `Int` 类型？
A. `"42".toInt()`  
B. `Int.parse("42")`  
C. `(Int) "42"`  
D. `"42" as Int`  

---

## Section 3: Conditional Expressions & Statements

**Q10.** 以下代码的输出是什么？
```kotlin
val score = 75
val grade = if (score >= 90) {
    "A"
} else if (score >= 80) {
    "B"
} else if (score >= 70) {
    "C"
} else {
    "F"
}
println(grade)
```
A. `"A"`  
B. `"B"`  
C. `"C"`  
D. `"F"`  

**Q11.** Kotlin 中 `if` 和 `when` 的关系——以下哪个是正确的？
A. `if` 是语句，`when` 是表达式——它们的用途完全不同  
B. `if` 和 `when` 都可以作为表达式返回值  
C. `when` 只能检查相等性，不能做范围判断  
D. `if` 必须有 `else`，`when` 不需要  

**Q12.** 以下代码的输出是？
```kotlin
val x = 5
val result = when (x) {
    1 -> "one"
    2, 3 -> "two or three"
    in 4..6 -> "four to six"
    else -> "other"
}
println(result)
```
A. `"one"`  
B. `"two or three"`  
C. `"four to six"`  
D. `"other"`  

---

## Section 4: Compound Conditionals

**Q13.** Kotlin 中逻辑运算符 `&&` 使用短路求值 (short-circuit evaluation)。以下代码会抛出异常吗？
```kotlin
val x = 5
if (x > 10 && x / 0 == 1) {  // 这里除以 0！
    println("yes")
} else {
    println("no")
}
```
A. 会抛出 `ArithmeticException` (除以零)  
B. 不会——短路求值使得 `x / 0` 永远不会执行  
C. 编译错误，Kotlin 禁止除以零  
D. 输出 `"yes"`  

**Q14.** 德摩根定律：`!(a && b)` 等价于什么？
A. `!a && !b`  
B. `!a || !b`  
C. `a || b`  
D. `!a && b`  

**Q15.** 以下代码的输出是？
```kotlin
val a = true
val b = false
val c = !(a && b) || (a || !b)
println(c)
```
A. `true`  
B. `false`  
C. 编译错误  
D. 运行时错误  

---

## Section 5: Arrays

**Q16.** 如何在 Kotlin 中创建一个包含 4 个元素的 `IntArray`，值分别为 10, 20, 30, 40？
A. `intArrayOf(10, 20, 30, 40)`  
B. `new IntArray(10, 20, 30, 40)`  
C. `[10, 20, 30, 40]`  
D. `IntArray(10, 20, 30, 40)`  

**Q17.** 以下代码的输出是？
```kotlin
val arr = intArrayOf(5, 10, 15, 20)
println(arr[1])
println(arr.size)
```
A. `5` 和 `4`  
B. `10` 和 `4`  
C. `10` 和 `3`  
D. `5` 和 `3`  

**Q18.** 如何迭代 `IntArray` 的**索引**（而不是值）？
A. `for (value in arr)`  
B. `for (i in arr.indices)`  
C. `for (i in arr)`  
D. `arr.forEach()`  

---

## Section 6: Loops

**Q19.** 以下代码的输出是？
```kotlin
var sum = 0
for (i in 1..5) {
    sum += i
}
println(sum)
```
A. `10`  
B. `15`  
C. `5`  
D. `1 + 2 + 3 + 4 + 5`（字面量）  

**Q20.** 以下代码的输出是？
```kotlin
for (i in 10 downTo 1 step 3) {
    print("$i ")
}
```
A. `10 9 8 7 6 5 4 3 2 1`  
B. `10 7 4 1`  
C. `1 4 7 10`  
D. `10 8 6 4 2`  

**Q21.** `1 until 5` 包含哪些值？
A. `1, 2, 3, 4, 5`  
B. `1, 2, 3, 4`  
C. `2, 3, 4`  
D. `1, 2, 3, 4, 5, 6`  

**Q22.** 以下代码的输出是？
```kotlin
var x = 0
while (x < 3) {
    print("$x ")
    x++
}
```
A. `0 1 2`  
B. `0 1 2 3`  
C. `1 2 3`  
D. 无限循环  

---

## Section 7: Algorithms I

**Q23.** 线性搜索 (linear search) 在最坏情况下需要检查多少个元素（假设数组有 $n$ 个元素）？
A. $1$  
B. $\log_2 n$  
C. $n$  
D. $n/2$  

**Q24.** 以下代码的功能是？
```kotlin
fun mystery(arr: IntArray): Int {
    var result = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > result) {
            result = arr[i]
        }
    }
    return result
}
```
A. 找出数组中的最小值  
B. 计算数组总和  
C. 找出数组中的最大值  
D. 检查数组是否包含某个值  

---

## Section 8: Practice with Loops & Algorithms

**Q25.** 以下代码对数组 `[1, 2, 3, 2, 1]` 的返回值是什么？
```kotlin
fun countOccurrences(arr: IntArray, target: Int): Int {
    var count = 0
    for (value in arr) {
        if (value == target) {
            count++
        }
    }
    return count
}
```
调用 `countOccurrences(intArrayOf(1, 2, 3, 2, 1), 2)` 返回：
A. `0`  
B. `1`  
C. `2`  
D. `5`  

---

## Section 9: Functions

**Q26.** 以下函数声明有什么问题？
```kotlin
fun addNumbers(a: Int, b: Int): String {
    return a + b
}
```
A. 没有问题——Int 自动转为 String  
B. 返回类型应该是 `Int`，而非 `String`  
C. 缺少 `val` 关键字  
D. 缺少 `return` 关键字  

**Q27.** 函数参数在 Kotlin 中是**不可变**的。以下代码会怎样？
```kotlin
fun doubleIt(x: Int): Int {
    x = x * 2
    return x
}
```
A. 正常运行，返回两倍值  
B. 编译错误——函数参数默认是 `val`，不能重新赋值  
C. 运行时错误  
D. 输出 0  

**Q28.** 以下代码的输出是？
```kotlin
fun multiply(a: Int, b: Int = 2): Int {
    return a * b
}

fun main() {
    println(multiply(5))
    println(multiply(5, 3))
}
```
A. `10` 和 `15`  
B. `5` 和 `15`  
C. 编译错误——缺少参数  
D. `10` 和 `10`  

---

# 第二部分：代码阅读 — 输出/调试 (Code Reading & Debugging) — 12 题，每题 2 分

**Q29.** 以下代码的输出是？
```kotlin
fun main() {
    val x = 5
    val y = 10
    val z = if (x > y) x else y
    println(z)
}
```

---

**Q30.** 以下代码的输出是？
```kotlin
fun main() {
    val str = "Kotlin"
    println(str[0])
    println(str[str.length - 1])
}
```
> 注：Kotlin 中 `.length` 等同于 Java 的 `.length()`

---

**Q31.** 以下代码的输出是？
```kotlin
fun main() {
    for (i in 0 until 3) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }
}
```

---

**Q32.** 以下代码的输出是？
```kotlin
fun main() {
    var a = 1
    var b = 1
    print("$a $b ")
    for (i in 3..6) {
        val next = a + b
        print("$next ")
        a = b
        b = next
    }
}
```

---

**Q33.** 以下代码的输出是？
```kotlin
fun main() {
    val arr = intArrayOf(3, 1, 4, 1, 5)
    var result = 0
    for (i in arr.indices) {
        if (arr[i] % 2 == 1) {
            result += arr[i]
        }
    }
    println(result)
}
```

---

**Q34.** 以下代码的输出是？
```kotlin
fun main() {
    val x = 10
    val y = 3
    val result = when {
        x < 5 -> "small"
        y > 5 -> "big"
        x > 5 && y < 5 -> "medium"
        else -> "other"
    }
    println(result)
}
```

---

**Q35.** 找出以下代码中的 bug：
```kotlin
fun main() {
    var sum = 0
    var i = 0
    while (i < 10) {
        sum += i
        // 缺少 i++
    }
    println(sum)
}
```
这段代码会怎样？
A. 输出 `45`  
B. 输出 `0`  
C. 无限循环 (infinite loop)  
D. 编译错误  

---

**Q36.** 以下代码的输出是？
```kotlin
fun main() {
    val s = "hello"
    for (i in s.length - 1 downTo 0) {
        print(s[i])
    }
}
```

---

**Q37.** 以下代码的输出是？
```kotlin
fun main() {
    val arr = intArrayOf(10, 20, 30, 40)
    var i = 0
    while (i < arr.size) {
        if (arr[i] == 30) {
            break
        }
        print("${arr[i]} ")
        i++
    }
}
```

---

**Q38.** 以下代码的输出是？
```kotlin
fun isPositive(x: Int): Boolean {
    return x > 0
}

fun main() {
    val numbers = intArrayOf(-1, 2, -3, 4, -5)
    var count = 0
    for (n in numbers) {
        if (isPositive(n)) {
            count++
        }
    }
    println(count)
}
```

---

**Q39.** 以下代码的输出是？
```kotlin
fun greet(name: String = "World"): String {
    return "Hello, $name!"
}

fun main() {
    println(greet())
    println(greet("Kotlin"))
}
```

---

**Q40.** 以下代码的函数定义缺少了什么？
```kotlin
fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    // 这里少了什么？
}
```
A. 函数体无误，会自动返回 `result`  
B. 缺少 `return result`  
C. 缺少 `println(result)`  
D. `result` 应该在函数外声明  

---

# 第三部分：编程题 (Hands-On Coding) — 10 题，每题 3 分

> **用 Kotlin 写出完整的函数。** 写在纸上或 IDE 中，然后对照答案。

---

**Q41.** [Section 2-3] 编写一个函数 `absoluteValue(n: Int): Int`，返回 $n$ 的绝对值。**不可以使用** Kotlin 内置的 `abs()` 函数。
```kotlin
// 你的代码：
```

---

**Q42.** [Section 3-5] 编写函数 `isLeapYear(year: Int): Boolean`。闰年规则：能被 4 整除但不能被 100 整除，**或者**能被 400 整除。
```kotlin
// 你的代码：
```

---

**Q43.** [Section 5-6] 编写函数 `sumArray(arr: IntArray): Int`，返回数组中所有元素的和。
```kotlin
// 你的代码：
```

---

**Q44.** [Section 6-7] 编写函数 `reverseArray(arr: IntArray): IntArray`，返回一个新数组，元素顺序与原数组相反。
```kotlin
// 你的代码：
```

---

**Q45.** [Section 7] 编写函数 `findMinMax(arr: IntArray): Pair<Int, Int>`，返回数组中的最小值和最大值。假设数组非空。
```kotlin
// 你的代码：
```

---

**Q46.** [Section 6-7] 编写函数 `countVowels(s: String): Int`，统计字符串中元音字母 (a, e, i, o, u) 的数量（忽略大小写）。
```kotlin
// 你的代码：
```

---

**Q47.** [Section 9] 编写函数 `isPrime(n: Int): Boolean`，判断一个正整数是否为质数。质数：大于 1 且只能被 1 和自己整除。
```kotlin
// 你的代码：
```

---

**Q48.** [Section 7-9] 编写函数 `binarySearch(arr: IntArray, target: Int): Boolean`，使用线性搜索判断 `target` 是否在**已排序**数组中。先实现线性搜索版本即可。
```kotlin
// 你的代码：
```

---

**Q49.** [Section 6-8] 打印如下图案（使用嵌套循环）。编写函数 `printTriangle(n: Int)`，打印一个 $n$ 行的直角三角形：
```
*
**
***
****
*****
```
（示例为 $n=5$）

```kotlin
// 你的代码：
```

---

**Q50.** [Section 5-9] 编写函数 `removeDuplicates(arr: IntArray): IntArray`，返回一个新数组，去除原数组中的重复元素（保持首次出现的顺序）。例如 `[1, 2, 2, 3, 1]` → `[1, 2, 3]`。

提示：可以先排序再遍历，或使用之前 Section 中学过的线性搜索。
```kotlin
// 你的代码：
```

---

# 第四部分：Answer Key — 答案与解析

---

## 第一部分：概念理解题

| 题号 | 答案 | 解析 |
|------|------|------|
| **Q1** | **C** | `println("Hello")` 输出 `Hello` 并换行；`print("World")` 输出 `World` 不换行；`println("!")` 输出 `!` 并换行。结果是 `Hello` 在第一行，`World!` 在第二行。 |
| **Q2** | **A** | 没有问题。`print` 和 `println` 可以混用，`println` 能输出任何类型。但严格来说，如果这段代码不在 `main()` 里则无法运行——不过题干暗示它在。如果整个代码片段没有 `main()` 包裹，则为 D。在实际 learncs 风格中，代码片段内可能省略 `main()`。**按 learncs 惯例选 A**（代码片段展示了执行语句即可，Kotlin 1.3+ 允许顶层 main，但 learncs 一般会包含）。 |
| **Q3** | **C** | `val x = 10` 声明了不可变变量。`x = 20` 尝试修改 `val` → **编译错误**。 |
| **Q4** | **D** | `var` 变量的类型同样可以被 Kotlin 自动推断（如 `var x = 5` 推断为 `Int`）。A、B、C 均正确。 |
| **Q5** | **B** | Kotlin 的 `String` 和 Java 一样是不可变的 (immutable)。所有字符串操作返回新字符串。 |
| **Q6** | **B** | 整数除法的结果是整数（截断小数部分）：`7 / 3 = 2`，`7 % 3 = 1`。 |
| **Q7** | **B** | Kotlin 中 `+` 运算符可以将任意类型转换为字符串并拼接（因为自动调用 `.toString()`）。结果：`"Hello, 42"`。 |
| **Q8** | **B** | `$name` 和 `$age` 是字符串模板，分别被替换为变量值。结果：`"Alice is 20 years old"`。 |
| **Q9** | **A** | `"42".toInt()` 是 Kotlin 中字符串转整数的正确方法。 |
| **Q10** | **C** | `score = 75`：不满足 `>= 90`，不满足 `>= 80`，满足 `>= 70` → `"C"`。`if-else` 链按照顺序匹配第一个为 `true` 的条件。 |
| **Q11** | **B** | `if` 和 `when` **都可以作为表达式**返回值。例如 `val x = if (cond) a else b` 和 `val y = when(v) { ... }`。 |
| **Q12** | **C** | `x = 5`，满足 `in 4..6` → `"four to six"`。 |
| **Q13** | **B** | `&&` 短路：`x > 10` 先求值结果为 `false`，因此右侧 `x / 0 == 1` 不被执行。无异常。 |
| **Q14** | **B** | 德摩根定律：`!(a && b) = !a || !b`；`!(a || b) = !a && !b`。 |
| **Q15** | **A** | `a && b = false`，`!(false) = true`。`!b = true`，`a || true = true`。`true || true = true`。 |
| **Q16** | **A** | `intArrayOf(10, 20, 30, 40)` 是正确的语法。 |
| **Q17** | **B** | 数组索引从 0 开始：`arr[1] = 10`。`.size` 返回元素个数 = `4`。 |
| **Q18** | **B** | `arr.indices` 返回 `0..arr.size-1` 的范围，用于迭代索引。 |
| **Q19** | **B** | `1 + 2 + 3 + 4 + 5 = 15`。 |
| **Q20** | **B** | `10 downTo 1 step 3` → 从 10 开始递减 3：`10, 7, 4, 1`。 |
| **Q21** | **B** | `1 until 5` 等价于 `1..4`（不包含 5）。 |
| **Q22** | **A** | `x = 0, 1, 2` 分别打印，当 `x = 3` 时 `3 < 3` 为 `false`，循环结束。 |
| **Q23** | **C** | 最坏情况下目标在最后一个位置（或不存在），需要检查全部 $n$ 个元素。 |
| **Q24** | **C** | 遍历数组，遇到比当前 `result` 大的值就更新——这是找最大值的算法。 |
| **Q25** | **C** | 数组中有两个 `2`（在 index 1 和 index 3）。 |
| **Q26** | **B** | 函数返回 `a + b` 结果是 `Int`，但声明返回类型为 `String` → 类型不匹配编译错误。 |
| **Q27** | **B** | Kotlin 函数参数默认是 `val`（不可变），给参数 `x` 重新赋值会编译错误。 |
| **Q28** | **A** | `multiply(5)` 使用默认值 `b=2` → `10`；`multiply(5, 3)` → `15`。 |

---

## 第二部分：代码阅读

| 题号 | 答案 | 解析 |
|------|------|------|
| **Q29** | `10` | `if (x > y) x else y` 是表达式，`x=5, y=10` → `5 > 10` 为 `false` → 返回 `y` 即 `10`。 |
| **Q30** | 第一行: `K`，第二行: `n` | `str[0]` 是第一个字符；`str[str.length - 1]` 是最后一个字符。`"Kotlin".length = 6`，`str[5] = 'n'`。 |
| **Q31** | `*` / `**` / `***` (三行) | 外层循环 `i = 0, 1, 2`；内层 `j in 0..i` 输出 $i+1$ 个 `*`。 |
| **Q32** | `1 1 2 3 5 8` | 这是斐波那契数列。`1, 1, 2, 3, 5, 8`（前 6 项）。 |
| **Q33** | `10` | 奇数 (`% 2 == 1`) 之和：`3 + 1 + 1 + 5 = 10`。 |
| **Q34** | `"medium"` | `x=10` 不满足 `x<5`；`y=3` 不满足 `y>5`；`x>5 && y<5` 满足 → `"medium"`。 |
| **Q35** | **C — 无限循环** | `i` 始终为 `0`，`i < 10` 始终为 `true` → 无限循环。 |
| **Q36** | `olleh` | 从最后一个字符到第一个字符，反向输出 `"hello"`。 |
| **Q37** | `10 20` | 遇到 `30` 时 `break` 退出循环，之前只打印了 `10 20`。 |
| **Q38** | `2` | `isPositive` 返回 `true` 的只有 `2` 和 `4` → `count = 2`。 |
| **Q39** | 第一行: `Hello, World!`，第二行: `Hello, Kotlin!` | 默认参数的使用。 |
| **Q40** | **B** | 函数声明返回类型为 `Int`，必须有 `return result`。 |

---

## 第三部分：编程题 — 参考答案

**Q41. 绝对值**
```kotlin
fun absoluteValue(n: Int): Int {
    return if (n >= 0) n else -n
}
```
> 评分要点: 正确处理负数和零。

---

**Q42. 闰年判断**
```kotlin
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
```
> 评分要点: 逻辑运算符的正确组合。

---

**Q43. 数组求和**
```kotlin
fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (value in arr) {
        sum += value
    }
    return sum
}
```
> 评分要点: 遍历数组，累加求和。

---

**Q44. 数组反转**
```kotlin
fun reverseArray(arr: IntArray): IntArray {
    val result = IntArray(arr.size)
    for (i in arr.indices) {
        result[i] = arr[arr.size - 1 - i]
    }
    return result
}
```
> 评分要点: 创建新数组，反向复制。

---

**Q45. 找最小最大值**
```kotlin
fun findMinMax(arr: IntArray): Pair<Int, Int> {
    var min = arr[0]
    var max = arr[0]
    for (value in arr) {
        if (value < min) min = value
        if (value > max) max = value
    }
    return Pair(min, max)
}
```
> 评分要点: 同时追踪最小和最大值。

---

**Q46. 统计元音**
```kotlin
fun countVowels(s: String): Int {
    val vowels = "aeiouAEIOU"
    var count = 0
    for (ch in s) {
        if (ch in vowels) {
            count++
        }
    }
    return count
}
```
> 评分要点: 处理大小写，或者用 `s.lowercase()` 统一转小写后再统计。

---

**Q47. 质数判断**
```kotlin
fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}
```
> 评分要点: `n <= 1` 不是质数；循环从 2 到 n-1（或优化到 `sqrt(n)`）。

---

**Q48. 线性搜索**
```kotlin
fun binarySearch(arr: IntArray, target: Int): Boolean {
    for (value in arr) {
        if (value == target) return true
    }
    return false
}
```
> 评分要点: 遍历数组，找到返回 `true`，遍历完没找到返回 `false`。

---

**Q49. 打印三角形**
```kotlin
fun printTriangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
```
> 评分要点: 外层控制行数（`1..n`），内层控制每行星号数量（`1..i`）。

---

**Q50. 去重**
```kotlin
fun removeDuplicates(arr: IntArray): IntArray {
    val seen = mutableListOf<Int>()
    for (value in arr) {
        if (value !in seen) {
            seen.add(value)
        }
    }
    return seen.toIntArray()
}
```
> 评分要点: 用 List 记录已见过的元素，遇到新的才添加。`!in` 检查是否已在列表中。

---

# 第五部分：自诊表 — 按 Section 分析薄弱环节

## 按题号与 Section 对应表

| Section | 内容 | 概念题 | 阅读题 | 编程题 | 总分 |
|---------|------|:---:|:---:|:---:|:---:|
| **0** | Hello, World! | Q1, Q2 | — | — | /4 |
| **1** | Variables & Types | Q3, Q4, Q5 | — | — | /6 |
| **2** | Operations on Variables | Q6, Q7, Q8, Q9 | — | Q41 | /11 |
| **3** | Conditionals | Q10, Q11, Q12 | Q29 | Q41*, Q42 | /12 |
| **4** | Compound Conditionals | Q13, Q14, Q15 | Q34 | Q42* | /10 |
| **5** | Arrays | Q16, Q17, Q18 | — | Q43, Q44, Q50 | /13 |
| **6** | Loops | Q19, Q20, Q21, Q22 | Q31, Q32, Q35 | Q43*, Q44*, Q49 | /21 |
| **7** | Algorithms I | Q23, Q24 | Q33 | Q44*, Q45, Q48 | /13 |
| **8** | Practice with Loops | Q25 | Q37, Q38 | Q46*, Q48*, Q50* | /13 |
| **9** | Functions | Q26, Q27, Q28 | Q39, Q40 | Q47 | /13 |

> \* 表示该题同时涉及多个 Section

---

## 📊 自评计分表

| Section | 总满分 | 你的得分 | 正确率 | 评估 |
|---------|:---:|:---:|:---:|------|
| **0** Hello, World! | 4 | __ | __% | |
| **1** Variables & Types | 6 | __ | __% | |
| **2** Operations on Variables | 11 | __ | __% | |
| **3** Conditionals | 12 | __ | __% | |
| **4** Compound Conditionals | 10 | __ | __% | |
| **5** Arrays | 13 | __ | __% | |
| **6** Loops | 21 | __ | __% | |
| **7** Algorithms I | 13 | __ | __% | |
| **8** Practice with Loops & Algorithms | 13 | __ | __% | |
| **9** Functions | 13 | __ | __% | |
| **总计** | **100** | __ | __% | |

---

## 🎯 薄弱环节诊断

| 正确率 | 等级 | 建议 |
|--------|:---:|------|
| **85%+** | 🟢 扎实 | 可以继续后续 Section |
| **70–84%** | 🟡 还行 | 回看该 Section 的 learncs 页面，重做错题 |
| **50–69%** | 🟠 有差距 | 重学该 Section + 做课后 Practice Problems |
| **< 50%** | 🔴 薄弱 | 从头重学该 Section，逐行理解代码 |

---

## 📈 Section 0–9 知识体系图

```
Hello World (0)
    │
Variables & Types (1)
    │
Operations on Variables (2)
    │
Conditionals (3) ──── Compound Conditionals (4)
    │                        │
Arrays (5)                    │
    │                        │
Loops (6) ◄──────────────────┘
    │
Algorithms I (7)
    │
Practice with Loops & Algorithms (8)
    │
Functions (9)  ←── 以上所有内容在此整合
```

## 🔗 推荐复习路径

1. 先看自诊表——最薄弱的 Section
2. 回 [learncs.online](https://www.learncs.online/lessons) 重读对应 Lesson
3. 做 Lesson 末尾的 Practice Problem
4. 回来重做本试卷中标记 ❌ 的题目
5. 确认正确率 > 80% 后进入 Section 10+

---

*CS 124 Sections 0–9 Assessment | Created 2026-06-09*  
*Based on learncs.online Kotlin curriculum for UIUC CS 124*
