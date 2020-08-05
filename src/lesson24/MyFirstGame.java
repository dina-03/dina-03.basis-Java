package lesson24;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int range = getMeRange();
        System.out.println("Диапазон до 75: " + range);
        int tryAndCry = getMyTries();
        int computerDigit = createDigit(range);
        myGame(tryAndCry, computerDigit);
    }

    private static void myGame(int tryAndCry, int computerDigit) {
        int userTries;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tryAndCry; i++) {
            System.out.println("Введите пожалуйста свое число: ");
            userTries = input.nextInt();
            if (userTries == computerDigit){
                System.out.println("Вы угадали! ");
                check = true;
                break;
            }else  if (userTries > computerDigit){
                System.out.println("число меньше");
            }else {
                System.out.println("число больше");
            }
            if (!check){
                System.out.println("попытки закончились");
            }else {
               // System.out.println("Поздравляем!");
            }
        }
    }

    private static int getMyTries() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для игры: ");
        int userSecondNumber = input.nextInt();

        return userSecondNumber;
    }

    private static int createDigit(int range) {

        return (int) (Math.random() * (range - 1) + 1) + 1;

    }

    private  static int getMeRange(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для игры: ");
        int userFirstNumber = input.nextInt();

        return userFirstNumber;
    }
}
