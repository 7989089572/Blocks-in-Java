# Static and Non-Static Blocks in Java

## Theory

### What are Blocks in Java?
A block in Java is a group of statements enclosed within braces `{}`. Blocks are used to structure code and control scope.

### Types of Blocks

#### 1. **Static Block**
- A static block is declared using the `static` keyword.
- It is executed **once** when the class is loaded into memory, before any object is created.
- Typically used for initializing static variables or performing class-level setup.

**Syntax:**
```java
static {
    // statements
}
```

#### 2. **Non-Static (Instance) Block**
- Also known as an instance initializer block.
- It is executed **every time** a new object of the class is created.
- Used for initializing instance variables or setting up instance-specific resources.

**Syntax:**
```java
{
    // statements
}
```

### Execution Order
1. Static blocks (when class is loaded)
2. Instance blocks (before constructor, every object creation)
3. Constructor

---

## Example: Static and Non-Static Blocks

```java
public class JavaBlocksExample {

    // Static block (runs once when class loads)
    static {
        System.out.println("Static block executed! (Runs once when class is loaded)");
    }

    // Non-static block (runs every time an object is created)
    {
        System.out.println("Non-static block executed! (Runs every time an object is created)");
    }

    // Constructor
    public JavaBlocksExample() {
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Creating first object
        JavaBlocksExample obj1 = new JavaBlocksExample();

        // Creating second object
        JavaBlocksExample obj2 = new JavaBlocksExample();
    }
}
```

### Output

```
Static block executed! (Runs once when class is loaded)
Main method started.
Non-static block executed! (Runs every time an object is created)
Constructor called!
Non-static block executed! (Runs every time an object is created)
Constructor called!
```

---

## Summary

- **Static block:** Executes once for the class, before main or any object.
- **Non-static block:** Executes each time an object is created, before the constructor.
- Use static blocks for static initialization, and non-static blocks for instance initialization.
