package lesson19;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора"));// -> true 
        System.out.println(checkPalindrome("поп"));// -> true  
        System.out.println(checkPalindrome("школа"));// -> false
        System.out.println(deleteSpace("А роза упала на лапу Азора"));
    }

    public static boolean checkPalindrome(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        //output = output.trim().toLowerCase();
        input = deleteSpace(input).toLowerCase();
        output = deleteSpace(output).toLowerCase();
        //System.out.println(input);
        return input.equals(output);
    }

    public static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!(input.substring(i, i +1).equals(" "))){
                output = output + input.charAt(i);
            }
        } //erste Variant
       /* for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                output = output + input.charAt(i);
            }
        }*/
        return output;
    }

}
