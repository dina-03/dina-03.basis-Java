package lesson02;

import java.sql.SQLOutput;

public class HelloInteger {
    public static void main(String[] args) {
        goodMorningInteger();
        findSquare();
    }

    public static void goodMorningInteger() {
        //мой код
        int a = 2; //переменная а равно литералу 2
        int b = 3;
        int c = a + b;

        System.out.print("сложение двух чисел 2 + 3 = " + c);//конкатенация
        int coat = 40;
        int pullover = 50;
        int baseCap = 15;
        int sum = coat + pullover + baseCap;
        System.out.println("\nСумма за покупки: " + (coat + pullover + baseCap) + " Euro");
        System.out.println("Проверка значения покупки = " + sum);

    }

    public static void findSquare() {
        int myFirstVariable = 5;
        int square = myFirstVariable * myFirstVariable;
        int perimeter = 4 * myFirstVariable;
        System.out.println("Площадь квадрата = " + square);
        System.out.println("Периметр квадрата = " + perimeter);
    }

}
