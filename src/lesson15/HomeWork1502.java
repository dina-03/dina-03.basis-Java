package lesson15;

public class HomeWork1502 {
    public static void main(String[] args) {
        startsWith();
        split();
        substring();
        split();
        toLowerCase();
        split();
        toUpperCase();
        split();
        trim();
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    /* Метод trim() удаляет пробелы с обеих сторон строки.*/
    public static void trim() {
        String s = "  Das ist ein Beispieltext  ";
        String text = "EinTextOhneLeerzeichen";
        System.out.println("Это метод trim: " + s.trim() + text);
    }

    /* Метод java string toUpperCase() возвращает строку в заглавной букве.
    Другими словами, он преобразует все символы строки в заглавную букву.*/
    public static void toUpperCase() {
        String str = "Das Ist ein beispieltext";
        String output = str.toUpperCase();
        System.out.println("Это метод toUpperCase: " + output);
    }

    /* Метод toLowerCase () преобразует символы строки в символы нижнего регистра.*/
    public static void toLowerCase() {
        String str = "dAS iST eIN bEISPIELTEXT";
        System.out.println("Это метод toLowerCase: " + str.toLowerCase());
    }

    /* Метод substring () возвращает новую строку,
    которая является подстрокой данной строки. */
    public static void substring() {
        String output = "Проверка старого метода возвращения строки ";
        String input = output.substring(0, output.length() - 35);
        System.out.println("метод substring: " + input);
    }

    /* Метод Startswith () класса String используется для проверки префикса строки.
    Он возвращает логическое значение true или false в зависимости от того,
    начинается ли данная строка с указанной буквы или слова.
    */
    public static void startsWith() {
        String prefix = "Проверка нового метода префикса строки";
        System.out.println("Метод Startswith false - " + prefix.startsWith("метода"));
        System.out.println("Метод Startswith true - " + prefix.startsWith("П"));
        System.out.println("Метод Startswith true - " + prefix.startsWith("Провер"));
        System.out.println("Метод Startswith false - " + prefix.startsWith("Hi"));
    }
}
