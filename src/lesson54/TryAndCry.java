package lesson54;

public class TryAndCry {
    public static void main(String[] args) {
       /* int[] array = new int[5];
        int element = array[5];*/
       // testArr();
        myParsing();
    }

    private static void myParsing() {
        String str1 ="1965";
        String str2 ="№123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);
        try {
            int num2 = Integer.parseInt(str2);
            //это условие скорее всего никогда не выполнится,
            // потому что у нас есть ошибка выше
            System.out.println("я никогда не увижу терминал");
        }catch (NumberFormatException ex){
            System.out.println("exception caught");
        }finally {
            System.out.println("nothing happened");
            System.out.println("use Character.isDigit() and for loop for solving issue ");
        }
    }

    private static void testArr() {
        int[] array = new int[5];
        try {
            int element = array[5];
            //это условие скорее всего никогда не выполнится,
            // потому что у нас есть ошибка выше
            System.out.println("я никогда не увижу терминал");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("мы ее поймали, ошибку 456");
        }finally {
            System.out.println("Выполнение завершающего блока, например рестарт программы");
        }
        //и все равно работай дальше
        System.out.println("Область видимости программы вне конструкта TryAndCry");
    }
}
