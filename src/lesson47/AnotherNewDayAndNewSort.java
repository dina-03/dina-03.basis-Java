package lesson47;

import java.util.Arrays;

public class AnotherNewDayAndNewSort {
    public static void main(String[] args) {
        //int k = v
        //int k = value
        //int n = k
        //key -> value
        int[] array = {22, 100, 55, 33, 88, 7};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    private static int[] insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) { //цикл начался не с 0 а с 1
            int newElement = input[i];//временная переменная которая, хранит значение
            int location = i - 1; //цикл начался не с 0 а с 1. предыдущее место от рассматриваемого массива
            while (location >= 0 && input[location] > newElement) {//пока значение от location > значения
                // элемента проверки
                input[location + 1] = input[location]; //присвоить значение на котором был элемент проверки значения
                // предыдущего элемента
                location = location - 1;// декрементация location
            }
            input[location + 1] = newElement; // значению location + 1 передаем значение из памяти
        }
        return input;
    }
}
