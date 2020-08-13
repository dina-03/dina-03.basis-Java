package lesson39;

public class searchFor {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 4) {  //while (i == 4)
                System.out.println("распечатай 4 ");
                break; //выходим из цикла
            }
            System.out.println("i = " + i);
        }
        System.out.println("Цикл завершен");
    }
}
