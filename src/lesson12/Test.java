package lesson12;

public class Test {
    public static void main(String[] args) {
        testStar(10);
    }

    public static void testStar(int height) {
        for (int num = (height * 2) - 1, num2 = 0; num > 0; num2++, num -= 2) {
            // мы рисуем пробелы
            for (int i = 0; i < num2; i++) {
                System.out.print(" ");
            }
            // мы рисуем звездочки
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            // перепрыгиваем через линию
            System.out.println("");
        }
    }
}
//num = height++,