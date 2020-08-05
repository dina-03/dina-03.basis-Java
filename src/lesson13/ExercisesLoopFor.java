package lesson13;

public class ExercisesLoopFor {
    public static void main(String[] args) {
        // rectangle(7, 5);
        //floydsTriangle(7);
        //digitForMp(11, 11);
        mpGenerate(10);
        //digitFor(11,11);
    }

    public static void rectangle(int a, int b) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + star;
        }
        // System.out.println(line);
        for (int i = 0; i < b; i++) {
            System.out.println(line);
        }
    }

    public static void floydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println(" ");
        }
    }

    private static void mpGenerate(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(digitForMp(i, j));
            }
            System.out.println("");
        }
    }

    public static String digitForMp(int a, int b) {
        int number = 1;
        if (a * b < 10) {
            return " " + String.valueOf((a * b));
        } else if (a * b < 100) {
            return " " + String.valueOf((a * b));
        }
        return String.valueOf((a * b));
    }


    public static void digitFor(int a, int b) {
        int number = 1;
        for (int i = 1; i < a; i++) {
            System.out.print(number);
            number = number + 1;
            for (int j = 1; j < b; j++) {
                //System.out.print(number);
                //number = number + 1;
                System.out.print(i * j);
            }
            System.out.println("");
        }
    }
}
