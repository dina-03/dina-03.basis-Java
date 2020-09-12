package SelfWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

        //looping for non empty strings
        int largestLength = 0;
        String userinput = sc.nextLine();
        String largestWord = Arrays.stream(userinput.split("[a-zA-z]")).max(Comparator.comparing(String::length).reversed()).orElse(null);

        while (userinput.equals("")) {
            System.out.println("Please insert a String: ");
            userinput = sc.nextLine();
        }

        for (String b : userinput.split(" ")) {
            if (isAlpha(b)) {
                if (largestWord.length() == 0) {
                    largestLength = b.length();
                    largestWord = b;
                }
            /*(largestWord.length() == 0) {
                largestLength = b.length();
                largestWord = b;*/
            } else if (b.length() >= largestLength) {
                largestLength = b.length();
                largestWord = b;
            }
        }
        sc.close();
        System.out.println("Longest Word: " + largestWord);

    }

    public static boolean isAlpha(String userinput) {
        char[] chars = userinput.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
