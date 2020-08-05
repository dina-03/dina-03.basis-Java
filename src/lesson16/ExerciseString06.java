package lesson16;

public class ExerciseString06 {
    public static void main(String[] args) {
        /*System.out.println(startWord("hippo", "hi"));// →"hi"
        System.out.println(startWord("hippo", "xip"));// →"hip"
        System.out.println(startWord("hippo", "i"));// →"h"
        System.out.println(makeAbba("Hi", "Bye"));// →"HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// →"YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// →"WhatUpUpWhat"
        System.out.println(extraEnd("Hello"));// →"lololo"
        System.out.println(extraEnd("ab"));// →"ababab"
        System.out.println(extraEnd("Hi"));// →"HiHiHi"*/
        System.out.println(withoutEnd("Hello"));// →"ell"
        System.out.println(withoutEnd("java"));// →"av"
        System.out.println(withoutEnd("coding"));// →"odin"
    }

    /* Получив строку, верните версию без первого и последнего символа char,
    так что "Hello" дает "ell". Длина строки будет как минимум 2.*/
    public static String withoutEnd(String s) {

        return s.substring(1, s.length() - 1);
    }

    /*Получив строку, верните новую строку, сделанную из 3 копий последних 2-х графиков исходной строки.
    Длина строки будет как минимум 2. */
    public static String extraEnd(String a) {
        a = a.substring(a.length() - 2);
        return a + a + a;
    }

    /* Учитывая две строки, а и б, возвращаем результат их объединения в порядке абба,
    например, "Привет" и "Пока" возвращаем "ХайБайБайХай".*/
    public static String makeAbba(String a, String b) {

        return a + b + b + a;
    }

    /* Получив строку и вторую "слово", скажем, что слово совпадает со строкой,
    если оно появляется в передней части строки, за исключением того,
    что первый символ не обязательно должен точно совпадать.
    При совпадении верните переднюю часть строки, либо в противном случае верните пустую строку.
    Итак, при использовании строки "hippo" слово "hi" возвращает "hi", а "xip" - "hip".
    Слово будет как минимум длиной 1.*/
    public static String startWord(String s, String word) {
        int is = s.length();
        int iWord = word.length();

        return s.substring(0, word.length());
    }
}
