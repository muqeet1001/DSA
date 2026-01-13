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
