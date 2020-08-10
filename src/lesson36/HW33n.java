package lesson36;

public class HW33n {
    public static void main(String[] args) {
        split();
        System.out.println("maxTriple");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{1, 5, 3};
        int[] d3 = new int[]{5, 2, 3};
        System.out.println(maxTriple(d1));// →3
        System.out.println(maxTriple(d2));// →5
        System.out.println(maxTriple(d3));// →5
    }

    private static int maxTriple(int[] input) {
        int result = input[0];
        int middle = input[input.length / 2];
        int end = input[input.length - 1];
        /*if (middle > result) {
            result = middle;
        }
        if (end > result) {
            result = end;
        }*/
        result = Math.max(result, middle);
        result = Math.max(result, end);
        return result;
    }


    private static void split() {
        System.out.println("-----------------------");
    }
}
