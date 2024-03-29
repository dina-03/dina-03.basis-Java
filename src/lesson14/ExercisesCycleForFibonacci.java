package lesson14;

public class ExercisesCycleForFibonacci {
    public static void main(String[] args) {
        //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        myLine(100); //->7 14 21 28 35 42 49 56 63 70 77 84 91 98
        //Вывести алфавит от A-Z по 4 шт. в строку
        //findHappyDumpling();
        //findVariables();
        //myLine();
        alphabet();
        System.out.println(repeatSymbol("z", 10));
        fibonacci();
       /* String variable1 = "Adrey";
        System.out.println(variable1.substring(0, 1));*/
        // System.out.println(reversNumber(123));
    }

    public static void findHappyDumpling() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                System.out.println("Здесь счастливый пельмень!!!");
            }
        }
    }

    public static void findVariables() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void myLine(int n) {
        for (int i = 7; i < n; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void alphabet() {
        /*for (int i = 60; i < 97; i++) {
        char char1 = (char) i;
            System.out.print(char1 + " ");
            }*/
        for (int i = 65; i < 90; i++) {
            char char1 = (char) i;
            String str1 = String.valueOf(char1);
            System.out.print(repeatSymbol(str1, 4));
        }
    }

    public static String repeatSymbol(String symbol, int repeatNumber) {
        String output = "";
        for (int i = 0; i < repeatNumber; i++) {
            output = output + symbol;
        }
        return output;
    }

    /* Выведите на экран первые 11 членов последовательности Фибоначчи.
    первый и второй члены последовательности равны единицам
    а каждый следующий — сумме двух предыдущих
    То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.*/
    public static void fibonacci() {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

    /*Дано целое трехзначное число.
    Написать метод, который возвращает число,
    записанное в обратном порядке, например:
    123 -> 321
    768 -> 867 */
    public static int reversNumber(int n) {
        String input = String.valueOf(n);
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.substring(i, i + 1);
            //System.out.println(output);
        }
        int result = Integer.parseInt(output);
        return result;
    }

    /*Дано целое трехзначное число. Написать метод,
    который возвращает сумму разрядов этого числа, например:
    123 -> 6  (1+2+3)
    768 -> 21 (7+6+8) */
    public static int sumNumbers(int n) {

        return 0;
    }
}
