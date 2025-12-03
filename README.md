# Primitives, Strings & Casting Assignment

## Goal
This goal is to edit the com.aspiredigital.Main file only in order to output
exactly what has been listed in output. This should be accomplished by using the
existing methods in the com.aspiredigital package folders class.

Please create a branch, based on your name, commit and push to save your work.

## Output
```txt

```

## Strings
In Java, a String is not a primitive type but a reference type that represents a
sequence of characters. It is essentially a wrapper around a char array, providing
a rich set of methods for manipulation and access. One key characteristic of String
is that it is immutable, meaning once a String object is created, its value cannot be changed.
Any operation that appears to modify a String actually creates a new String object.  

### Iterating Over a String
You can iterate over the characters of a String using a variety of methods:  

1. Using a for loop with charAt:
```Java
    String str = "example";
    for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
    }
```

2. Using a for-each loop with toCharArray:
```Java
    for (char c : str.toCharArray()) {
        System.out.println(c);
    }
```

### Transforming a String
The String class provides methods to transform its content:  
- Convert to uppercase or lowercase:   
```String upper = str.toUpperCase();```   
```String lower = str.toLowerCase();```
- Replace characters or substrings:   
```String replaced = str.replace('e', 'a');```   
- Trim whitespace:   
```String trimmed = str.trim();```   
### Accessing Parts of a String
You can access specific parts of a String using methods like:  
- Substring:   
    ```String sub = str.substring(1, 4); // Extracts "xam"```
- Index of a character or substring:   
    ```int index = str.indexOf('a');```
- Check if it starts or ends with a specific substring:   
    ```boolean starts = str.startsWith("ex");```
    ```boolean ends = str.endsWith("le");```

By understanding these features, you can effectively work with String objects in Java.

## Primitives

In Java, **primitive types** are the most basic data types.  
They are **not objects** and they store their values directly in memory.  
Java provides **8 primitive types**, each designed for specific purposes.

This guide explains each primitive type, how to declare it, and why some require extra suffixes like `f` and `L`.

---

### 1. `byte`
**Description:**  
An 8-bit signed integer used to save memory in large arrays.

**Range:**  
`-128` to `127`

**Example:**
```java
byte b = 10;
```

---

### 2. `short`
**Description:**  
A 16-bit signed integer. Larger than `byte` but smaller than `int`.

**Range:**  
`-32,768` to `32,767`

**Example:**
```java
short s = 300;
```

---

### 3. `int`
**Description:**  
A 32-bit signed integer. This is Java’s **default integer type**.

**Range:**  
`-2,147,483,648` to `2,147,483,647`

**Example:**
```java
int i = 20000;
```

---

### 4. `long`
**Description:**  
A 64-bit signed integer used when a wider range than `int` is required.

**Range:**  
`-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807`

**Additional Character:**  
Use `L` to mark a long literal — otherwise the number is treated as an `int`.

**Example:**
```java
long l = 900000L;
```

---

### 5. `float`
**Description:**  
A 32-bit floating-point number. Used for decimals with **less precision**.

**Range:**  
Approximately `±3.40282347E+38F`

**Additional Character:**  
Use `f` because decimal literals default to `double`.

**Example:**
```java
float f = 5.75f;
```

---

### 6. `double`
**Description:**  
A 64-bit floating-point number. This is Java’s **default decimal type** and offers higher precision than `float`.

**Range:**  
Approximately `±1.79769313486231570E+308`

**Example:**
```java
double d = 19.99;
```

---

### 7. `char`
**Description:**  
A 16-bit Unicode character for storing a **single character**.

**Range:**  
`0` to `65,535` (unsigned)

**Example:**
```java
char c = 'A';
```

---

### 8. `boolean`
**Description:**  
Represents a logical value: `true` or `false`.

**Range:**  
`true` or `false`

**Example:**
```java
boolean bool = true;
```

---

## Why Some Types Require Extra Characters

### `f` for float
Decimal literals default to **double**, so adding `f` tells the compiler:
> “treat this number as a float.”

Example:
```java
float f = 3.14f;
```

### `L` for long
Integer literals default to **int**, so adding `L` tells the compiler:
> “this value should be stored as a long.”

Example:
```java
long id = 123456789L;
```

---

By understanding each primitive type and its characteristics, you can
use Java’s memory and performance model more efficiently.

## Casting

Type casting in Java allows you to convert a value from one primitive data
type to another. Casting can be **implicit (widening)** or **explicit (narrowing)**
depending on whether data loss is possible.

---

## Widening Casting (Implicit Casting)

**Definition:**  
Widening occurs when converting a smaller primitive type into a larger type.  
This is **safe**, automatic, and **does not require a cast**.

**Order of widening:**
```
byte → short → int → long → float → double
          char → int
```

**Characteristics:**
- No data loss
- Automatically handled by the compiler
- Converts to a type with equal or greater storage size

**Example:**
```java
int i = 42;
double d = i;   // implicit widening
```

---

## Narrowing Casting (Explicit Casting)

**Definition:**  
Narrowing occurs when converting a larger primitive type into a smaller one.  
This requires a **manual cast** and may cause **data loss**.

**Order of narrowing:**
```
double → float → long → int → short → byte
                      int → char
```

**Characteristics:**
- Must be explicitly cast
- High risk of overflow or truncation
- May wrap values or drop fractional parts

**Example:**
```java
double d = 42.9;
int i = (int) d;   // explicit narrowing → value becomes 42
```

---

## Data Loss Examples

### 1. **Truncation (dropping decimals)**
```java
double d = 9.99;
int i = (int) d;  // i = 9
```

### 2. **Overflow**
```java
int x = 130;
byte b = (byte) x;  // b = -126 (overflow)
```

### 3. **Character narrowing**
```java
int i = 70000;
char c = (char) i;  // wraps into Unicode range
```

---

## Primitive Casting Rules by Type

### `byte`
- **Widening:** `byte → short → int → long → float → double`
- **Narrowing:** From any larger type → must cast
```java
byte b = (byte) 300; // overflow
```

### `short`
- **Widening:** `short → int → long → float → double`
- **Narrowing:** Must cast from long, float, double
```java
short s = (short) 50000; // overflow
```

### `char`
- **Widening:** `char → int → long → float → double`
- **Narrowing:** Requires cast from int, long, float, double
```java
char c = (char) 1000;
```

### `int`
- **Widening:** `int → long → float → double`
- **Narrowing:** Must cast to byte, short, char
```java
int i = 1000;
byte b = (byte) i;
```

### `long`
- **Widening:** `long → float → double`
- **Narrowing:** Must cast to int, short, char, byte
```java
long l = 9999999999L;
int i = (int) l;  // overflow
```

### `float`
- **Widening:** `float → double`
- **Narrowing:** Must cast to any integer type
```java
float f = 3.5f;
int i = (int) f; // truncation
```

### `double`
- **Highest type** → only narrowing possible
```java
double d = 123.456;
float f = (float) d;
```

---

## Casting Summary Table

| From → To | Widening (Implicit) | Narrowing (Explicit) |
|-----------|---------------------|------------------------|
| byte → short | ✔ | ✘ |
| byte → int | ✔ | ✘ |
| byte → long | ✔ | ✘ |
| byte → float | ✔ | ✘ |
| byte → double | ✔ | ✘ |
| int → byte | ✘ | ✔ |
| long → int | ✘ | ✔ |
| double → int | ✘ | ✔ |
| double → float | ✘ | ✔ |

---

## Best Practices

- Prefer widening conversions whenever possible.
- Avoid narrowing unless absolutely necessary.
- Always check expected ranges before narrowing.
- Be mindful of overflow and fractional truncation.
- When working with user input, validate before casting.

---

Casting is essential in Java, especially when working with mixed
numeric data types. Understanding widening vs narrowing ensures
you avoid silent bugs and data corruption.