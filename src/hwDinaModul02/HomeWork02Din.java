package hwDinaModul02;

import java.util.Scanner;

public class HomeWork02Din {
    public static void main(String[] args) {
        String[] arrayName = {"Petya", "Kolya", "Olya", "Katya"};
        usersName(arrayName);
    }

    public static void usersName(String[] arrayName) {
        String name = "";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce yourself: ");
        name = scanner.next().toString();
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].equals(name)) {
                System.out.println("Hello, " + arrayName[i]);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Sorry, we're not acquainted");
        }
        scanner.close();
    }
}
