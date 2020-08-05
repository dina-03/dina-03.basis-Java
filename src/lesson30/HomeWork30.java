package lesson30;

public class HomeWork30 {
    public static void main(String[] args) {
        myLovelyChar();
        System.out.println("___________________");
        System.out.println("НОД двух чисел равен: ");
        System.out.println(findNod(9, 12));
        System.out.println(findNod(12, 16));
        System.out.println(findNod(12, 24));
        System.out.println(findNod(15, 60));
        System.out.println(findNod(7, 3));
        System.out.println("НОК двух чисел равен: ");
        System.out.println(findNok(9, 12));
        System.out.println(findNok(50, 180));
        System.out.println(findNok(60, 15));
    }

    private static int findNok(int x, int y) {
        for (int i = 0; i < x; i++) {
            x = (x * y) / findNod(x,y);
        }
        return x;
    }

    private static int findNod(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }

    private static void myLovelyChar() {
        char[] cyrillic = new char[]{'ж', ' ', 'ц', ' ', 'ш', ' ', 'щ', ' ', 'ь', ' ', 'ф', ' ',
                'э', ' ', 'ю', ' ', 'я'};
        System.out.println(cyrillic);
        System.out.println("с пробелами длина char - " + cyrillic.length);
    }

}
