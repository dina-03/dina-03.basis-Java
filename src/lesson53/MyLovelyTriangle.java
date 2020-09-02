package lesson53;

public class MyLovelyTriangle {
    public static void main(String[] args) {
        //каждая строчка состоит из
        // 1. n - i пробелов
        // 2. из цифр (i) напечатанная (i + i - 1) раз
        // triangle(6);
        //System.out.println("-------");
        triangleTwo(6);
        //createSpace(6);
        //System.out.println(createSpaceTwo(6));

    }

    private static String createSpaceTwo(int n) {
        String result = "";
        String symbol = "+";
        for (int i = 1; i <= n; i++) {
            result += symbol;
        }
        System.out.println(result);
        for (int i = 0; i < result.length(); i++) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    private static void createSpace(int n) {
        for (int i = 1; i <= n; i++) {
            // System.out.println("+");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void triangleTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                //createSpace(i);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i);
            }

            System.out.println();
        }
    }

    private static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j + "");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
        // System.out.println();
    }
}
