# 🔥 Pro Tip (Important for DSA)
For fast input (competitive programming), prefer:<br><br>
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
``` 
(but Scanner is fine for beginners 👍)

## Arrays in Java

### 🔹 What is an Array?

* A fixed-size, ordered collection of elements of the same type.
* Stored in contiguous memory locations.

### 🔹 Declaration

```java
int[] arr;
```

### 🔹 Initialization

```java
arr = new int[5]; // size = 5
int[] arr2 = {1, 2, 3, 4};
```

### 🔹 Access & Update

```java
arr[0] = 10;
int x = arr[0];
```

### 🔹 Key Properties

* `length` → size of array
* Index starts from `0`
* Fixed size (cannot grow/shrink)

### 🔹 Looping

```java
for(int i = 0; i < arr.length; i++) {}

for(int val : arr) {} // enhanced for loop
```

### 🔹 Types

* Single-dimensional: `int[]`
* Multi-dimensional: `int[][] matrix = new int[3][3];`

---

## Strings in Java

### 🔹 What is a String?

* A sequence of characters.
* Immutable (cannot be changed after creation).

### 🔹 Declaration

```java
String s1 = "Hello";
String s2 = new String("World");
```

### 🔹 Common Methods

```java
s.length();        // length
s.charAt(0);      // character at index
s.substring(1,3); // substring
s.equals("Hi");   // comparison
s.toLowerCase();  // lowercase
s.toUpperCase();  // uppercase
s.trim();         // remove spaces
```

### 🔹 String Concatenation

```java
String s = s1 + " " + s2;
```

### 🔹 Important Concepts

* **Immutability**: Changes create new objects
* **String Pool**: Optimized memory storage for literals
* Use `StringBuilder` / `StringBuffer` for mutable strings

```java
StringBuilder sb = new StringBuilder("Hi");
sb.append(" there");
```

---

## 🔹 Arrays vs Strings

| Feature   | Arrays               | Strings              |
| --------- | -------------------- | -------------------- |
| Nature    | Mutable              | Immutable            |
| Size      | Fixed                | Fixed (object-based) |
| Data Type | Any primitive/object | Characters only      |
| Usage     | Collections of data  | Text processing      |

---



