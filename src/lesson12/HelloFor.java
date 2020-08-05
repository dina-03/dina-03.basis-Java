package lesson12;

public class HelloFor {
    public static void main(String[] args) {
        homeWork12();
        // homeWork12_2(10, 5);
        //homeWork12_3(5, 17);
        //homeWork12_4(3, 10);
        homeWork12_5(10);
    }

    public static void homeWork12() {
       /* for (int i = 0; i < 20; i *= 2) {
            System.out.println(i);
        }*/
    }

    public static void homeWork12_2(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void homeWork12_3(int a, int b) {
        for (int i = 5; i < 17; i++) {
            System.out.println(i);
        }
    }

    public static void homeWork12_4(int a, int b) {
        for (int i = 3; i < 10; i++) {

        }
    }

    public static void homeWork12_5(int n) {
        String star = "*";
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + star;
            System.out.println(output);
        }

    }
}
