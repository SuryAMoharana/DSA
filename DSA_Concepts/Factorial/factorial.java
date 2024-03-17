package Factorial;

public class factorial {
    public static void main(String[] args) {
        int n = 5; // Number to calculate factorial for

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
