package lesson31;

public class HW30 {
    public static void main(String[] args) {
        //Nod
       /* System.out.println(greatestCommonDivisor(15, 60));//15
        System.out.println(greatestCommonDivisor(7, 3));//1
        System.out.println(greatestCommonDivisor(5, 15));//5
        System.out.println(greatestCommonDivisor(9, 12));//3*/
        //Nok
        System.out.println(leastCommonMultiple(60, 15));//60
        System.out.println(leastCommonMultiple(8, 9));//72
        System.out.println(leastCommonMultiple(7, 3));//21
    }

    private static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

}
