package lesson21;

import java.util.Scanner;

/* 1.Добавить интерактивности в игру.
Пользователь должен выбирать диапазон загадывания числа и количество попыток самостоятельно.
2. Со звёздочкой. Сделайте генератор паролей. У пользователя компьютер должен спросить длину пароля
и должны ли содержаться только буквы или буквы и цифры.*/
public class HomeWork21 {
    public static void main(String[] args) {
        interactiveGame();
    }

    public static void interactiveGame() {
        int n = attempt();
        int p = attemptNumberOfTime();
        int number = randomNumber(100);
        guess(p, n, number);
    }

    public static int attemptNumberOfTime() {
        int p = 0;
        System.out.println("Выберите количество попыток: \n от 1 до 3 \n Введите 1, 2 или 3 ");
        Scanner input = new Scanner(System.in);
        int userGameM = input.nextInt();
        if (userGameM == 1) {
            p = 3;
        } else
            p = 1;
        return p;
    }

    public static void guess(int p, int n, int compNumber) {
        int userGuess = 0;
        int answer = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= n; i++) {
            System.out.println("Угадайте число ");
            userGuess = input.nextInt();
            if (userGuess == compNumber) {
                System.out.println("Молодец, вы угадали число!");
                answer = 1;
                break;
            } else if (userGuess < compNumber) {
                System.out.println("Число должно быть больше, попробуйте еще раз! ");
            } else {
                System.out.println("Число должно быть меньше, попробуйте еще раз! ");
            }
        }
        if (answer != 1) {
            System.out.println("Game over!");
        }
       /* for (int i = 0; i <= p; i++) {

        }*/
    }

    private static int randomNumber(int range) {
        int number = (int) (Math.random() * (range - 1) + 1) + 1;
        return number;
    }

    public static int attempt() {
        int m = 0;
        System.out.println("Выберите уровень сложности: \n легкий (1) или сложный (2)? \n Введите 1 или 2 ");
        Scanner input = new Scanner(System.in);
        int userGameM = input.nextInt();
        if (userGameM == 3) {
            m = 3;
        } else if (userGameM == 2) {
            m = 2;
        } else if (userGameM == 1) {
            m = 1;
        }

        return m;
    }

}
