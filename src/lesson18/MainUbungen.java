package lesson18;

public class MainUbungen {
    public static void main(String[] args) {
        //mySimpleFor();
        //mySimpleWhile();
        //mySimpleDoWhile();
        //myNotSimpleWhile();
        myMethod();
    }

    private static void myMethod() {
        int x = 2;
        int y = 3;
        int z = 4;
        if (x == 2 && y <= 3)
            System.out.println("правда");
        else
            System.out.println("кривда");
    }

    private static void myNotSimpleWhile() {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i < 20) {
                break;
            }
        }
    }

    private static void mySimpleDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 20);

    }


    private static void mySimpleWhile() {
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }

    private static void mySimpleFor() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }


}
