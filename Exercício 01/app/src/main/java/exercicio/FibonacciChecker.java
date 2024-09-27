package exercicio;

public class FibonacciChecker {

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, fib = 0;
        while (fib < num) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib == num;
    }
}