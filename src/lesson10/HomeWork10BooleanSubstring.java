package lesson10;

/* Given a string, return true if the string starts with "hi" and false otherwise.
Получив строку, верните true, если строка начинается с "hi" и false иначе
        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false
_______________________________

We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are
teen. Мы скажем, что номер "подросток", если он находится в диапазоне 13...19 включительно.
Учитывая 3 значения int, вернитесь к истинному, если 1 или более из них
Подросток.
        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true*/
public class HomeWork10BooleanSubstring {
    public static void main(String[] args) {
        /*String hi;
        String there;
        String hello;*/
        System.out.println(startHi("hi there"));//→ true
        System.out.println(startHi("hi"));//→ true
        System.out.println(startHi("hello hi"));//→ false
    }

    public static boolean startHi(String justVariable) {
        String etalon = "hi";
        String start = justVariable.substring(0, 2);
       /* int a = 3;
        int b = 2;
        if (a != b) {
            System.out.println("Pobeda");
        }*/
        return etalon.equals(start);
    }

}
