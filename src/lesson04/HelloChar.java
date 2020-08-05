package lesson04;

public class HelloChar {
    public static void main(String[] args) {
        goodMorningChar();

    }

    public static void goodMorningChar() {
        char c;
        c = 1000;
        System.out.println("test " + c);
        char anotherCharNew = '\u0021';
        char anotherCharTyp = '\u0440';
        char abc = 'A';
        System.out.println(anotherCharNew);
        System.out.println(anotherCharTyp);
        System.out.println(abc);
        char euro = '€';
        char dollar = '$';
        System.out.println(euro);
        System.out.println(dollar);
        char tm = '∞';
        System.out.println(tm);
        char specialSymbol = '\t';
        System.out.println("вывод табулятора на экран " + specialSymbol);
        System.out.println(""+euro+dollar+specialSymbol+tm+abc);
    }
}
