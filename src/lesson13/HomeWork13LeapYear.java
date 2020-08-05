package lesson13;

public class HomeWork13LeapYear {
    public static void main(String[] args) {

        System.out.println("1700 високосный год : " + leapYear(1700));
        System.out.println("1800 високосный год : " + leapYear(1800));
        System.out.println("1900 високосный год : " + leapYear(1900));
        System.out.println("2100 високосный год : " + leapYear(2100));
        System.out.println("2020 високосный год : " + leapYear(2020));
        System.out.println("2024 високосный год : " + leapYear(2024));
        System.out.println("--~~~~~~~~~~~~~~---~~~~~~~~~~~~~~--");
        System.out.println("2024 високосный год : " + leapYearNew(2024));
        System.out.println("2012 високосный год : " + leapYearNew(2012));
        System.out.println("2010 високосный год : " + leapYearNew(2010));
        System.out.println("--~~~~~~~~~~~~~~---~~~~~~~~~~~~~~--");
         numberX();
        //primeNumberOne(50);
       //System.out.println("Число проверка " + primeNumberOne(21));
    }

    public static boolean leapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYearNew(int year) {

        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberX() {
       /* int a, b, x, c, y;
        a = 32;
        b = 58;
        x = 0;
        if (x < 3000) {
        } else if (x % a == 30 && 30 * x == a) {
            System.out.println("При делении числа на 32 = " + x);
        }*/
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }

        }
    }

    public static boolean primeNumberOne(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
                //
            }
            return true;
        }
        return true;
    }
}
