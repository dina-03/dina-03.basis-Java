package lesson12;

public class Review {
    public static void main(String[] args) {
        int n = 10;
        triangle(10, 10);
    }

    public static void triangle(int countLine, int n) {
        String star = "*";
        String line = "";
        String space = " ";
        for (int i = 0; i < countLine; i++) {
            line = line + star;
            System.out.println(space + line);
        }
       /* for (int i = 0; i < countLine; i++) {
            for (int j = 10; j > n; j--) {
                line = line + star;
                System.out.println(line + space);
            }
            line = line + star;
            System.out.println(space + line + space);
        }*/
    }

}

