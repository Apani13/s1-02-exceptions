## s1-01-inheritance-and-polymorphism
## Java Exception Handling Practice

🛠️ **Java Exception Handling Exercises**

📝 **Description**
This repository contains structured Java exercises focused on learning and applying exception handling concepts. Through custom and built-in exceptions, you'll practice writing robust, user-friendly input validation and error management routines in Java.

📌 Use IntelliJ IDEA or Eclipse for development.
📌 Follow Sprint 0 guidelines for best practices and GitHub organization.
📌 Projects may use plain Java or be built with Maven/Gradle.
📌 All code and documentation must be in English.

🚀 **Objectives**

* Learn how to manage errors and exceptional situations in Java.
* Implement custom exceptions and handle standard ones like `InputMismatchException`.
* Practice robust input handling with `Scanner` and loops.
* Strengthen understanding of user input validation.

📚 **Exercise Overview**

### Level 1

#### Exercise 1 – Sale with Custom Exception

* Create a `Product` class with `name` and `price` attributes.
* Create a `Sale` class containing a collection of `Product` objects and a `totalPrice` field.
* Add a method `calculateTotal()` that throws a custom exception `EmptySaleException` if the product list is empty.
* The `EmptySaleException` must extend `Exception` and include the message:

  > "To make a sale, you must first add products."
* Catch and display this message using the `getMessage()` method.
* Also, demonstrate how to generate and catch an `IndexOutOfBoundsException` in your code.

### Level 2

#### Exercise 1 – Input Reader with Exception Handling

* Create a class named `Input` that uses a `Scanner` for reading user input.
* Implement static methods to read and validate different data types.

* Methods reading numeric types must catch `InputMismatchException` and prompt the user again until valid input is received.

    * Example message: "Format error. Please try again."
* Methods reading `char`, `String`, or yes/no values should throw and handle a custom exception if the input format is invalid.

⚙️ **Technologies Used**

* Java
* IntelliJ IDEA or Eclipse
* GitHub
* (Optional) Maven or Gradle

📋 **Requirements**

* Java JDK 17 or higher
* Git for version control
* IntelliJ IDEA or Eclipse

🛠️ **Installation**

```bash
git clone https://github.com/your-user/java-exception-exercises.git
```

1. Open the project in IntelliJ IDEA or Eclipse.
2. If using Maven or Gradle, import accordingly. Otherwise, set it up as a standard Java project.
3. Ensure the project is using Java 17+.

▶️ **Execution**

* Navigate to the class with the `main()` method.
* Run it via IDE or terminal:

```bash
java Main
```

💡 Ensure `main()` is defined and the correct entry point if using a build tool.

🌐 **Deployment**

This is an educational project and not intended for production. However, to create a runnable `.jar`:

```bash
javac Main.java
jar cfe ExceptionExercises.jar Main *.class
java -jar ExceptionExercises.jar
```

🤝 **Contributions**

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/MyFeature`
3. Commit your changes: `git commit -m "Add MyFeature"`
4. Push to your fork: `git push origin feature/MyFeature`
5. Submit a pull request.

✅ **Author Notes**

These exception-handling exercises are essential for developing robust applications. Understanding how to handle unexpected behavior is a cornerstone of professional Java development.

Happy coding! 🚀
