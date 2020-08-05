package lesson10;

public class Work10 {
    public static void main(String[] args) {
        String student1 = "Даша";
        String student2 = "саша";
        String student3 = "Маша";
        String student4 = "Глаша";
        String student5 = "миша";
        System.out.println(schoolNote(student1));
        System.out.println(schoolNote(student2));
        System.out.println(schoolNote(student3));
        System.out.println(schoolNote(student4));
        System.out.println(schoolNote(student5));
        //System.out.println(schoolNote());
    }

    public static double schoolNote(String name) {
        name = name.toLowerCase();
        double result = 0.0;
        switch (name) {
            case "даша":
                result = 5;
                break;
            case "саша":
                result = 2;
                break;
            case "маша":
                result = 4;
                break;
            case "глаша":
                result = 4.5;
                break;
            case "миша":
                result = 3.5;
                break;
        }

        return result;
    }
}
