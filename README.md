
This Java library, MathFunctions, provides implementations of common mathematical functions, including factorial and Fibonacci sequence calculations. It demonstrates the use of both long and BigInteger for handling different ranges of numerical results.

# NAME: Dorothy Achia
# REG:  EB3\59876\22

# Features

* *Factorial Calculation:*
    * factorial(int n): Calculates the factorial of a given integer n using long. It throws an IllegalArgumentException for negative inputs.
    * factorialBig(int n): Calculates the factorial of a given integer n using BigInteger, allowing for calculations of very large factorials.
* *Fibonacci Sequence Calculation:*
    * fibonacci(int n): Calculates the nth Fibonacci number using long. It throws an IllegalArgumentException for non-positive inputs.
* *Performance Measurement:*
    * The main method includes code to measure the execution time of each function using System.nanoTime(), providing insights into performance.

# Usage

1.  *Compilation:*
    * Compile the Java code using a Java compiler (e.g., javac MathFunctions.java).
2.  *Execution:*
    * Run the compiled class file (e.g., java MathFunctions).
3.  *Example Output:*
[16:37, 2/22/2025] Doro✨: # MathFunctions Java Library

This Java library, MathFunctions, provides implementations of common mathematical functions, including factorial and Fibonacci sequence calculations.

# Functions

# factorial(int n)

Calculates the factorial of a given non-negative integer n using long data type.

* *Parameters:*
    * n (int): The non-negative integer for which to calculate the factorial.
* *Returns:*
    * long: The factorial of n.
* *Throws:*
    * IllegalArgumentException: If n is negative.
* *Note:* This method is suitable for smaller values of n where the result fits within the range of a long.

# factorialBig(int n)

Calculates the factorial of a given non-negative integer n using BigInteger for handling large results.

* *Parameters:*
    * n (int): The non-negative integer for which to calculate the factorial.
* *Returns:*
    * BigInteger: The factorial of n.
* *Throws:*
    * IllegalArgumentException: If n is negative.
* *Note:* This method is suitable for larger values of n that exceed the range of long.

# fibonacci(int n)

Calculates the nth Fibonacci number.

* *Parameters:*
    * n (int): The position of the Fibonacci number to calculate (must be a positive integer).
* *Returns:*
    * long: The nth Fibonacci number.
* *Throws:*
    * IllegalArgumentException: If n is not a positive integer.

# Usage

To use this library, compile the MathFunctions.java file and run the main method. The main method demonstrates the usage of each function and measures their execution time.

# Compilation

```bash
javac MathFunctions.java
