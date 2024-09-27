package exercicio;

import java.util.Scanner;
import exercicio.FibonacciChecker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (FibonacciChecker.isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
