package lesson37;

/*Создайте массив размерностью 5 на 6 и заполните его случайными числами
(в диапазоне от 0 до 99 ). Выведите на консоль третью строку */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = createArrays(5, 6);

        printOneLine(array);
        System.out.println("---");
        PythagorasTable.printTwoDimensionalArray(array);
    }

    private static void printOneLine(int[][] input) {
        for (int i = 0; i < input[2].length; i++) {
            System.out.print(input[2][i] + " ");
        }
        System.out.println();
    }

    private static int[][] createArrays(int a, int b) {
        int[][] myArray = new int[5][6];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return myArray;
    }
}
