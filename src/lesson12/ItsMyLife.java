package lesson12;

public class ItsMyLife {
    public static void main(String[] args) {
        myLittleFor();
    }

    public static void myLittleFor() {
        int a = 0;
        for (int i = 0; i < 25; i++) {
            a++;
            System.out.println(a);
        }
        for (int i = 0; i < 45; i++) {
            int b = 7;
            a = a + b;
            System.out.println(b);

        }
        System.out.println(a);

    }
}
