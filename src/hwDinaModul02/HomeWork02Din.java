package hwDinaModul02;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork02Din {
    public static void main(String[] args) {
        String[] arrayName = {"Petya", "Kolya", "Olya", "Katya", "Sveta", "Masha"};
        //usersName(arrayName);
        findName(arrayName);
    }

        public static void findName(String[] array) {
            String name;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter name to find in array: ");
            name = scanner.nextLine();
            if (Arrays.asList(array).contains(name)) {
                System.out.println("Welcome, " + name);
            } else {
                System.out.println("Error! Name not found in array");
            }

        }
    public static void usersName(String[] arrayName) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce yourself: ");
       String name = scanner.next();
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].equals(name)) {
                count++;
                System.out.println("Hello, " + arrayName[i]);
                break;
            }
        }
        if (count == 0){
            System.out.println("Sorry, we're not acquainted");
        }
        scanner.close();
    }
}
