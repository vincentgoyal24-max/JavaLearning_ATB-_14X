package ex_001_Java_Basics;

public class Lab_007_ReservedKeywordsWithTheirMeaning_ChatGPT {
  public static void main(String[] args) {
    /*
-Simple English words** which are having predefined meaning in **Java Programming Language.**
- Keywords are also called **Reserved Words.**
- All the keywords are defined in **Lower Case.  **
- We **can’t use keywords** as names for variables, methods, classes, or as any other identifiers.
*/

    System.out.println(
      "1. **Data Types**\n" + "\n" + "Define the type of variables.\n" + "\n" + "* `byte` → 8-bit integer.\n" +
      "* `short` → 16-bit integer.\n" + "* `int` → 32-bit integer.\n" + "* `long` → 64-bit integer.\n" +
      "* `float` → 32-bit floating-point number.\n" + "* `double` → 64-bit floating-point number.\n" +
      "* `char` → Single 16-bit Unicode character.\n" + "* `boolean` → Represents `true` or `false`.\n" +
      "* `void` → Represents no return type in a method.\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 2. **Control Flow Statements**\n" + "\n" + "Used for decision-making and looping.\n" + "\n" +
      "* `if` → Executes a block if condition is true.\n" + "* `else` → Executes a block if condition is false.\n" +
      "* `switch` → Selects one block from multiple cases.\n" + "* `case` → Defines each option in a switch.\n" +
      "* `default` → Fallback in a switch if no case matches.\n" +
      "* `for` → Loop with initialization, condition, update.\n" + "* `while` → Loop until condition is true.\n" +
      "* `do` → Loop executes once before checking condition.\n" + "* `break` → Exits loop or switch immediately.\n" +
      "* `continue` → Skips current iteration in a loop.\n" +
      "* `return` → Exits from a method and optionally returns value.\n" +
      "* `yield` → Returns value from a switch expression (Java 13+).\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 3. **Exception Handling**\n" + "\n" + "Used for error handling.\n" + "\n" +
      "* `try` → Defines a block to test for exceptions.\n" + "* `catch` → Handles exceptions from `try` block.\n" +
      "* `finally` → Block that always executes after try/catch.\n" +
      "* `throw` → Used to explicitly throw an exception.\n" +
      "* `throws` → Declares exceptions a method may throw.\n" +
      "* `assert` → Used for debugging, checks a condition.\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 4. **Object-Oriented Keywords**\n" + "\n" + "Define classes, inheritance, interfaces.\n" + "\n" +
      "* `class` → Defines a class.\n" + "* `interface` → Defines an interface.\n" +
      "* `enum` → Defines an enum type.\n" + "* `extends` → Inherits from a superclass.\n" +
      "* `implements` → A class implements an interface.\n" + "* `new` → Creates a new object.\n" +
      "* `this` → Refers to the current object.\n" + "* `super` → Refers to the parent class.\n" +
      "* `instanceof` → Tests whether an object is of a specific type.\n" +
      "* `record` → Defines an immutable data class (Java 14+).\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 5. **Access Modifiers**\n" + "\n" + "Define visibility of classes/methods/variables.\n" + "\n" +
      "* `public` → Accessible everywhere.\n" + "* `private` → Accessible only within the same class.\n" +
      "* `protected` → Accessible within package and subclasses.\n" +
      "* `default` (no keyword, just package-private) → Accessible only within the package.\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 6. **Non-Access Modifiers**\n" + "\n" +
      "Provide extra info about classes, methods, variables.\n" + "\n" +
      "* `static` → Belongs to class, not instance.\n" +
      "* `final` → Used to declare constants, prevent inheritance/overriding.\n" +
      "* `abstract` → Defines abstract class or method.\n" +
      "* `synchronized` → Ensures only one thread can access at a time.\n" +
      "* `volatile` → Variable modified by multiple threads.\n" +
      "* `transient` → Skips variable during serialization.\n" +
      "* `native` → Declares method implemented in native (C/C++) code.\n" +
      "* `strictfp` → Ensures floating-point consistency across platforms.\n" +
      "* `sealed` → Restricts which classes can extend it (Java 15+).\n" +
      "* `non-sealed` → Allows unrestricted extension of a sealed class.\n" +
      "* `permits` → Declares which classes can extend a sealed class.\n" + "\n" + "---\n" + "\n" +
      "## \uD83D\uDD39 7. **Package & Imports**\n" + "\n" + "Used for organizing classes.\n" + "\n" +
      "* `package` → Defines a namespace for classes.\n" + "* `import` → Imports other classes/packages.\n" + "\n" +
      "---\n" + "\n" + "## \uD83D\uDD39 8. **Reserved (Not Used)**\n" + "\n" +
      "* `goto` → Reserved but not implemented.\n" +
      "* `const` → Reserved but not implemented (use `final` instead).\n" + "\n" + "---\n" + "\n" +
      "✅ **Total → 68 keywords** (including contextual ones like `record`, `yield`, `sealed`).\n");
  /*

## 🔹 1. **Data Types**

Define the type of variables.

* `byte` → 8-bit integer.
* `short` → 16-bit integer.
* `int` → 32-bit integer.
* `long` → 64-bit integer.
* `float` → 32-bit floating-point number.
* `double` → 64-bit floating-point number.
* `char` → Single 16-bit Unicode character.
* `boolean` → Represents `true` or `false`.
* `void` → Represents no return type in a method.

---

## 🔹 2. **Control Flow Statements**

Used for decision-making and looping.

* `if` → Executes a block if condition is true.
* `else` → Executes a block if condition is false.
* `switch` → Selects one block from multiple cases.
* `case` → Defines each option in a switch.
* `default` → Fallback in a switch if no case matches.
* `for` → Loop with initialization, condition, update.
* `while` → Loop until condition is true.
* `do` → Loop executes once before checking condition.
* `break` → Exits loop or switch immediately.
* `continue` → Skips current iteration in a loop.
* `return` → Exits from a method and optionally returns value.
* `yield` → Returns value from a switch expression (Java 13+).

---

## 🔹 3. **Exception Handling**

Used for error handling.

* `try` → Defines a block to test for exceptions.
* `catch` → Handles exceptions from `try` block.
* `finally` → Block that always executes after try/catch.
* `throw` → Used to explicitly throw an exception.
* `throws` → Declares exceptions a method may throw.
* `assert` → Used for debugging, checks a condition.

---

## 🔹 4. **Object-Oriented Keywords**

Define classes, inheritance, interfaces.

* `class` → Defines a class.
* `interface` → Defines an interface.
* `enum` → Defines an enum type.
* `extends` → Inherits from a superclass.
* `implements` → A class implements an interface.
* `new` → Creates a new object.
* `this` → Refers to the current object.
* `super` → Refers to the parent class.
* `instanceof` → Tests whether an object is of a specific type.
* `record` → Defines an immutable data class (Java 14+).

---

## 🔹 5. **Access Modifiers**

Define visibility of classes/methods/variables.

* `public` → Accessible everywhere.
* `private` → Accessible only within the same class.
* `protected` → Accessible within package and subclasses.
* `default` (no keyword, just package-private) → Accessible only within the package.

---

## 🔹 6. **Non-Access Modifiers**

Provide extra info about classes, methods, variables.

* `static` → Belongs to class, not instance.
* `final` → Used to declare constants, prevent inheritance/overriding.
* `abstract` → Defines abstract class or method.
* `synchronized` → Ensures only one thread can access at a time.
* `volatile` → Variable modified by multiple threads.
* `transient` → Skips variable during serialization.
* `native` → Declares method implemented in native (C/C++) code.
* `strictfp` → Ensures floating-point consistency across platforms.
* `sealed` → Restricts which classes can extend it (Java 15+).
* `non-sealed` → Allows unrestricted extension of a sealed class.
* `permits` → Declares which classes can extend a sealed class.

---

## 🔹 7. **Package & Imports**

Used for organizing classes.

* `package` → Defines a namespace for classes.
* `import` → Imports other classes/packages.

---

## 🔹 8. **Reserved (Not Used)**

* `goto` → Reserved but not implemented.
* `const` → Reserved but not implemented (use `final` instead).

---

✅ **Total → 68 keywords** (including contextual ones like `record`, `yield`, `sealed`).
  */

  }
}