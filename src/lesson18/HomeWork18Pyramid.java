package lesson18;

public class HomeWork18Pyramid {
    public static void main(String[] args) {
        System.out.println("Вывод числа А B раз:");
        repetitionOfNumber(5, 7);
        split();
        increasingNumbers();
        split();
        starsPyramid(10, 10);
        split();
        System.out.println(doubleChar("Dogs"));

    }

    public static void split() {
        System.out.println("-------------------");
    }

    private static void starsPyramid(int countLine, int n) {
        String star = "*";
        String line = "";
        String space = " ";
        int i = 0;
        while (i < countLine) {
            line = line + star;
            System.out.println(space + line);
            i++;
        }
    }

    private static void increasingNumbers() {
        int a = 5;
        int b = 17;
        int i = 0;
        do {
            System.out.println("Вывод чисел от 5 до 17: ");
            i++;
        } while (i >= a);
        for (int j = a; j <= b; j++) {
            System.out.println(j);
        }
    }

    public static void repetitionOfNumber(int A, int B) {
        int i = 0;
        while (true) {
            System.out.println(A);
            i++;
            if (i >= B) {
                break;
            }
        }
    }

    public static String doubleChar(String sym) {
        String str = "";
        int i = 0;
        while (i < sym.length()){
            str = str + sym.charAt(i) + sym.charAt(i);
            i++;
        }
        return str;
    }
}
