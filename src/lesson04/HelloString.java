package lesson04;

public class HelloString {
    public static void main(String[] args) {
        gutenTagString();
        myLovelyCharAndString();
    }

    public static void gutenTagString() {
        String firstName = "Andrej";
        String lastName = "Podlubnyj";
        char copyright = '\u00A9';
        int age = 18;
        System.out.println("Добро пожаловать на наш сайт " + firstName + " " + lastName + " " + age + " " + copyright);
        String studentNumberOne = firstName + " " + lastName + " " + copyright;
        System.out.println("Первый студент который у нас зарегистрировался " + studentNumberOne);
    }

    public static void myLovelyCharAndString() {
        char numberOne = ' ';
        String numberTwo = " ";
        String firstName = "Andrej";
        String lastName = "Podlubnyj";
        char copyright = '\u00A9';
        int age = 18;
        String studentNumberOne = firstName + " " + lastName + " " + copyright;
        int dlina;
        dlina = studentNumberOne.length();
        System.out.println(dlina);
        String myVeryNewString = studentNumberOne.substring(10);
        System.out.println(myVeryNewString);
        myVeryNewString = studentNumberOne.substring(3,8);
        System.out.println(myVeryNewString);
    }
}
