package lesson03;

public class HomeWorkCircleConverterSquareCountryRatio {
    public static void main(String[] args) {
        //squareCircle();
        //diagonalCircle();
        //currencyConverter();
        //countryRatio();
        //areaDifferenceCalculation();
        //task();
        myDouble();

    }

    public static void squareCircle() {
        final double r = 15;
        final double PI = 3.14;
        final double sq = PI * r * r;
        System.out.print("площадь круга, при окружности 15см, равна: " + sq);
        System.out.println("cm");
        System.out.print("----------------------------------------------------------");
    }

    public static void diagonalCircle() {
        final double r = 7;
        final double PI = 3.14;
        final double d = r * r;
        final double c = PI * d;

        System.out.println("\nдлина окружности круга равна: " + c);

    }

    public static void currencyConverter() {
        float eu = 1;
        float doll = 1.1F;
        float prs = 100;
        float convert = doll * prs / eu;
        System.out.println("----------------------------------------------------------");
        System.out.print("при курсе евро к доллару(1.1) 100€ = " + convert);
        System.out.println("$");

    }

    public static void countryRatio() {
        float s1, s2, result;
        s1 = 207595; //площадь Беларуссии
        s2 = 603628; //площадь Украины
        result = s1 / s2;
        System.out.println("----------------------------------------------------------");
        System.out.print("соотношение площади Беларуссии к Украине будет составлять: " + result);
        System.out.println(" километров в квадрате");

    }

    public static void areaDifferenceCalculation() {
        float s1, s2, result;
        s1 = 891.8F;
        s2 = 2511;
        result = s2 / s1;
        System.out.println("----------------------------------------------------------");
        System.out.println("площадь Москвы больше площади Берлина на " + result);

    }

    public static void task() {
        double a, b, b1, c, c1, d, d1, e, e1, f, f1, g, g1, h, sum, p;
        a = 1000.00; //начальный счет в банке
        p = 3.5;
        b = a / 100 * p;//доход за первый год
        b1 = a + b;//сумма вместе с доходом за первый год

        c = b1 / 100 * p;//доход за 2 год
        c1 = c + b1;//сумма вместе с доходом за 2 год

        d = c1 / 100 * p;//доход за третий год
        d1 = c1 + d;//сумма вместе с доходом за 3 год

        e = d1 / 100 * p;//доход за 4 год
        e1 = e + d1;//сумма вместе с доходом за 4 год

        f = e1 / 100 * p;//доход за 5 год
        f1 = f + e1;//сумма вместе с доходом за 5 год

        g = f1 / 100 * p;//доход за 6 год
        g1 = g + f1;//сумма вместе с доходом за 6 год

        h = g1 / 100 * p;//сумма за 7 год
        sum = h + g1;
        System.out.println("----------------------------------------------------------");
        System.out.print("Если клиент положил 1000€ под 3.5%, то за 7 лет он получит: " + sum);
        System.out.println("€");
        System.out.println("----------------------------------------------------------");

    }

    public static void myDouble() {
        double d = 50.0;
        float f = 75.0f;
        double myConst = Math.PI;
        System.out.println("myConst из библиотеки Math = " + myConst);
        double test = Math.pow(d, f);
        double myNewPi = myLovelyRound(myConst);
        System.out.println("myNewPI = " + myNewPi);
        double myTestVariable = 345456.764837;

    }

    public static double myLovelyRound(double digitsToRound) {
        double temp0 = digitsToRound * 100;
        System.out.println("myNewPi = " + temp0);
        int temp1 = (int) temp0;
        System.out.println("отсечь хвост temp1 = " + temp1);
        temp0 = temp1;
        System.out.println("3. Мы присваиваем значение в double " + temp0);
        temp0 = temp0 / 100;
        System.out.println("4. " + temp0);
        return temp0;
    }

}