package lesson21;

import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
       /* System.out.println("Hello World");
        System.out.println();*/
        /*Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Сколько тебе лет");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("Можешь покупать любое спиртное");
        } else {
            System.out.println("Иди отсюда мальчик!!!!");
        }

        System.out.println("А как тебя зовут?");
        String name = input.next();
        System.out.println("Привет " + name);*/
        // helloUser();
        findNumber(100);
    }

    /* Напишите программу, которой надо представиться. Данные, которые спрашивает машина:
    имя, фамилия, пол, возраст, e-mail.
    Для считывания данных типа String используйте метод next(): input.next()*/
    public static void helloUser() {
        String name = "", surname = "", gender = "", email = "";
        int age = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        name = userInput.next();
        System.out.println("Как ваша фамилия?");
        surname = userInput.next();
        System.out.println("Какой ваш пол?");
        gender = userInput.next();
        System.out.println("Ваш e-mail?");
        email = userInput.next();
        System.out.println("Ваш возраст?");
        age = userInput.nextInt();

        System.out.println("Добро пожаловать на сайт" + name);
        System.out.println("Проверьте свои данные: " + name + " " + surname + " " + gender + " " + email + " " + age);

    }

    /* Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
    После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
    В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).*/
    public static void findNumber(int n) {
        int number = (int) (Math.random() * ((n - 1) + 1)) + 1;
        int userNumber = 0;
        System.out.println(number);

        for (int i = 1; i <= 3; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println(i + "Угадайте число");
            userNumber = userInput.nextInt();
            if (number > userNumber) {
                System.out.println("не угадал. Загаданное число больше");
            } else if (n < userNumber) {
                System.out.println("не угадал. Загаданное число меньше");
            } else
                System.out.println("Uraa!");
        }
        System.out.println("Попытки закончились");
    }
}
