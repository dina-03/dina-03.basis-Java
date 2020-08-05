package lesson30;

public class ArrayInit {
    public static void main(String[] args) {
        //Первый способ
        int[] var1 = new int[10];
        //Второй способ
        int[] var2 = new int[]{1, 5, 18};
        //Третий способ
        int[] var3 = var2;
        int a = 5;
        int b = a;
       // myArrayPrint();
       /* System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);*/
        int[] var4 = createArray(10);
        GoodMorningArraysDayTwo.myArrayPrint(var4);
    }

    private static int[] createArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * 100);
        }

        return result;
    }
}
