package lesson12;

public class HomeWork12Pyramid {
    public static void main(String[] args) {
        backwardPyramid(10);
        backwardPyramid02(10);
    }

    public static void backwardPyramid(int height) {
        String star = "*";
        String output = "";
        String space = " ";
        for (int num = height++, num2 = 0; num > 0; num2++, num = height--) {
            // мы рисуем пробелы
            for (int i = 0; i < num; i++) {
                System.out.print(space);
            }
            // мы рисуем звездочки
            for (int j = 0; j < num2; j++) {
                //output = output + star;
                System.out.print(star);
            }
            // перепрыгиваем через линию
            System.out.println(output);
        }
    }

    public static void backwardPyramid02(int height) {
        String star = "*";
        String output = "";
        String space = " ";
        for (int num = (height * 2) - 1, num2 = 0; num > 0; num2++, num -= 2) {
            // мы рисуем пробелы
            for (int i = 0; i < num2; i++) {
                System.out.print(space);
            }
            // мы рисуем звездочки
            for (int j = 0; j < num; j++) {
                //output = output + star;
                System.out.print(star);
            }
            // перепрыгиваем через линию
            System.out.println(output);
        }
    }
}
