package lesson18;

public class Evning13Grupp {

    public static void main(String[] args) {
        System.out.println(helloName("Bob")); // "Hello Bob!"
        System.out.println(helloName("Alice")); // "Hello Alice!"
        System.out.println(helloName("X")); // "Hello X!"
/*        System.out.println(makeOutWord("<<>>", "Yay")); //→ "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); //→ "[[word]]"*/
/*        System.out.println(firstHalf("WooHoo")); //→ "Woo"
        System.out.println(firstHalf("HelloThere")); //→ "Hello"
        System.out.println(firstHalf("abcdef")); //→ "abc"*/

/*        System.out.println(nonStart("Hello", "There"));// →"ellohere"
        System.out.println(nonStart("java", "code")); //→"avaode"
        System.out.println(nonStart("shotl", "java"));// →"hotlava"*/
/*        System.out.println(theEnd("Hello", true)); //→"H"
        System.out.println(theEnd("Hello", false)); //→"o"
        System.out.println(theEnd("oh", true)); //→"o"*/

/*        System.out.println(endsLy("oddly"));// →true
        System.out.println(endsLy("y"));// →false
        System.out.println(endsLy("oddy"));// →false*/

/*        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
        System.out.println(middleThree("Василий"));// → "сил"*/

/*        System.out.println(lastChars("last", "chars")); // → "ls"
        System.out.println(lastChars("yo", "java")); // → "ya"
        System.out.println(lastChars("hi", "")); // → "h@"*/
        /*System.out.println(seeColor("redxx")); //→"red"
        System.out.println(seeColor("xxred")); //→""
        System.out.println(seeColor("blueTimes")); //→"blue"*/
    }

    public static String seeColor(String s) {
        String red = "red";
        String blue = "blue";
        if (s.startsWith(red)) {
            return red;
        } else if (s.startsWith(blue)) {
            return blue;
        }
        return "";
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() < 1) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    private static String middleThree(String s) {
        int middle = s.length() / 2;
        return s.substring(middle - 1, middle + 2);
    }


    private static boolean endsLy(String s) {
        //return oddly.endsWith("ly");
        String ly = "ly";
        if (s.length() < 2) {
            return false;
        }
        String end = s.substring(s.length() - 2);
        return end.equals(ly);
    }

    private static String theEnd(String s, boolean b) {
        if (b) {
            return s.substring(0, 1);
        } else {
            return s.substring(s.length() - 1);
        }
    }


    private static String nonStart(String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
    }

    private static String firstHalf(String s) {
        return s.substring(0, s.length() / 2);
    }


    private static String makeOutWord(String s1, String s2) {
        return s1.substring(0, 2) + s2 + s1.substring(2);
    }


    public static String helloName(String str) {
        String hello = "Hello ";
        String hello1 = "";
        char myChar = '*';
        char myCharTwo = '\u2656';
        return hello1 + myChar + hello + str + "!" + myChar + " " + myCharTwo;
    }


}
