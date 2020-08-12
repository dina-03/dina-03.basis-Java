package lesson38;

public class ImperativeMethode {
    public static void main(String[] args) {

        application();
    }

    public static void application(){
        int[] arr = {2, 5, 6, 4, 9, 1, 150, 89};
        int min = findMin(arr);
        int max = findMax(arr);
        int sum = findSum(arr);
        String output = "Система отработала со статусом ОК";
        System.out.println(output + "\n"
        + " " + sum + "\n"
        + " " + max + "\n"
        + " " + min + "\n"
        );

        /*System.out.println(findSum(arr));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));*/
    }


    private static int findMax(int[] arr) {
        int result = arr[0];
        for (int j = 0; j < arr.length; j++) {
            result = Math.max(result, j);
        }

        return result;
    }

    private static int findMin(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }

        return result;
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return sum;
    }
}
