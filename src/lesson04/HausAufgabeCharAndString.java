package lesson04;

public class HausAufgabeCharAndString {
    public static void main(String[] args) {
        //addUpString();
        //myString();
        //myCharAndString();
        myCharAndString();
        myCharAndStringTwo();
    }

    public static void addUpString() {
        String firstName = "Dinara";
        String lastName = "Iskakova";
        String profession = "Fachinformatikerin";
        String profile = firstName + "  " + lastName + "  " + profession;
        System.out.println(profile);
    }

    public static void myString() {
        String firstName = "Max";
        String lastName = "Mustermann";
        String profession = "Programmierer";
        String adresse = "Müllerstraße";
        int strasseNumer = 123;
        String telefonNummer = "01515746537";
        String profileTwo = firstName + "  " + lastName + " \nAdresse: " + adresse + " " + strasseNumer + " \nTelefonnummer: " + telefonNummer + " \nBeruf: " + profession;
        System.out.println("Name: " + profileTwo);
    }

    public static void myCharAndString() {
        String articleTitle = "Осторожно, вход воспрещен!";
        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);
    }
    public static void myCharAndStringTwo() {
        String articleTitle = "Осторожно, вход воспрещен!";
        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);
        articleTitle = articleTitle.substring(0,1).toUpperCase() + articleTitle.substring(1,8).toLowerCase();
        System.out.println(articleTitle);
        // не поняла задание: добавить "воспрещен"! Уже голова не работает, сделала только то что поняла!
        // юникоды нашла но на маке все по другому, там символы смайлов прям на панельке высвечиваются вместе с символами
    }
}
