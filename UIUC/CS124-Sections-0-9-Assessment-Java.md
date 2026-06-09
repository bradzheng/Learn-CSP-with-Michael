# CS 124 — Sections 0–9 综合评估测试 (Java Edition)

> **Created:** 2026-06-09 | **For:** UIUC Fall 2026 GGIS 新生 (自学 CS 124)  
> **覆盖范围:** learncs.online 课程 Lessons 0–9 — **Java 版本**  
> **时间:** 90 分钟 | **总题数:** 50 题 | **总分:** 100  
> **注:** 本试卷是 Kotlin 版的完整 Java 改写，语法差异已全部适配

---

## 📋 课程 Section 对照表

| Section | 标题 | Java 核心内容 |
|---------|------|-------------|
| **0** | Hello, World! | `main()` 方法, `System.out.println()`, `System.out.print()`, class 结构 |
| **1** | Variables and Types | `int`, `double`, `String`, `boolean`, `char`, `final`, 类型声明 |
| **2** | Operations on Variables | 算术运算, 整数除法的坑, 字符串拼接, `Integer.parseInt()` |
| **3** | Conditional Expressions & Statements | `if`/`else if`/`else`, 比较运算符, `switch` 语句 |
| **4** | Compound Conditionals | `&&`, `||`, `!`, 短路求值, 德摩根定律 |
| **5** | Arrays | `int[]`, `String[]`, `new`, `.length`, 索引访问, 遍历 |
| **6** | Loops | `while`, `for` (传统), `do-while`, `for-each` |
| **7** | Algorithms I | 线性搜索, 找最大/最小, 计数, 求和 |
| **8** | Practice with Loops & Algorithms | 嵌套循环, `break`, 综合算法 |
| **9** | Methods (Functions) | `public static`, 参数, 返回类型, `return`, 作用域, 方法重载 |

---

## 🆚 Kotlin → Java 关键语法差异速查

| 概念 | Kotlin | Java |
|------|--------|------|
| 打印 | `println("Hi")` | `System.out.println("Hi")` |
| 变量 | `val x = 5` / `var y = 10` | `final int x = 5;` / `int y = 10;` |
| 字符串模板 | `"$name is $age"` | `name + " is " + age` |
| 数组 | `intArrayOf(1,2,3)` | `new int[]{1, 2, 3}` |
| 数组长度 | `arr.size` | `arr.length` |
| 类型转换 | `"42".toInt()` | `Integer.parseInt("42")` |
| 区间 | `1..5`, `1 until 5` | `for (int i = 1; i <= 5; i++)` |
| 多分支 | `when { ... }` | `switch` 或 `if-else` 链 |
| 默认参数 | `fun f(a: Int, b: Int = 2)` | 方法重载 (overloading) |
| 顶层函数 | 可以直接写 `fun f()` | 需要 `public static` 在 class 中 |

---

# 第一部分：概念理解题 (Conceptual Questions) — 28 题，每题 2 分

---

## Section 0: Hello, World!

**Q1.** 以下 Java 代码的输出是什么？
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("World");
        System.out.println("!");
    }
}
```
A. `Hello` (第一行), `World!` (第二行)  
B. `HelloWorld!` (一行)  
C. `Hello\nWorld!`  
D. `Hello\nWorld\n!`  

**Q2.** 以下代码有什么问题？
```java
System.out.print("Result: ");
System.out.println(42);
System.out.println("Done");
```
A. 没有问题，可以正常运行  
B. `System.out.println` 不能输出数字  
C. 缺少 class 和 `main` 方法包裹  
D. `print` 和 `println` 不能混用  

---

## Section 1: Variables and Types

**Q3.** 以下代码的输出是？
```java
public static void main(String[] args) {
    final int x = 10;
    int y = 5;
    y = x + y;
    x = 20;
    System.out.println(y);
}
```
A. `15`  
B. `20`  
C. 编译错误  
D. `25`

**Q4.** 关于 `final` 关键字，以下哪个说法是**错误**的？
A. `final` 变量一旦赋值就不能被修改  
B. 没有 `final` 修饰的普通变量可以被重新赋值  
C. `final int x;` 声明后可以稍后再赋值一次  
D. `final` 变量必须在声明的同时立即初始化  

**Q5.** Java 中 `String` 类型的特性——以下哪句是正确的？
A. Java 的 `String` 是可变的 (mutable)  
B. Java 的 `String` 是不可变的 (immutable)，所有操作返回新字符串  
C. Java 的 `String` 是原始类型 (primitive type)  
D. Java 中 `String` 不能用 `+` 拼接  

**Q6.** Java 中这行代码的含义是？
```java
double pi = 3.14159;
```
A. 声明一个变量 `pi`，类型为 `double`，值为 `3.14159`  
B. 声明一个常量 `pi`  
C. 将 `pi` 转换为 `double` 类型  
D. 语法错误——缺少 `final`  

---

## Section 2: Operations on Variables

**Q7.** 以下 Java 代码的输出是？
```java
int a = 7;
int b = 3;
System.out.println(a / b);
System.out.println(a % b);
```
A. `2.3333...` 和 `1`  
B. `2` 和 `1`  
C. `2` 和 `0`  
D. 编译错误  

**Q8.** Java 中 `"Hello, " + 42` 的结果是什么？
A. 编译错误：不能将 String 和 int 相加  
B. `"Hello, 42"`（自动将 int 转为 String 再拼接）  
C. `null`  
D. 运行时异常  

**Q9.** 以下代码的输出是？
```java
int x = 5;
double y = 2;
System.out.println(x / y);
```
A. `2`  
B. `2.5`  
C. `2.0`  
D. 编译错误  

**Q10.** 如何将字符串 `"42"` 转换成 `int` 类型？
A. `"42".toInt()`  
B. `Integer.parseInt("42")`  
C. `(int) "42"`  
D. `int("42")`  

**Q11.** `5 / 2 * 2.0` 的结果是什么？
A. `5.0`  
B. `4.0`  
C. `4`  
D. `5`  

---

## Section 3: Conditional Statements

**Q12.** 以下代码的输出是？
```java
int score = 75;
String grade;
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
} else {
    grade = "F";
}
System.out.println(grade);
```
A. `A`  
B. `B`  
C. `C`  
D. `F`  

**Q13.** 以下代码的输出是？
```java
int x = 10;
int y = 5;
int z;
if (x > y) {
    z = x - y;
} else {
    z = x + y;
}
System.out.println(z);
```
A. `15`  
B. `5`  
C. `10`  
D. `-5`  

**Q14.** Java 中 `switch` 语句不支持以下哪种类型？
A. `int`  
B. `String`  
C. `boolean`  
D. `char`  

---

## Section 4: Compound Conditionals

**Q15.** Java 使用短路求值 (short-circuit evaluation)。以下代码会抛出异常吗？
```java
int x = 5;
if (x > 10 && x / 0 == 1) {
    System.out.println("yes");
} else {
    System.out.println("no");
}
```
A. 会抛出 `ArithmeticException` (除以零)  
B. 不会——`x > 10` 为 `false`，短路跳过 `x / 0`  
C. 编译错误  
D. 输出 `"yes"`  

**Q16.** 德摩根定律：`!(a && b)` 等价于什么？
A. `!a && !b`  
B. `!a || !b`  
C. `a || b`  
D. `!a && b`  

**Q17.** 以下代码的输出是？
```java
boolean a = true;
boolean b = false;
boolean c = !(a && b) || (a || !b);
System.out.println(c);
```
A. `true`  
B. `false`  
C. 编译错误  

---

## Section 5: Arrays

**Q18.** 如何在 Java 中创建一个包含 4 个 `int` 元素的数组，值分别为 10, 20, 30, 40？
A. `int[] arr = new int[]{10, 20, 30, 40};`  
B. `int[] arr = [10, 20, 30, 40];`  
C. `int[] arr = intArrayOf(10, 20, 30, 40);`  
D. `int arr = {10, 20, 30, 40};`  

**Q19.** 以下代码的输出是？
```java
int[] arr = new int[]{5, 10, 15, 20};
System.out.println(arr[1]);
System.out.println(arr.length);
```
A. `5` 和 `4`  
B. `10` 和 `4`  
C. `10` 和 `3`  
D. `5` 和 `3`  

**Q20.** 以下遍历数组的方式中，哪个是 Java 的 **for-each** (增强 for) 语法？
A. `for (int i : arr)`  
B. `for (int i = 0; i < arr.length; i++)`  
C. `for (int i in arr)`  
D. `for (int i = arr)`  

---

## Section 6: Loops

**Q21.** 以下代码的输出是？
```java
int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum += i;
}
System.out.println(sum);
```
A. `10`  
B. `15`  
C. `5`  
D. `1+2+3+4+5`  

**Q22.** 以下代码的输出是？
```java
for (int i = 10; i >= 1; i -= 3) {
    System.out.print(i + " ");
}
```
A. `10 9 8 7 6 5 4 3 2 1`  
B. `10 7 4 1`  
C. `1 4 7 10`  
D. `10 8 6 4 2`  

**Q23.** 以下代码的输出是？
```java
int x = 0;
while (x < 3) {
    System.out.print(x + " ");
    x++;
}
```
A. `0 1 2`  
B. `0 1 2 3`  
C. `1 2 3`  
D. `0 1 2 3 4`  

**Q24.** `do-while` 和 `while` 的关键区别是什么？
A. `do-while` 先判断条件再执行循环体  
B. `do-while` 的循环体至少执行一次  
C. `do-while` 不能使用 `break`  
D. 没有区别——语法不同但行为完全相同  

---

## Section 7: Algorithms I

**Q25.** 线性搜索 (linear search) 在最坏情况下需要检查多少个元素（数组有 $n$ 个元素）？
A. $1$  
B. $\log_2 n$  
C. $n$  
D. $n/2$  

**Q26.** 以下 Java 方法的功能是？
```java
public static int mystery(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < result) {
            result = arr[i];
        }
    }
    return result;
}
```
A. 找出数组中的最大值  
B. 找出数组中的最小值  
C. 计算数组总和  
D. 判断数组是否包含 0  

---

## Section 8: Practice with Loops & Algorithms

**Q27.** 以下代码对数组 `{1, 2, 3, 2, 1}` 的返回值是什么？
```java
public static int countOccurrences(int[] arr, int target) {
    int count = 0;
    for (int value : arr) {
        if (value == target) {
            count++;
        }
    }
    return count;
}
```
调用 `countOccurrences(new int[]{1, 2, 3, 2, 1}, 2)` 返回：
A. `0`  
B. `1`  
C. `2`  
D. `5`  

---

## Section 9: Methods (Functions)

**Q28.** 以下方法声明有什么问题？
```java
public static String addNumbers(int a, int b) {
    return a + b;
}
```
A. 没有问题——int 自动转为 String  
B. 返回 `a + b` 是 `int`，但声明返回类型是 `String` → 编译错误  
C. 缺少 `this` 关键字  
D. `public static` 不能一起使用  

**Q29.** 在 Java 中，方法参数**可以**在方法体内重新赋值（不像 Kotlin 的 `val`）。以下代码的输出是？
```java
public static int doubleIt(int x) {
    x = x * 2;
    return x;
}

public static void main(String[] args) {
    int a = 5;
    System.out.println(doubleIt(a));
    System.out.println(a);
}
```
A. `10` 和 `10`  
B. `10` 和 `5`  
C. `5` 和 `5`  
D. 编译错误  

**Q30.** Java **没有**默认参数。以下哪个是实现"可选参数"的正确 Java 方式？
```java
// 想要的效果: multiply(5) 默认第二个参数为 2
//             multiply(5, 3) 使用指定值
```
A. 方法重载 (overloading): 写两个 `multiply` 方法，一个接受 1 个参数，一个接受 2 个参数  
B. 无法实现——Java 不能模拟默认参数  
C. 使用 `final` 参数  
D. 用 `switch` 语句判断参数个数  

---

# 第二部分：代码阅读 — 输出/调试 (Code Reading & Debugging) — 10 题，每题 2 分

**Q31.** 以下代码的输出是？
```java
public static void main(String[] args) {
    int x = 5;
    int y = 10;
    int z = (x > y) ? x : y;
    System.out.println(z);
}
```

---

**Q32.** 以下代码的输出是？
```java
public static void main(String[] args) {
    String str = "Kotlin";
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(str.length() - 1));
}
```

---

**Q33.** 以下代码的输出是？
```java
public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```

---

**Q34.** 以下代码的输出是？
```java
public static void main(String[] args) {
    int a = 1;
    int b = 1;
    System.out.print(a + " " + b + " ");
    for (int i = 3; i <= 6; i++) {
        int next = a + b;
        System.out.print(next + " ");
        a = b;
        b = next;
    }
}
```

---

**Q35.** 以下代码的输出是？
```java
public static void main(String[] args) {
    int[] arr = new int[]{3, 1, 4, 1, 5};
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 1) {
            result += arr[i];
        }
    }
    System.out.println(result);
}
```

---

**Q36.** 找出以下代码的问题：
```java
int sum = 0;
int i = 0;
while (i < 10) {
    sum += i;
}
System.out.println(sum);
```
A. `sum` 没有初始化  
B. 无限循环——`i` 永远为 0  
C. 缺少分号  
D. 输出 `0`  

---

**Q37.** 以下代码的输出是？
```java
public static void main(String[] args) {
    int[] arr = new int[]{10, 20, 30, 40};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 30) {
            break;
        }
        System.out.print(arr[i] + " ");
    }
}
```

---

**Q38.** 以下代码的输出是？
```java
public static boolean isEven(int n) {
    return n % 2 == 0;
}

public static void main(String[] args) {
    int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
    int count = 0;
    for (int n : numbers) {
        if (isEven(n)) {
            count++;
        }
    }
    System.out.println(count);
}
```

---

**Q39.** 以下代码的输出是？
```java
public static String repeat(String s, int times) {
    String result = "";
    for (int i = 0; i < times; i++) {
        result += s;
    }
    return result;
}

public static void main(String[] args) {
    System.out.println(repeat("ab", 3));
}
```

---

**Q40.** 以下代码中，`main` 里打印的 `x` 值是多少？
```java
public static void changeMe(int x) {
    x = 100;
}

public static void main(String[] args) {
    int x = 5;
    changeMe(x);
    System.out.println(x);
}
```
A. `100`  
B. `5`  
C. `0`  
D. 编译错误  

---

# 第三部分：编程题 (Hands-On Coding) — 10 题，每题 3 分

> **用 Java 写出完整的方法。** 假设所有方法都在一个合法的 Java class 中。注重正确性。

---

**Q41.** [Section 2-3] 编写方法 `absoluteValue(int n)`，返回 $n$ 的绝对值。**不可使用** `Math.abs()`。
```java
// 你的代码:
public static int absoluteValue(int n) {

}
```

---

**Q42.** [Section 3-4] 编写方法 `isLeapYear(int year)` 判断闰年。规则：能被 4 整除但不能被 100 整除，**或**能被 400 整除。
```java
// 你的代码:
public static boolean isLeapYear(int year) {

}
```

---

**Q43.** [Section 5-6] 编写方法 `sumArray(int[] arr)`，返回数组中所有元素的和。
```java
// 你的代码:
public static int sumArray(int[] arr) {

}
```

---

**Q44.** [Section 5-6] 编写方法 `reverseArray(int[] arr)`，返回一个**新数组**，元素顺序与原数组相反。
```java
// 你的代码:
public static int[] reverseArray(int[] arr) {

}
```

---

**Q45.** [Section 7] 编写方法 `findMin(int[] arr)` 和 `findMax(int[] arr)`，分别返回数组最小值和最大值。假设数组非空。
```java
// 你的代码:
public static int findMin(int[] arr) {

}

public static int findMax(int[] arr) {

}
```

---

**Q46.** [Section 6-7] 编写方法 `countVowels(String s)`，统计字符串中元音字母 (a, e, i, o, u) 的数量（忽略大小写）。
```java
// 你的代码:
public static int countVowels(String s) {

}
```

---

**Q47.** [Section 9] 编写方法 `isPrime(int n)`，判断正整数是否为质数。质数：大于 1 且只能被 1 和自己整除。
```java
// 你的代码:
public static boolean isPrime(int n) {

}
```

---

**Q48.** [Section 7-9] 编写方法 `contains(int[] arr, int target)`，用线性搜索判断 `target` 是否在数组中。
```java
// 你的代码:
public static boolean contains(int[] arr, int target) {

}
```

---

**Q49.** [Section 6-8] 编写方法 `printTriangle(int n)`，打印直角三角形（用 `*`）：
```
*
**
***
****
*****
```
（示例为 n=5）

```java
// 你的代码:
public static void printTriangle(int n) {

}
```

---

**Q50.** [Section 5-9] 编写方法 `removeDuplicates(int[] arr)`，返回一个新数组，去除重复元素（保持首次出现的顺序）。例如 `{1, 2, 2, 3, 1}` → `{1, 2, 3}`。

提示：可以分两步——① 先数不重复元素个数确定新数组大小；② 再逐个判断是否已在已收集元素中。
```java
// 你的代码:
public static int[] removeDuplicates(int[] arr) {

}
```

---

# 第四部分：Answer Key — 答案与解析

---

## 第一部分：概念理解题

| 题号 | 答案 | 解析 |
|------|------|------|
| **Q1** | **A** | `println("Hello")` → 输出 `Hello` 换行；`print("World")` → 输出 `World` 不换行；`println("!")` → 输出 `!` 换行。结果两行：`Hello` 和 `World!`。 |
| **Q2** | **C** | Java 中所有可执行代码必须在 class 的 `main` 方法中。缺少 `public class Main { public static void main(String[] args) { ... } }` 包裹。 |
| **Q3** | **C** | `final int x = 10;` 声明了不可变变量。`x = 20;` 尝试修改 → **编译错误**。Java 的 `final` 等同于 Kotlin 的 `val`。 |
| **Q4** | **D** | `final` 变量可以在声明时不初始化（称为 blank final），但必须在构造函数中赋值（对实例变量而言）。对于局部变量，声明后可以稍后赋值一次。A、B、C 正确，D 错误——**不是必须声明时立即初始化**。 |
| **Q5** | **B** | Java 的 `String` 是不可变的 (immutable)。所有字符串操作（如 `concat`, `substring`, `replace`）都返回新字符串，原字符串不变。`String` 是引用类型，不是原始类型。 |
| **Q6** | **A** | `double pi = 3.14159;` 声明了一个 `double` 类型变量并初始化。没有 `final` 关键字说明之后可以修改。 |
| **Q7** | **B** | Java 中两个 `int` 相除执行**整数除法**：`7 / 3 = 2`（截断小数）。`7 % 3 = 1`（取余）。 |
| **Q8** | **B** | Java 中 `+` 运算符在 `String + 任意类型` 时会自动将非 String 转为 String（调用 `.toString()`）。结果：`"Hello, 42"`。与 Kotlin 相同。 |
| **Q9** | **B** | `int / double` → `int` 先被自动提升 (promote) 为 `double`，然后 `5.0 / 2.0 = 2.5`。**关键区别：** 只要有一个操作数是浮点数，就执行浮点除法。 |
| **Q10** | **B** | `Integer.parseInt("42")` 是 Java 字符串转 int 的标准方法。`toInt()` 是 Kotlin 语法，Java 中没有。 |
| **Q11** | **B** | `5 / 2` 先执行（整数除法）= `2`；然后 `2 * 2.0` → `2` 提升为 `2.0` → `4.0`。**陷阱：** 很多人以为 `5/2*2.0 = 5.0`，但除法先于乘法且是整数除法。 |
| **Q12** | **C** | `score = 75`：`>= 90` ❌，`>= 80` ❌，`>= 70` ✅ → `"C"`。`if-else if` 链按顺序匹配第一个为 `true` 的分支。 |
| **Q13** | **B** | `10 > 5` 为 `true` → `z = 10 - 5 = 5`。 |
| **Q14** | **C** | Java `switch` 支持 `int`, `byte`, `short`, `char`, `String`, `enum`，但**不支持 `boolean`**。 |
| **Q15** | **B** | `&&` 短路：`x > 10` 为 `false` → 整个 `&&` 表达式已确定为 `false`，右边的 `x / 0` **不执行**。无异常。同 Kotlin。 |
| **Q16** | **B** | 德摩根定律：`!(a && b) == !a || !b`，`!(a || b) == !a && !b`。 |
| **Q17** | **A** | 逐步：`a && b = false`，`!false = true`；`!b = true`，`a || true = true`；`true || true = true`。 |
| **Q18** | **A** | `new int[]{10, 20, 30, 40}` 是正确的数组初始化语法。也可以简写为 `int[] arr = {10, 20, 30, 40};`（仅限声明时）。 |
| **Q19** | **B** | 索引从 0 开始：`arr[1] = 10`。Java 使用 `.length`（不是 `.size`）获取数组长度 = `4`。 |
| **Q20** | **A** | `for (int i : arr)` 是 Java 的增强 for 循环 (for-each)，等价于 `for (元素类型 变量名 : 数组或集合)`。B 是传统 for 循环。C 是 Kotlin 语法。 |
| **Q21** | **B** | `1 + 2 + 3 + 4 + 5 = 15`。`for (int i = 1; i <= 5; i++)` 产生 `i = 1, 2, 3, 4, 5`。 |
| **Q22** | **B** | `i` 从 10 开始，每次减 3：`10, 7, 4, 1`。当 `i = -2` 时 `i >= 1` 为 `false` 停止。 |
| **Q23** | **A** | `x = 0, 1, 2` 时满足 `x < 3` 进入循环，分别打印。`x = 3` 时退出。 |
| **Q24** | **B** | `do-while` 的循环体**至少执行一次**（先执行再判断条件）。`while` 可能一次都不执行（先判断再执行）。 |
| **Q25** | **C** | 最坏情况：目标在最后一个位置或不存在 → 检查全部 $n$ 个元素。 |
| **Q26** | **B** | 遍历数组并保存比当前 `result` 更小的值 → 找**最小值**。 |
| **Q27** | **C** | 数组中有两个 `2`（索引 1 和 3）。for-each 遍历全部元素。 |
| **Q28** | **B** | `a + b` 返回 `int` 类型，但方法声明返回类型为 `String` → **类型不匹配**，编译错误。 |
| **Q29** | **B** | Java 的方法参数**可以重新赋值**（与 Kotlin 不同！），但这是对参数**局部变量**的操作，不影响原始变量。`a` 在调用后仍然是 `5`。Java 是**按值传递** (pass-by-value)。 |
| **Q30** | **A** | Java 通过**方法重载 (overloading)** 来实现类似默认参数的效果：写两个同名方法，一个接受全部参数，另一个接受较少参数并调用前者传入默认值。 |

---

## 第二部分：代码阅读

| 题号 | 答案 | 解析 |
|------|------|------|
| **Q31** | `10` | `(x > y) ? x : y` 是三元运算符。`5 > 10` 为 `false` → 取 `y` = `10`。 |
| **Q32** | 第一行: `K`<br>第二行: `n` | `charAt(0)` 取第一个字符；`charAt(length()-1)` 取最后一个字符。`"Kotlin"` 长度 6。 |
| **Q33** | `*` (第一行)<br>`**` (第二行)<br>`***` (第三行) | `i = 0` → 内层 `j <= 0` 输出 1 个星；`i = 1` → 2 个；`i = 2` → 3 个。 |
| **Q34** | `1 1 2 3 5 8` | 斐波那契数列前 6 项。迭代 4 次（`i = 3, 4, 5, 6`），每次计算 `next = a + b`。 |
| **Q35** | `10` | 奇数 `{3, 1, 1, 5}` 的和 = `10`。 |
| **Q36** | **B** | `i` 始终为 0，`i < 10` 永远为 `true` → **无限循环**。缺少 `i++`。 |
| **Q37** | `10 20` | 遇到 `30` 时执行 `break` 跳出循环。之前只打印了 `10` 和 `20`。 |
| **Q38** | `3` | 偶数有 `{2, 4, 6}` → `count = 3`。 |
| **Q39** | `ababab` | `repeat("ab", 3)` 将 `"ab"` 拼接 3 次 → `"ababab"`。 |
| **Q40** | **B — `5`** | Java 是**按值传递** (pass-by-value)。方法内将参数 `x` 改为 `100`，但这是参数副本的修改，不影响 `main` 中的原始变量 `x`。 |

---

## 第三部分：编程题 — 参考答案

**Q41. 绝对值**
```java
public static int absoluteValue(int n) {
    if (n >= 0) {
        return n;
    } else {
        return -n;
    }
}
// 或用三元运算符: return (n >= 0) ? n : -n;
```
> 评分要点: `n >= 0` 如何处理 0 和负数。

---

**Q42. 闰年判断**
```java
public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
```
> 评分要点: `&&` 和 `||` 的正确优先级和组合。

---

**Q43. 数组求和**
```java
public static int sumArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
// 或 for-each: for (int value : arr) { sum += value; }
```
> 评分要点: 正确使用 `.length`（不是 `.size`）。

---

**Q44. 数组反转**
```java
public static int[] reverseArray(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[arr.length - 1 - i];
    }
    return result;
}
```
> 评分要点: 用 `new int[arr.length]` 创建新数组。

---

**Q45. 找最小值和最大值**
```java
public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
```
> 评分要点: 从 `arr[0]` 开始，逐个比较更新。

---

**Q46. 统计元音**
```java
public static int countVowels(String s) {
    s = s.toLowerCase();  // 统一转小写
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    return count;
}
```
> 评分要点: 用 `.toLowerCase()` 处理大小写；`charAt()` 而非 `s[i]`（Java 中字符串不能用 `[]`）。

---

**Q47. 质数判断**
```java
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
// 优化: for (int i = 2; i <= Math.sqrt(n); i++)
```
> 评分要点: `n <= 1` 直接返回 `false`；循环从 2 到 n-1。

---

**Q48. 线性搜索**
```java
public static boolean contains(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return true;
        }
    }
    return false;
}
// 或 for-each: for (int value : arr) { if (value == target) return true; }
```
> 评分要点: 找到立即返回 `true`，遍历完没找到返回 `false`。

---

**Q49. 打印三角形**
```java
public static void printTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
> 评分要点: 外层 `i` 控制行数 (1 到 n)，内层 `j` 控制每行星号数 (1 到 i)。

---

**Q50. 去重**
```java
public static int[] removeDuplicates(int[] arr) {
    // Step 1: 数不重复的元素个数
    int uniqueCount = 0;
    for (int i = 0; i < arr.length; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < i; j++) {  // 检查之前是否出现过
            if (arr[i] == arr[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            uniqueCount++;
        }
    }

    // Step 2: 创建新数组并填入不重复元素
    int[] result = new int[uniqueCount];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            result[index] = arr[i];
            index++;
        }
    }
    return result;
}
```
> 评分要点: 两遍扫描——先计数再填入；检查重复只看当前元素**之前**是否出现过。
> 进阶解法（如果学过 ArrayList）：用 `ArrayList<Integer>` 动态收集不重复元素。

---

# 第五部分：自诊表 — 按 Section 分析薄弱环节

## 题号与 Section 对应表

| Section | 内容 | 概念题 | 阅读题 | 编程题 | 总满分 |
|---------|------|:---:|:---:|:---:|:---:|
| **0** | Hello, World! | Q1, Q2 | — | — | 4 |
| **1** | Variables & Types | Q3, Q4, Q5, Q6 | — | — | 8 |
| **2** | Operations on Variables | Q7, Q8, Q9, Q10, Q11 | — | Q41 | 13 |
| **3** | Conditionals | Q12, Q13, Q14 | Q31 | Q41, Q42 | 16 |
| **4** | Compound Conditionals | Q15, Q16, Q17 | — | Q42 | 10 |
| **5** | Arrays | Q18, Q19, Q20 | — | Q43, Q44, Q50 | 15 |
| **6** | Loops | Q21, Q22, Q23, Q24 | Q33, Q34, Q36 | Q43, Q44, Q49 | 23 |
| **7** | Algorithms I | Q25, Q26 | Q35 | Q45, Q48 | 12 |
| **8** | Practice with Loops | Q27 | Q37, Q38 | Q46, Q49, Q50 | 18 |
| **9** | Methods | Q28, Q29, Q30 | Q39, Q40 | Q47 | 12 |

> 部分题目跨 Section，计入了多个 Section 的满分。

---

## 📊 自评计分表

| Section | 总满分 | 你的得分 | 正确率 | 评估 |
|---------|:---:|:---:|:---:|------|
| **0** Hello, World! | 4 | __ | __% | |
| **1** Variables & Types | 8 | __ | __% | |
| **2** Operations on Variables | 13 | __ | __% | |
| **3** Conditionals | 16 | __ | __% | |
| **4** Compound Conditionals | 10 | __ | __% | |
| **5** Arrays | 15 | __ | __% | |
| **6** Loops | 23 | __ | __% | |
| **7** Algorithms I | 12 | __ | __% | |
| **8** Practice with Loops & Algorithms | 18 | __ | __% | |
| **9** Methods | 12 | __ | __% | |
| **总计** | **100** | __ | __% | |

---

## 🎯 薄弱环节诊断

| 正确率 | 等级 | 建议 |
|--------|:---:|------|
| **85%+** | 🟢 扎实 | 可以继续后续 Section |
| **70–84%** | 🟡 还行 | 回看该 Section 的 learncs 页面 + 重做错题 |
| **50–69%** | 🟠 有差距 | 重学该 Section + 做课后 Practice Problem |
| **< 50%** | 🔴 薄弱 | 从头重学该 Section，逐行理解每一段示例代码 |

---

## 🆚 Java 特有的易错点（与 Kotlin 对比）

| 易错点 | 说明 |
|--------|------|
| **整数除法** | `5 / 2` = `2` 不是 `2.5`。只要有一个 `double` 才得浮点结果。Java 与 Kotlin 行为相同。 |
| **`.length` vs `.length()`** | 数组用 `.length`（无括号），字符串用 `.length()`（有括号）。Kotlin 统一用 `.size` / `.length`。 |
| **`String` 用 `charAt()`** | Java 取字符用 `s.charAt(i)`，不是 `s[i]`。Kotlin 可以直接 `s[i]`。 |
| **方法参数可改** | Java 中方法参数可以 `x = x * 2;`，但这只影响局部副本。Kotlin 参数默认 `val` 不可改。 |
| **无默认参数** | Java 需用**方法重载**实现可选参数。写多个同名方法，参数少的调用参数多的。 |
| **`switch` 不支持 `boolean`** | Java `switch` 支持 `int`, `char`, `String`, `enum`，但不支持 `boolean`。 |
| **无顶层函数** | 所有 Java 方法必须写在 class 中，且用 `public static`（在学 OOP 之前）。 |
| **数组声明语法** | `int[] arr = new int[]{1, 2, 3};` 而非 Kotlin 的 `intArrayOf(1, 2, 3)`。 |
| **三元运算符 `?:`** | Java 用 `condition ? a : b`，Kotlin 的 `if` 是表达式所以不需要三元运算符。 |

---

*CS 124 Sections 0–9 Assessment — Java Edition | Created 2026-06-09*  
*Based on learncs.online curriculum for UIUC CS 124*
