package lesson22;

public class MyLovelyTernarOperator {
    public static void main(String[] args) {
        /*test1();
        test2();
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
        System.out.println(caughtSpeeding(85, true));// → 1
        System.out.println(caughtSpeeding(85, false));// → 2
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true*/
        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(40));// → false
        System.out.println(more20(41));// → true
    }

    /*Возвращает true, если заданное неотрицательное число больше 1 или 2,
    чем кратное 20. См. также: Введение в моду
       */
    private static boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2);
    }


    /* Номер 6 - это поистине великое число. При двух значениях int, a и b, возвращаем true,
    если одно из них равно 6. Или если их сумма или разность равна 6.
    Примечание: функция Math.abs(number) вычисляет абсолютное значение числа.*/
    private static boolean love6(int a, int b) {
        return (a == 6) || (b == 6) || ((a + b) == 6) || Math.abs(a - b) == 6;
    }

    /* Ты едешь слишком быстро, и полицейский останавливает тебя. Напишите код для вычисления результата,
    закодированный в виде значения int: 0=нет билета, 1=маленький билет, 2=большой билет.
    Если скорость 60 или меньше, результат равен 0. Если скорость от 61 до 80 включительно, результат равен 1.
    Если скорость 81 или больше, результат равен 2.
    Если не день рождения - в этот день скорость может быть на 5 выше во всех случаях.*/
    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else
            return 2;
    }

    private static void test2() {
        int a = 10;
        int b = 20;
        int c;
        c = (a > b) ? a : b;//переменная = (выражение) ? значение if true : значение if false
        System.out.println("c из тернарного оператора " + c);
    }

    private static void test1() {
        int a = 10;
        int b = 20;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println("c из if-else оператора " + c);
    }
}
