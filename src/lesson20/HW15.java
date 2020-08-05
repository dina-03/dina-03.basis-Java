package lesson20;

public class HW15 {
    public static void main(String[] args) {
        String str1 = "Василий";
        String str2 = "Василиса";
        System.out.println(str1.contains("R"));
        System.out.println(str1.contains("В"));
        split();
        System.out.println(str1.endsWith("ий"));
        System.out.println(str1.endsWith("fa"));
        split();
        System.out.println(str1.equals(str2));
        System.out.println("andrey".equals("abba"));
        split();
        System.out.println(str1.equalsIgnoreCase("ваСилИй"));
        split();
        System.out.println(str1.isEmpty());
        System.out.println("".isEmpty());
        split();
        System.out.println("AndreyPodlubniy".length());
        split();
        System.out.println(str1.replace('а', 'I'));
        String myDate1 = "22.07.20";
        String myDate2 = "22/07/20";
        String myDate3 = "22-07-20";
        split();
        System.out.println();
        split();
        System.out.println(str1.substring(2,5) + str2.substring(3));
        split();
        System.out.println(str1.toUpperCase() + str2.toUpperCase());
        System.out.println(str1.toLowerCase() + str2.toLowerCase());
        split();
        System.out.println("    Frogs     ".trim());

    }
    public static void split(){
        System.out.println("----------------------");
    }
}
