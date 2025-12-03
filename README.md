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
