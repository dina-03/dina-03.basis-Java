package lesson03;

public class GoodMorningDouble {
    public static void main(String[] args) {
        //3,5 => 3.5
        //helloDouble();
        //helloFloat();
        //findSquareCircle();
        helloDoubleTwo();
    }

    public static void helloFloat() {
        float a, b, c, d, e;
        a = (float) 3.5;
        b = 5.4F;
        c = 10.11f;
        d = a + b + c;
        e = 10.0f;
    }

    public static void helloDouble() {
        double a, b, c;
        int d, e, f;
        d = 10;
        f = 1000;
        e = d / f;
        System.out.println("количество купленных айфонов = " + e);
        a = 10.0;
        b = 20.0;
        c = a / b; //колличество черешни
        System.out.println("колличество черешни равно = " + c);
    }

    public static void findSquareCircle() {
        final double PI = 3.14; //фиксирование литерала
        final double minTemp = 18;
        final double maxTemp = 26;
        double r = 10;
        double square = PI * r * r;
        double anotherSquare = Math.PI * Math.pow(r, 2);
        double anotherPI = Math.PI;
        System.out.println("площадь круга равна " + square);
        System.out.println("площадь найденная java = " + anotherSquare);
    }

    public static void helloDoubleTwo() {
        double a = 10;
        double b = 5;
        double c = Math.pow(b, a);
        System.out.println("5 hoch 10 = " + c);
    }
}
