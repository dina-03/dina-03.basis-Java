package lesson20;

public class Proof {
    public static void main(String[] args) {
        // mySimpleMethod("test", 19);
        // multiplicationTable(3);
        // printLeapYear(2000, 2009);
        //System.out.println(countLeapYears(2000, 2009));
        printDivisors(32);
    }

    public static void printDivisors(int n) {
        String output = "";
        int count = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total divisors: " + count);
    }

    public static int countLeapYears(int one, int two) {
        int count = 0;
        for (int i = one; i < two; i++) {
            if (leapYear(i)) {
                count++;
            }
        }

        return count;
    }

    private static void mySimpleMethod(String str, int digit) {
        if (digit > 0) {
            for (int i = 0; i < digit; i++) {
                System.out.println(str);
            }
        }
       /* for (int i = 0; i < digit; i++) {
            System.out.println(str);
        }*/
        System.out.println("Наше число меньше нуля, задайте другое");

    }

    /* Реализовать метод печатающий таблицу умножения для заданного числа Пример: multiplicationTable(3)->
    3x1=3
    3x2=6
    ….
    3x10=30*/
    public static void multiplicationTable(int digit) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result = "" + digit + "*" + i + "=" + digit * i;
            System.out.println(result);
        }
    }

    public static void printLeapYear(int yearOne, int yearTwo) {
        for (int i = yearOne; i <= yearTwo; i++) {
            if (leapYear(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean leapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
