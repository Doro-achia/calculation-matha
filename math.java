import java.math.BigInteger;

public class math {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static BigInteger factorialBig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long a = 1, b = 1;
            for (int i = 3; i <= n; i++) {
                long temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        // Calculate and measure factorial
        long startTime = System.nanoTime();
        long factResult = factorial(20); // Or any number you want to test
        long endTime = System.nanoTime();
        System.out.println("Factorial (long): " + factResult);
        System.out.println("Factorial Runtime: " + (endTime - startTime) + " ns");

        // Calculate and measure factorial using BigInteger
        startTime = System.nanoTime();
        BigInteger factBigResult = factorialBig(100); // For larger numbers
        endTime = System.nanoTime();
        System.out.println("Factorial (BigInteger): " + factBigResult);
        System.out.println("Factorial Runtime: " + (endTime - startTime) + " ns");

        // Calculate and measure Fibonacci
        startTime = System.nanoTime();
        long fibResult = fibonacci(40); // Or any number you want to test
        endTime = System.nanoTime();
        System.out.println("Fibonacci: " + fibResult);
        System.out.println("Fibonacci Runtime: " + (endTime - startTime) + " ns");
    }
}
