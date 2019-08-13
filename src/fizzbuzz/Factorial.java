package fizzbuzz;

/**
 * Расчёт факториала.
 * Факториал N - произведение всех натуральных числе от 1 до N.
 * Применимое только для целых неотрицательных чисел.
 * 0! = 1
 * n! = n*(n-1)!
 */

public class Factorial {

    public static void main(String[] args) {

        int N = 5;

        // Решение циклом
        int factorial = 1;
        for(int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.printf("Факториал %d (циклом): %d\n", N, factorial);


        // Решение рекурсией
        System.out.printf("Факториал %d (рекурсией): %d\n", N, FactorialFunc(N));

    }

    private static int FactorialFunc(int N) {

        int result;

        if (N == 0) {
            result = 1;
        } else {
            result = N * FactorialFunc(N - 1);
        }

        return result;
    }


}
