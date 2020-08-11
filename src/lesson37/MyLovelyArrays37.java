package lesson37;

public class MyLovelyArrays37 {
    public static void main(String[] args) {
        myLovelyTwoDimensionalStringArray();


    }

    private static void myLovelyTwoDimensionalStringArray() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Matveev";
        myArray[0][2] = "№024253647";

        myArray[1][0] = "2";
        myArray[1][1] = "Vasilev";
        myArray[1][2] = "№948607083";

        myArray[2][0] = "3";
        myArray[2][1] = "Kozlov";
        myArray[2][2] = "№08746355757";

        myArray[3][0] = "4";
        myArray[3][1] = "Petrov";
        myArray[3][2] = "№0246837693";

        myArray[4][0] = "5";
        myArray[4][1] = "Sidorov";
        myArray[4][2] = "№08647826378";

        myPrintForStringTwoD(myArray);
    }

    private static void myPrintForStringTwoD(String[][] s) {
        System.out.println("Двумерный массив s " + s.length + ", " + s[0].length);

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println(s[i][j] + ";");
            }
            System.out.println();
        }
    }
}
