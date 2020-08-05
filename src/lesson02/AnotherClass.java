package lesson02;

public class AnotherClass {     //это класс
    public static void main(String[] args) {
        addition();//это директива
        shoppingList();
        ekranirovanie();
    }

    public static void addition() {     //это метод
        System.out.print(5 + 3);
    }

    public static void shoppingList() {
        System.out.println("\nКупи:");
        System.out.println("хлеб");
        System.out.println("молоко");
        System.out.println("овощи");
    }

    public static void ekranirovanie() {
        System.out.println("вывод кавычек на экран \"\"   ");

    }
}
