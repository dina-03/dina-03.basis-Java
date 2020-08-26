package lesson46;

public class StringExerciseGetSandwich {
    public static void main(String[] args) {
        /*Сэндвич - это два куска хлеба с чем-то между ними. Верните строку,
        которая находится между первым и последним появлением "хлеба" в данной строке,
        или верните пустую строку "", если нет двух кусочков хлеба. */
        //посчитать количество bread
        //что находится между bread
        // System.out.println(countBread("breadjambread"));
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));// → ""
    }

    private static int countBread(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            String temp = str.substring(i, i + 5);
            System.out.println(temp);
            if (temp.contains("bread")) {
                count++;
            }
        }
        return count;
    }

    private static String getSandwich(String str) {
        int breadStart = str.indexOf("bread");
        int breadEnd = str.lastIndexOf("bread");
        //System.out.println(breadEnd + " " + breadStart);
        if (breadStart != -1 && breadEnd != -1 && breadStart != breadEnd) {
            return str.substring(breadStart + 5, breadEnd);
        }
        return "";
    }
}
