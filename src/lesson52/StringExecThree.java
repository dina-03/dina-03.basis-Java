package lesson52;

public class StringExecThree {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));// → 123
        System.out.println(sumNumbers("aa11b33"));// → 44
        System.out.println(sumNumbers("7 11")); //→ 18
        System.out.println("--------");
        System.out.println(sumNumbersTwo("abc123xyz"));// → 123
        System.out.println(sumNumbersTwo("aa11b33"));// → 44
        System.out.println(sumNumbersTwo("7 11")); //→ 18
        //0. create a variable sum
        //1. input in loop, iterate
        //2. check whether chars are digits
        //3. after a digit check a char, if digit, then sum
        //4. return sum
    }

    private static int sumNumbers(String input) {
        int sum = 0;
        int length = input.length();
        int start = -1;
        int end = 0;
        for (int i = 0; i < length; i++) {
            if (start == -1) {
                if (Character.isDigit(input.charAt(i))) {
                    start = i;
                    end = i + 1;
                }
            } else {
                if (Character.isDigit(input.charAt(i))) {
                    end++;
                } else {
                    sum += Integer.parseInt(input.substring(start, end));
                    start = -1;
                }
            }
        }
        if (start != -1) {
            sum += Integer.parseInt(input.substring(start, end));
        }
        return sum;
    }

    private static int sumNumbersTwo(String input) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                if (i < input.length() - 1 && Character.isDigit(input.charAt(i + 1))){
                    temp += input.charAt(i);
                }else {
                    temp += input.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return sum;
    }
}
