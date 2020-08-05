package lesson15;

public class StringReview {
    public static void main(String[] args) {
       /* review1();
        split();
        review2();
        split();
        review3();
        split();
        review4();*/
        //review5();
        //review6();
        //review7();
        review8();
    }

    public static void review8() {
        String hello = "Привет ";
        hello = hello.concat("Мир ");
        System.out.println(hello);
    }

    public static void review7() {
        String str = "Мы учимся в школе Телран онлайн";
        int cpc = str.codePointCount(5, 14);
        System.out.println(cpc);
    }

    //codePointBefore (int index) - пример использования
    public static void review6() {
        String str = "I love Java";
        System.out.println(str.codePointBefore(5));//место в таблице предыдущего символа
        System.out.println(str.codePointAt(5));
    }

    public static void review5() {
        String testStr = "13-я группа утро ";
        int result = testStr.codePointAt(4);//Место в таблице символов
        System.out.println(result);
    }

    //substring and char different
    public static void review4() {
        String hello = "Hello";
        String output = hello.substring(hello.length() - 2);
        System.out.println(output);
        char test = hello.charAt(hello.length() - 1);
        System.out.println(test);
    }

    //chart
    public static void review3() {
        String name = "Andrey";
        char myChar = name.charAt(2);
        System.out.println("Вторя буква из имени Андрей " + myChar);
        System.out.println(0 + myChar);
        int myMagicInt = myChar;
        char myMagicCharTest1 = (char) myMagicInt;
    }

    public static void review2() {
        double pi = 3.14;
        String myPI = String.valueOf(pi);//double to String
        String newString = myPI + "Andy";
        double newDigit = Double.parseDouble(myPI);//String to double
        System.out.println(newDigit);
    }

    //Sting to int
    public static void review1() {
        String number = "101";
        int result = Integer.parseInt(number);
        System.out.println("Результат преобразования = " + result);
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
