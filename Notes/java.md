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
<<<<<<< HEAD

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
# Arrays in Java – Clean & Clear Notes

---

## 1. Why We Need Arrays

- A variable can store **only one value**
- If we need to store **many values of the same type** (e.g., 500 roll numbers), creating separate variables is not practical
- **Arrays** solve this problem by storing a **collection of values of the same type** under one name

---

## 2. What is an Array?

- An **array** is a collection of elements
- All elements must be of the **same data type**
- Arrays can store:
  - **Primitive types** → `int`, `float`, `boolean`, etc.
  - **Non-primitive (object) types** → `String`, custom objects, etc.

---

## 3. Array Syntax in Java

```java
int[] arr = new int[5];          // declaration + initialization
int[] arr2 = {1, 2, 3, 4, 5};    // direct initialization
```

**Explanation:**
- `int[]` → data type of the array
- `arr` → reference variable
- `new` → creates an object
- `5` → fixed size of the array

---

## 4. Memory Management of Arrays (VERY IMPORTANT)

### Common Rule (Applies to ALL arrays)
- **Reference variable** → stored in Stack
- **Array object** → stored in Heap
- Java uses **dynamic memory allocation** (memory created at runtime)

### Primitive Array (int[])

```java
int[] arr = new int[3];
```

- The array object stores actual primitive values
- Default value for int elements → `0`
- Only one heap object is involved

**Memory idea:**
```
Stack → arr
Heap  → [0 | 0 | 0]
```

### Object Array (String[])

```java
String[] arr = new String[3];
```

- The array object stores references, not actual objects
- Default value for each element → `null`
- Actual objects (String) are stored separately in heap
- Objects can be anywhere in heap

**Memory idea:**
```
Stack → arr
Heap  → [ref | ref | null]
           ↓
         "Hello"
```

### Key Difference (CORE CONCEPT)

| Feature | Primitive Array | Object Array |
|---------|-----------------|--------------|
| Stores | values directly | references |
| Extra objects | No | Yes |
| Heap levels | One | Two |
| Performance | Faster & memory efficient | More flexible, more memory |

**Remember:** Primitive arrays store values inside the array object, Object arrays store references to separate objects.

---

## 5. Array Indexing

- Index starts from `0`
- Last index = `size - 1`

```java
arr[0] = 10;
System.out.println(arr[2]);
```

---

## 6. Input & Output of Arrays

### Using a for loop
```java
for (int i = 0; i < arr.length; i++) {
    arr[i] = input;
}
```

### Enhanced for-loop
```java
for (int num : arr) {
    System.out.println(num);
}
```

### Using Arrays.toString()
```java
System.out.println(Arrays.toString(arr));
```

---

## 7. Passing Arrays to Functions

- Java is **call by value**
- When arrays are passed, a **copy of the reference** is passed
- Both references point to the **same array object**
- Changes inside a function **affect the original array**
- Arrays are **mutable**

---

## 8. 2D Arrays (Multidimensional Arrays)

A 2D array is an **array of arrays**

```java
int[][] arr = new int[3][3];
```

### Rules
- Number of rows is **mandatory**
- Number of columns is **optional**
- Java supports **jagged arrays**

**Memory concept:**
- Main array → references
- Each row → separate array object in heap

---

## 9. Input & Output of 2D Arrays

### Input
```java
for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = input;
    }
}
```

### Output
```java
System.out.println(Arrays.toString(arr[row]));
```

---

## 10. Common Array Problems

- Swap elements
- Find maximum element
- Find maximum in a given range
- Reverse an array (two-pointer method)

---

## 11. ArrayList (Dynamic Array)

Used when size is unknown. Part of Java Collection Framework.

```java
ArrayList<Integer> list = new ArrayList<>();
```

### Features
- Dynamic size
- Stores objects only
- Uses wrapper classes (Integer, not int)

### Common Methods
- `add()`
- `get()`
- `set()`
- `remove()`
- `contains()`

---

## 12. Internal Working of ArrayList

- Internally uses an array
- When capacity is full:
  - A new larger array is created
  - Old elements are copied
- Insertion has amortized **O(1)** time complexity

---

## 13. Multi-dimensional ArrayList

```java
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
```

- Inner lists must be initialized first
- Works like 2D arrays but dynamic

---

## Final Takeaway

- **Arrays** → fixed size, fast, memory efficient
- **ArrayList** → dynamic size, flexible, slightly slower
- Java arrays are objects stored in heap
- Primitive arrays store values
- Object arrays store references

### ⭐ Interview One-Liner:

**Primitive arrays store values directly, whereas object arrays store references to objects in heap.**

---

# Strings in Java – Complete Revision Notes

---

## 1️⃣ What is a String?

- A **String** is a **sequence of characters**
- In Java, **String is a class**, not a primitive
- Every string you create is an **object**

```java
String name = "Kunal";
```

**Memory Layout:**
```
Stack  → name (reference variable)
            ↓
Heap   → "Kunal" (actual object)
```

---

## 2️⃣ Stack vs Heap (Strings)

| Component | Details |
|-----------|---------|
| **Stack** | Stores reference variables (fast access) |
| **Heap** | Stores actual string objects (shared memory) |

```java
String a = "Hello";

a → stack
"Hello" → heap
```

---

## 3️⃣ String Pool (Memory Optimization) 🔥

A **special memory area inside heap** that stores **unique string literals**.

### Example:
```java
String a = "Kunal";
String b = "Kunal";
```

**What happens?**
1. Java checks the String Pool
2. "Kunal" already exists → reused
3. **Only ONE object created**

**Memory:**
```
a ─┐
   ├──> "Kunal" (String Pool)
b ─┘
```

### Why String Pool?
- **Saves memory** → No duplicate objects
- **Improves performance** → Reuses existing objects
- **Efficient** → Optimal use of heap

---

## 4️⃣ String Immutability (Core Concept) 🔥

### Meaning:
Once a String object is created, it **CANNOT be changed**.

### Example:
```java
String s = "Kunal";
s = "Kushwaha";
```

**What really happens?**
```
"Kunal" → stays unchanged in memory
New object "Kushwaha" created
s now points to new object
Old object → garbage collected
```

**❌ String NOT modified**  
**✅ Reference changed**

---

## 5️⃣ Why Strings are Immutable?

### Main Reasons:

#### 1. **Security**
- Passwords, usernames, URLs must not change
- If mutable → hackers could modify them

#### 2. **String Pool Safety**
- One object shared by many references
- If mutable → one change affects all → catastrophic!

#### 3. **Thread Safety**
- Multiple threads can safely share strings
- No accidental modification by other threads

#### 4. **HashMap Keys**
- Hash depends on immutability
- Mutable keys would break the map

**Example (Why Immutability Matters):**
```java
// If 100 users have name "Kunal"
// If String was mutable:
String shared = "Kunal";

// If someone changes it:
shared = "Hacker";

// All 100 users now have name "Hacker" ❌ DISASTER
```

---

## 6️⃣ String Comparison (Very Important) 🔥

### ❌ Using `==` (Wrong for comparison)
```java
a == b
```
- Compares **references** (memory addresses)
- Checks: Are both pointing to **same object**?
- Not useful for string content comparison

### ✅ Using `.equals()` (Correct for comparison)
```java
a.equals(b)
```
- Compares **values (content)**
- Checks: Do both strings have **same content**?

### Case 1: String Literals
```java
String a = "Kunal";
String b = "Kunal";

a == b        // true  (both point to same pool object)
a.equals(b)  // true  (content is same)
```

### Case 2: Using `new` Keyword
```java
String a = new String("Kunal");
String b = new String("Kunal");

a == b        // false  (different objects in heap)
a.equals(b)  // true   (content is same)
```

### Rule:
| Operator | Purpose |
|----------|---------|
| `==` | Reference check (memory address) |
| `.equals()` | Value/content check (always use this) |

---

## 7️⃣ `new String()` Keyword

The `new` keyword **forces** Java to create a new object in heap.

```java
String s = new String("Kunal");
```

**Effect:**
- Bypasses String Pool
- New object created **outside** pool (in regular heap)
- ❌ Not recommended for normal use
- ✅ Used only when explicitly required

---

## 8️⃣ Common String Methods

### Length & Access
```java
s.length()           // returns number of characters
s.charAt(index)      // returns character at index
```

### Case Conversion
```java
s.toLowerCase()      // converts to lowercase
s.toUpperCase()      // converts to uppercase
```

### Searching
```java
s.indexOf('a')       // first occurrence of 'a'
s.lastIndexOf('a')   // last occurrence of 'a'
```

### Trimming
```java
s.trim()             // removes leading & trailing spaces
s.strip()            // Unicode-aware (preferred)
```

### Splitting
```java
String[] arr = s.split(" ");  // splits by space
```

### Important Point:
📌 **All methods return a NEW String**  
📌 **Original string remains UNCHANGED** (immutability)

---

## 9️⃣ String Concatenation (+ Operator)

```java
String a = "Hello";
String b = "World";
a + b   // "HelloWorld"
```

### Rules:
- `+` is **overloaded** for String
- If **any operand is String** → result is String

```java
"A" + 1      → "A1"
"A" + true   → "Atrue"
1 + 2        → 3 (still int)
```

### Important:
- `+` works with **primitives** (auto-converts)
- For **objects** → calls `toString()`

---

## 🔟 How `System.out.println()` Works

```java
System.out.println(obj);
```

**Internally:**
1. Calls `String.valueOf(obj)`
2. Calls `obj.toString()`
3. Prints the returned String
4. If `obj == null` → prints `"null"`

---

## 1️⃣1️⃣ Performance Problem: String Concatenation in Loops 🔥

### Bad Code (❌ SLOW):
```java
String s = "";
for(int i = 0; i < n; i++) {
    s = s + i;
}
```

### Problem:
- String is **immutable**
- **New object created every iteration**
- Old data **copied again & again**
- Total operations → **O(n²)** Time
- **Wasteful memory usage**

### Why Slow?
```
Iteration 1: "" + 0        → "0"    (copy 0 chars, add 1)
Iteration 2: "0" + 1       → "01"   (copy 1 char, add 1)
Iteration 3: "01" + 2      → "012"  (copy 2 chars, add 1)
...
Total copies = 1+2+3+...+n = n²
```

---

## 1️⃣2️⃣ StringBuilder (Solution for Performance) 🔥

**What is StringBuilder?**  
A class that provides a **mutable string** for efficient building.

### Syntax:
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append("World");
String result = sb.toString();
```

### Properties:
- ✅ **Mutable** (can change without creating new objects)
- ✅ **Efficient** → Same object modified internally
- ✅ **Uses char array** internally (similar to ArrayList)

### Time Complexity:
- **Time** → **O(n)** ✅ (much better than O(n²))
- **Memory** → **Efficient** ✅

### Correct Approach:
```java
StringBuilder sb = new StringBuilder();
for(int i = 0; i < n; i++) {
    sb.append(i);
}
String result = sb.toString();
```

---

## 1️⃣3️⃣ String vs StringBuilder Comparison

| Feature | String | StringBuilder |
|---------|--------|---------------|
| **Mutable?** | ❌ No | ✅ Yes |
| **Performance in loops** | ❌ Slow (O(n²)) | ✅ Fast (O(n)) |
| **Thread-safe?** | ✅ Yes | ❌ No |
| **Memory usage** | ❌ More waste | ✅ Efficient |
| **Use case** | Constants, fixed text | Building, loops |

---

## 1️⃣4️⃣ When to Use What?

### Use **String** when:
- Text is **fixed/constant**
- Working with **immutable data** (passwords, keys)
- Using as **HashMap keys**
- Text **won't change**

### Use **StringBuilder** when:
- Building strings in **loops**
- Large **concatenation** operations
- **Dynamic text** building
- Frequent **append** operations

---

## 1️⃣5️⃣ Palindrome Problem (Classic Pattern) 📌

### Definition:
A string that reads the **same left→right** and **right→left**.

### Examples:
- "racecar" ✅
- "hello" ❌

### Solution Logic:
- Use **two pointers**: `start` at beginning, `end` at end
- Compare characters: `s.charAt(i) == s.charAt(n-1-i)`
- Move inward and check
- One mismatch → return `false`

### Code Idea:
```java
for(int i = 0; i < str.length() / 2; i++) {
    if(str.charAt(i) != str.charAt(n - i - 1))
        return false;
}
return true;
```

### Complexity:
- **Time** → **O(n)**
- **Space** → **O(1)** (no extra space)

---

## 🎯 StringBuffer vs StringBuilder

| Feature | StringBuilder | StringBuffer |
|---------|---------------|--------------|
| **Mutable?** | ✅ Yes | ✅ Yes |
| **Thread-safe?** | ❌ No | ✅ Yes (synchronized) |
| **Speed** | ⚡ Fast | 🐢 Slower |
| **Synchronization** | No overhead | Has overhead |

**Which to use?**
- **StringBuilder** → Most code is single-threaded (95% of cases)
- **StringBuffer** → Multi-threaded programs only

---

## 1️⃣6️⃣ Interview Questions & Answers

### Q1: Why is String immutable but StringBuilder mutable?

**Answer:**
- **String immutable** → for security, memory optimization, hashCode safety, thread-safety
- **Strings shared** in String Pool → if mutable, one change affects all references
- **StringBuilder mutable** → not shared, designed purely for performance

**One-liner:** *"String is immutable for safety and sharing; StringBuilder is mutable for performance."*

---

### Q2: How does Java optimize compile-time string concatenation?

```java
String s = "a" + "b" + "c";
```

**Answer:**
- This is a **compile-time constant**
- JVM optimizes it **at compile time** to: `String s = "abc";`
- Only **one object created** in String Pool

**Compare with:**
```java
String a = "a";
String s = a + "b";  // Runtime → uses StringBuilder
```
- Cannot optimize at compile time (variable `a`)
- JVM uses StringBuilder internally

---

### Q3: What is the output?

```java
String a = "hello";
String b = "hello";
String c = new String("hello");

System.out.println(a == b);        // ?
System.out.println(a == c);        // ?
System.out.println(a.equals(c));   // ?
```

**Answer:**
```
true   // a and b point to same pool object
false  // c is a different object
true   // .equals() compares values
```

---

### Q4: How many objects are created?

```java
String s = new String("hello");
```

**Answer:** **2 objects**

**Why?**
1. "hello" → created in **String Pool**
2. new String() → created in **Heap** (outside pool)

---

### Q5: Why are Strings safe as HashMap keys?

**Answer:**
- HashMap uses `hashCode()` for lookups
- **HashCode must NOT change** after insertion
- String is immutable → hash remains **same forever**
- Mutable key would break the map structure

**One-liner:** *"Strings are immutable, so their hashCode never changes, making them safe HashMap keys."*

---

### Q6: Why is this code slow?

```java
String s = "";
for(int i = 0; i < 100000; i++) {
    s += i;
}
```

**Answer:**
- String is immutable → each `+` creates new object
- Old content **copied again & again**
- Total operations → **O(n²)**

**Solution:**
```java
StringBuilder sb = new StringBuilder();
for(int i = 0; i < 100000; i++) {
    sb.append(i);
}
String result = sb.toString();  // O(n) ✅
```

---

### Q7: Can we create immutable classes like String?

**Answer:** **Yes!** Follow these rules:

1. Class must be `final` (no inheritance)
2. All fields must be `private` and `final`
3. No setters (only getters)
4. Defensive copying for mutable fields

```java
final class MyImmutable {
    private final int x;
    private final String name;
    
    public MyImmutable(int x, String name) {
        this.x = x;
        this.name = new String(name);  // defensive copy
    }
}
```

---

### Q8: Why use `char[]` instead of `String` for passwords?

**Answer:**
- **Strings immutable** → remain in heap until garbage collection (days!)
- **char[] can be manually cleared:** `Arrays.fill(password, '\0')`
- After clearing → no trace of password in memory

**Security advantage:**
```java
char[] password = {'P', 'w', 'd'};
// After use:
Arrays.fill(password, '\0');  // password == {'0', '0', '0'} ✅
```

---

### Q9: Output?

```java
String s1 = "java";
String s2 = s1;
s1 = "python";

System.out.println(s2);  // ?
```

**Answer:** `java`

**Explanation:**
- s1 reassigned to "python"
- s2 still points to old "java" object
- **Immutability in action** ✅

---

### Q10: Output?

```java
String s = "A" + 10 + 20;
System.out.println(s);  // ?
```

**Answer:** `"A1020"`

**Evaluation (left to right):**
```
"A" + 10      → "A10"
"A10" + 20    → "A1020"
```

---

## 📊 Time Complexity Summary

| Operation | Time Complexity |
|-----------|-----------------|
| String concatenation (`+`) in loop | **O(n²)** ❌ |
| StringBuilder append | **O(n)** ✅ |
| String equality check | **O(n)** |
| charAt() | **O(1)** |
| indexOf() | **O(n)** |

---

## ✅ Final One-Liners (Interview Killers 🔥)

1. *"String is immutable for security and sharing"*
2. *"String Pool avoids duplicate literals"*
3. *"Use equals() for string comparison, never =="*
4. *"StringBuilder avoids O(n²) concatenation"*
5. *"Immutability makes String thread-safe"*
6. *"HashMap keys must be immutable (String is ideal)"*
7. *"String is immutable; StringBuilder is mutable"*

---

## 🎓 Quick 5-Minute Interview Revision

- **What's immutable?** → String (once created, never changes)
- **Why immutable?** → Security, pool safety, thread-safe, HashMap keys
- **String Pool?** → Special heap area storing unique literals
- **== vs equals()?** → References vs values
- **When StringBuilder?** → Loops, large concatenations
- **Why slow concatenation?** → New object creation every time (O(n²))

---


