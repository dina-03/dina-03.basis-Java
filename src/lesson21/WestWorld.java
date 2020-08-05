package lesson21;

import java.util.Scanner;

public class WestWorld {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int k = tryAndCry();
        int number = magicNumber(10);

        guess(k, number);
    }

    private static void guess(int k, int compNumber) {
        int userTryGuess = 0;
        int answer = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= k; i++) {
            System.out.println("Угадай число: ");
            userTryGuess = input.nextInt();
            if (userTryGuess == compNumber) {
                System.out.println("Вы угадали!");
                answer = 1;
                break;
            } else if (userTryGuess < compNumber) {
                System.out.println("Загаданное число больше ");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
            if (answer == 1){
                System.out.println("Попытки закончились, вы проиграли...");
            }
    }

    public static int magicNumber(int range) {
        int number = (int) (Math.random() * ((range - 1) + 1)) + 1;

        return number;
    }

    public static int tryAndCry() {
        int k = 0;
        System.out.println("Какой уровень сложности в хотите? \n " +
                "Легкий(1)? или для взрослых(2)? Введите 1 или 2");

        Scanner input = new Scanner(System.in);
        int userGameK = input.nextInt();
        if (userGameK == 1) {
            k = 10;
        } else
            k = 5;
        return k;
    }
}
