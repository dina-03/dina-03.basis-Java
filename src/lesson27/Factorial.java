package lesson27;

/* Найдите факториал числа 6; x = 6!
 * x = 1*2*3*4*5*6;    */
public class Factorial {
    public static void main(String[] args) {
        /*System.out.println(findFactorial(5));
        System.out.println(findFactorial(7));
        System.out.println(findFactorial(10));
        System.out.println(findFactorial(20));
        System.out.println(findFactRecursion(5));
        System.out.println(findFactRecursion(10));*/
    }

    private static int findFactRecursion(int number) {
        if (number > 1) {
            return number * findFactRecursion(number - 1);
        } else {
            return 1;
        }

    }

    private static int findFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
