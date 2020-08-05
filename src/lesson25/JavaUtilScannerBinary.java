package lesson25;

import java.util.Scanner;

public class JavaUtilScannerBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal, remainder;
        String output = "";
        System.out.println("Введите десятичное число, например 13 ");
        decimal = input.nextInt();
        while (decimal > 0) {
            remainder = (decimal % 2);
            output = Integer.toString(remainder) + output; // переводит число в строку
            decimal = decimal / 2;
        }
        System.out.println(output);
    }

}
