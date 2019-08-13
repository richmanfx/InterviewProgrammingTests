package fizzbuzz;

/**
 * Программа, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
 * а вместо чисел, кратных пяти — слово Buzz.
 * Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz.
 */

public class FizzBuzz {

    public static void main(String[] args) {


        // Решение "в лоб"
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <=100; i++) {

            if (i % 15 == 0) {
                result.append("FizzBuzz ");
            } else if (i % 5 == 0) {
                result.append("Buzz ");
            } else if (i % 3 == 0) {
                result.append("Fizz ");
            } else {
                result.append(String.format("%d ", i));
            }
        }
        System.out.print(result + "\n");


        // Решение с удалением слов, а не добавлением
        for (int i = 1; i <=100; i++) {

            String num = Integer.toString(i);
            String fizz = "Fizz";
            String buzz = "Buzz";

            if (i % 3 != 0) {
                fizz = "";
            } else {
                num = "";
            }

            if (i % 5 != 0) {
                buzz = "";
            } else {
                num = "";
            }

            System.out.print(num + fizz + buzz + " ");
        }

    }

}
