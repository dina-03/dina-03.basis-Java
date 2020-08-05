package lesson25;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(0b1);
        System.out.println(0b01);
        System.out.println(0b11);
        System.out.println(0b10);
        System.out.println(0b111);
        System.out.println(0b1111);
        System.out.println(0b11111);
        System.out.println(0b111111);
        System.out.println(0b1111_1111);*/
        int myLovelyBinaryDigit = 0b0100_1110;
        int frontend = 1010101;
        System.out.println(convertToDecimal(frontend));

    }

    public static int convertToDecimal(int binaryDigit) {
        int decimalDigit = 0;
        int n = 0;
        int temp = 0;
        int moduloSystem = 10;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimalDigit += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / moduloSystem;
            n++;
        }

        return decimalDigit;
    }
}
