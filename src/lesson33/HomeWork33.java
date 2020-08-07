package lesson33;

import lesson30.GoodMorningArraysDayTwo;

import java.util.Arrays;

public class HomeWork33 {
    public static void main(String[] args) {
        /*int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        GoodMorningArraysDayTwo.myArrayPrint(makeLast(a1));//→ [0, 0, 0, 0, 0, 6]
        GoodMorningArraysDayTwo.myArrayPrint(makeLast(a2));//→ [0, 0, 0, 2]
        GoodMorningArraysDayTwo.myArrayPrint(makeLast(a3));//→ [0, 3]
        split();
        int[] ab1 = new int[]{1, 2, 3};
        int[] ab2 = new int[]{1, 3};
        int[] ac1 = new int[]{7, 2, 3};
        int[] ac2 = new int[]{1};
        int[] ad1 = new int[]{1, 2};
        int[] ad2 = new int[]{};
        start1(ab1, ab2); //→ 2
        start1(ac1, ac2); //→ 1
        start1(ad1, ad2); //→ 1*/
        int[] a01 = new int[]{1, 2};
        int[] a02 = new int[]{3, 4};
        int[] b01 = new int[]{4, 4};
        int[] b02 = new int[]{2, 2};
        int[] c01 = new int[]{9, 2};
        int[] c02 = new int[]{3, 4};
        System.out.println("plusTwo");
        myArrayPrint(plusTwo(a01, a02));// → [1, 2, 3, 4]
        myArrayPrint(plusTwo(b01, b02));// → [4, 4, 2, 2]
        myArrayPrint(plusTwo(c01, c02));// → [9, 2, 3, 4]
        split();
        System.out.println("maxTriple");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{1, 5, 3};
        int[] d3 = new int[]{5, 2, 3};
        System.out.println(maxTriple(d1));// →3
        System.out.println(maxTriple(d2));// →5
        System.out.println(maxTriple(d3));// →5
        split();
        System.out.println("make2");
        int[] ab1 = new int[]{4, 5};
        int[] ab2 = new int[]{1, 2, 3};
        int[] bc1 = new int[]{4};
        int[] bc2 = new int[]{1, 2, 3};
        int[] cd1 = new int[]{};
        int[] cd2 = new int[]{1, 2};
        myArrayPrint(make2(ab1, ab2));// → [4, 5]
        myArrayPrint(make2(bc1, bc2)); //→ [4, 1]
        myArrayPrint(make2(cd1, cd2)); //→ [1, 2]
    }

    /* 18. Учитывая 2 массива int, a и b, возвращаем новый массив длиной 2, содержащий столько,
         сколько поместится, элементов из a, а затем элементы из b.
         Массивы могут иметь любую длину, включая 0, но между 2 массивами будет 2 и более элементов.
         make2([4, 5], [1, 2, 3]) → [4, 5]
         make2([4], [1, 2, 3]) → [4, 1]
         make2([], [1, 2]) → [1, 2]*/
    private static int[] make2(int[] a, int[] b) {
        int[] output = new int[]{};
        /*if (a[1] < 2) {
            output[0] = a[0];
            output[1] = a[a.length - 1];
        } else if (a[1] == 0) {
            output[0] = a[0];
            output[1] = b[0];
        } else if (a[0] < 0) {
            output[0] = b[0];
            output[1] = b[1];
        }*/
        //я не знаю как решать!!!!
        return output;
    }


    /* 17. Учитывая массив нечетных длин, посмотрите на первое,
     последнее и среднее значения в массиве и верните наибольшее. Длина массива будет не менее 1.*/
    private static int maxTriple(int[] array) {
        int output = 0;
        if (array[0] > array[1] || array[0] > array[array.length - 1]) {
            output = array[0];
        } else if (array[1] > array[2] || array[1] > array[array.length - 1]) {
            output = array[1];
        } else if (array[2] > array[array.length - 1] || array[2] > array[1]) {
            output = array[2];
        }
        return output;
    }


    /*16. Учитывая 2 массива int, каждая длина 2, возвращает новую длину массива 4, содержащего все свои элементы.*/
    private static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];
        return output;
    }


    /* Начните с 2 int-массивов, a и b, любой длины.
      Верните, сколько массивов имеют 1 в качестве первого элемента.*/
    private static int[] start1(int[] a, int[] b) {
        //Задачу абсолютно не поняла, ни условие, ни что вывести!!!!
        return a;
    }


    /* Получив массив int, верните новый массив с удвоенной длиной,
       где его последний элемент равен оригинальному массиву, а все остальные элементы - 0.
       Оригинальный массив будет иметь длину 1 или более. Замечание: по умолчанию новый массив int содержит все 0.*/
    private static int[] makeLast(int[] input) {
        //int[] output = new int[0];
        for (int i = 0; i < input.length; i++) {
            input[i] = 0;
            input[0] = input[i] + input[i] + input[input.length - 1];

        }
        return input;
    }

    private static void split() {
        System.out.println("-----------------------");
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] fillArray(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            input[i] = value;
        }
        return input;
    }
}
