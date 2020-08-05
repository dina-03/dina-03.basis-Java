package lesson02;

public class Calculator {
    public static void main(String[] args) {
       // System.out.print("Здесь будет калькулятор:");
       // System.out.println();
       // helloLong();
        //helloByte();
        //helloShort();
        //hallyhalloByte();
    }

    public static void helloLong() {
        long a = 6780978670L;
        long b = 1234567789L;
        long c = 786_523_647_658_356L;
        long sum = a + b + c;
        System.out.println("Здесь должна быть сумма трех очень больших переменных " + sum);
    }

    public static void helloByte() {
        byte a = 111;
        short b = 1111;
        int c = 1_111_111_111;
        long d = 123_456_678_999_986_098L;
        // Постфикс l или L обозначает литералы типа long.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void hallyhalloByte(){
        byte myLittleFirstByteToday = 2;
        byte b = 3;
        byte sum = (byte) (myLittleFirstByteToday + b);
        System.out.println(sum);

    }
    public static void helloShort(){
        short a = 3;
        short b = 4;
        short c = (short) (a + b);
        System.out.println(c);
    }
    public static void helloLongNew(){
        long a, b, c, d, e;
        a = 12345667845L;
        b = 8976543678L;
        c = 19910;
        d = 12_567_546_347_908_4566L;
        int myFirstInt, mySecondInt;
        myFirstInt = 768574;
        mySecondInt = 867577;

    }
    public static void helloBinary(){
        int hexValue1 = 0x100; //Шестнадцатеричная система счисления
        int binary = 0B1001_1_0_111; // Двоичная система счисления
        int octal = 4567; //Восьмеричная система счисления
        //Definition, declaration, initialization
        //Определение, объявление, инициализация переменных
    }
}
