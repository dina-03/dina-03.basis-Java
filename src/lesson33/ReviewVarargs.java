package lesson33;

public class ReviewVarargs {
    public static void main(String[] args) {
        //System.out.println(sum(2, 3, 5));
        //sum("Мои первые varargs ", 2, 3, 5, 100);
        //citiesTable("Berlin", "München", "Düsseldorf", "Москва");
        System.out.println(charToString('A', 'n', 'd', 'r', 'e', 'y'));
    }

    public static String charToString(char... symbols) {
        String output = "";
        for (int i = 0; i < symbols.length; i++) {
            output += symbols[i];
        }
        return output;
    }

    private static void sum(String name, int... allDigits) {
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum += allDigits[i];
        }
        System.out.println(name + " " + sum);
    }

    public static void citiesTable(String... cities) {
        for (String elementik : cities) {
            System.out.println(elementik);
        }
    }
    /*private static int sum(int... allDigits) {
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum += allDigits[i];
        }

        return sum;
    }*/
}
