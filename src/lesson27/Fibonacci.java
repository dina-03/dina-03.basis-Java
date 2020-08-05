package lesson27;

public class Fibonacci {
    public static void main(String[] args) {
        //simpleFibonacci(10);
        //findFibonacciRecursion(10);
        fibonacciExample();
    }

    private static void fibonacciExample() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0 + "\n" + n1 + " "); // 1 1
        for (int i = 3; i < 11; i++) {
            n2 = n0 + n1;
            System.out.println(n2 + " "); // 2 3 5 8 13 21 34 55
            n0 = n1;
            n1 = n2;
        }
    }

    private static int findFibonacciRecursion(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return findFibonacciRecursion(number - 1) + findFibonacciRecursion(number - 2);
        }

    }

    private static void simpleFibonacci(int number) {
        int n0 = 0;
        int n1 = 1;
        int nN;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 1; i < number; i++) {
            nN = n0 + n1;
            System.out.print(nN + " ");
            n0 = n1;
            n1 = nN;
        }
        System.out.println();
    }
}
