# Java Programming – Complete Short Notes (Beginner Friendly)

---

## 1. Introduction to Programming
- Programming means writing instructions for a computer.
- Computers understand only **0s and 1s (machine code)**.
- Programming languages like **Java** help humans write readable code.

---

## 2. Compiler and Interpreter
- **Compiler**: Converts entire program at once.
- **Interpreter**: Executes code line by line.

### Java Flow:
```
Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
        JVM
        ↓
     Output
```

---

## 3. Creating a Java Program
1. Create a file: `Hello.java`
2. Write Java code
3. Compile: `javac Hello.java`
4. Run: `java Hello`

---

## 4. Structure of a Java Program

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 5. Meaning of Keywords

| Keyword | Meaning |
|---------|---------|
| public | Accessible from anywhere. |
| class | Blueprint that groups data + methods. |
| main() | Entry point of Java program. Program starts execution from here. |
| static | Can be executed without creating an object. |
| void | Returns nothing. |

---

## 6. Printing Output

```java
System.out.println("Hello World");  // prints and moves to next line
System.out.print("Hello");           // prints on same line
```

---

## 7. Taking Input in Java (Scanner)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String name = sc.nextLine();
```

---

## 8. Primitive Data Types in Java

| Type | Example |
|------|---------|
| int | int a = 10; |
| float | float f = 10.5f; |
| double | double d = 99.99; |
| char | char c = 'A'; |
| boolean | boolean flag = true; |

---

## 9. Variables and Literals

- **Variable**: Name of memory location.
- **Literal**: Actual value.

```java
int a = 10;
// a → variable
// 10 → literal
```

---

## 10. Type Conversion

### Automatic (Widening)
```java
int a = 10;
double b = a;
```

### Manual (Type Casting)
```java
double d = 9.8;
int x = (int) d;
```

---

## 11. Loops

### for Loop
```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### while Loop
```java
int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## 12. Conditional Statements

```java
int age = 18;

if(age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

## 13. Example Programs

### Sum of Two Numbers
```java
int a = 10;
int b = 20;
System.out.println(a + b);
```

### Temperature Conversion (Celsius → Fahrenheit)
```java
double c = 25;
double f = (c * 9/5) + 32;
System.out.println(f);
```

---

## 14. Unicode Support in Java

Java supports all languages.

```java
System.out.println("नमस्ते");
System.out.println("你好");
```

---

## 15. Packages

Package = folder of related classes.

```java
package com.example.demo;
```

---

## 16. Memory Basics (Important)

- Variables store references (stack memory).
- Objects store actual values (heap memory).
- Multiple references can point to same object.
- Unused objects are deleted by Garbage Collection.

---

## 17. Key Takeaways

- Java is compiled & object-oriented
- main() is mandatory
- Scanner is used for input
- Loops repeat tasks
- Type casting converts data types

---

## 18. Lecture Summary: Time & Space Complexity (Complete Overview)

### 1️⃣ What is Time Complexity?

Time Complexity measures how the running time of an algorithm grows as the input size increases.

- It is NOT the actual time taken (seconds/minutes).
- It depends on input size (n), not on the machine speed.

✅ Same algorithm → same time complexity  
❌ Old computer vs new computer does NOT change time complexity

### 2️⃣ Why Do We Study Time Complexity?

- To compare algorithms
- To choose the most efficient solution
- To handle large data
- Very important for interviews & real-world systems

### 3️⃣ Time Taken vs Time Complexity

| Time Taken | Time Complexity |
|-----------|-----------------|
| Depends on machine | Independent of machine |
| Measured in seconds | Measured using growth |
| Changes every run | Always same for algorithm |

👉 **Key rule: Time Complexity ≠ Time Taken**

### 4️⃣ Growth of Time (Graphs Concept)

- **X-axis** → Input size (n)
- **Y-axis** → Time taken
- We care about how fast time grows, not exact values

### 5️⃣ Common Time Complexities

| Complexity | Meaning |
|-----------|---------|
| O(1) | Constant time |
| O(log n) | Logarithmic (Binary Search) |
| O(n) | Linear |
| O(n log n) | Efficient sorting |
| O(n²) | Nested loops |
| O(2ⁿ) | Very slow |
| O(n!) | Worst possible |

👉 **Smaller growth = better algorithm**

### 6️⃣ Best, Average & Worst Case

- **Best case** → Minimum time
- **Average case** → Normal behavior
- **Worst case** → Maximum time (MOST IMPORTANT)

📌 **Always analyze Worst Case Time Complexity**

### 7️⃣ Why We Ignore Constants & Small Inputs

- We focus on large input sizes
- Constants do not affect growth

Example: `O(3n + 10) → O(n)`

### 8️⃣ Big-O Notation

- Represents upper bound (maximum time)
- Most commonly used

Example:
- Linear Search → O(n)
- Binary Search → O(log n)

### 9️⃣ Other Notations

| Notation | Meaning |
|----------|---------|
| Big-O (O) | Upper bound |
| Big-Omega (Ω) | Lower bound |
| Big-Theta (Θ) | Exact bound |
| Little-o (o) | Strictly smaller |
| Little-omega (ω) | Strictly larger |

### 🔟 Space Complexity

Measures extra memory used by algorithm

Includes:
- Variables
- Arrays
- Recursion stack

📌 **Input space + Extra space = Space Complexity**

### 1️⃣1️⃣ Space Complexity in Recursion

- Space depends on height of recursion tree
- More recursive calls → more stack space

### 1️⃣2️⃣ Sorting Algorithms (Brief)

| Algorithm | Time Complexity |
|-----------|-----------------|
| Bubble Sort | O(n²) |
| Selection Sort | O(n²) |
| Insertion Sort | O(n²) |
| Merge Sort | O(n log n) |
| Quick Sort | O(n log n) (avg) |

### 1️⃣3️⃣ Recursion & Complexity

- Use recurrence relations

Example:
- Binary Search → T(n) = T(n/2) + O(1)
- Leads to O(log n)

### 1️⃣4️⃣ Key Interview Rules

✅ Always consider worst case  
✅ Ignore constants  
✅ Focus on growth rate  
✅ Prefer lower complexity  
❌ Do not compare actual time

### 🧠 Final One-Line Conclusion

**Time Complexity tells us how an algorithm scales with input size, not how fast it runs on a machine.**

---
