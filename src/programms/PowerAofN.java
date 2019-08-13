package programms;


/**
 * Рассчитать A (вещественное) в степени N (натуральное)
 */

public class PowerAofN {

    public static void main(String[] args) {

        double A = 2.0;
        int N = 8;

        System.out.printf("%f в степени %d: %f\n", A, N, powFunc(A, N));

    }


    private static double powFunc(double a, int n) {

        double result = 1.0;

        for (int i=0; i<n; i++) {
            result *= a;
        }

        return result;
    }

}
