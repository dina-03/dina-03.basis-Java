package lesson28;

import java.util.Arrays;

//Массивы, Feld, Array
public class GoodMorningArray {
    public static void main(String[] args) {
        // myFirstArray();
        germanCities();
        String test = "Berlin" +
                "München" +
                "Dresden" +
                "Hamburg" +
                "Leipzig" +
                "Bremen" +
                "Frankfurt" +
                "Köln";
        System.out.println(test.length());
        arrayInitialisation();
        germanCities();
    }

    public static void myFirstArray() {
        int[] myArray;
        String[] users;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;
    }

    public static void mySecondArray() {
        //устаревшая форма
        int myArray[];
        String users[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];
    }

    public static void arrayInitialisation() {
        String[] fourSeasons = new String[]{"Зима", "Vivaldi", "Чайковский", "Кинг", "Гостиница"};
        int[] numberFibonacci = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] capitalsOfUdssr = new String[]{"Москва", "Минск", "Киев", "Кишинев", "Тбилиси"};
        char[] cyrillic = new char[]{'ж', 'л', 'ю', 'ч'};
        double[] time = new double[]{10.25, 15.45, 20.30};
        System.out.println(Arrays.toString(fourSeasons));
    }

    public static void arraySecondInitialisation() {
        int[] field;
        field = new int[10]; //в массиве 10 ячеек

    }

    public static void germanCities() {
        String[] deutschStaedte = new String[]{
                "Berlin",
                "München",
                "Dresden",
                "Hamburg",
                "Leipzig",
                "Bremen",
                "Frankfurt",
                "Köln"
        };
        int laenge = deutschStaedte.length;
        int allLetter = 0;
        for (int i = 0; i < laenge; i++) {
            allLetter = allLetter + deutschStaedte[i].length();
        }
        System.out.println(allLetter);
    }
}
