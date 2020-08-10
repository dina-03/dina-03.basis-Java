package lesson36;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        /*System.out.println(fizzBuzz(3));//"Fizz"
        System.out.println(fizzBuzz(5));// → "Buzz"
        System.out.println(fizzBuzz(15));// → "FizzBuzz"*/
        //fizzBuzz();
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));// → ["1", "2", "Fizz", "4", "Buzz"]
        split();
        fizzBuzz(1, 8);// → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        split();
        fizzBuzz(1, 11);// → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
        split();
        //fizzBuzz(1, 32);// → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

    }

    private static String[] fizzBuzz(int min, int max) {
        String[] output = new String[max - min];
        for (int i = 0; i < max - min; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output[i] = "FizzBuzz";
                // System.out.println("Fizz");
            } else if (i % 3 == 0) {
                output[i] = "Fizz";
                // System.out.println("Buzz");
            } else if (i % 5 == 0) {
                output[i] = "Buzz";
                // System.out.println("Fizzbuzz");
            } else {
                output[i] = String.valueOf(i);
                // System.out.println(i);
                
            }

        }
        return output;
    }

    /*Программа, которая печатает числа от 1 до 100.
       Но для кратных трех отпечатков "Fizz" вместо числа и для кратных пяти отпечатков "Buzz".
       Для чисел, кратных трем и пяти, печатающих "FizzBuzz".
       2. Это немного более сложная версия известной проблемы FizzBuzz,
       которая иногда дается в качестве первой проблемы для собеседований на работу. (См. также: FizzBuzz Code.)
        Рассмотрим ряд чисел, начинающихся в начале и заканчивающихся до, но не включая конец, так что, например,
        start=1 и end=5 дает серии 1, 2, 3, 4. Возвращаем новый массив String[], содержащий строковую форму этих чисел,
        за исключением кратных 3, используем "Fizz" вместо числа, для кратных 5 используем "Buzz",
        а для кратных 3 и 5 используем "FizzBuzz". В Java, String.valueOf(xxx) сделает строчную форму int или другого
         типа.
        Эта версия немного сложнее, чем обычная, так как нужно выделять и индексировать в массив вместо того,
        чтобы просто распечатывать, и мы варьируем начало/окончание вместо того, чтобы всегда делать 1...100.
       */


    private static String fizzBuzzSimple(int min, int max) {
        for (int i = min; i <= max; i++) {
            // System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else {
                System.out.println(i);
            }
        }

        return "";
    }

    public static void split() {
        System.out.println("--------------------");
    }


}
