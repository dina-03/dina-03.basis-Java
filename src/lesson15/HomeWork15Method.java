package lesson15;

public class HomeWork15Method {
    public static void main(String[] args) {
        //contains("Example");
        contains("");
        split();
        endsWith("");
        split();
        equals("");
        split();
        equalsIgnoreCase("");
        split();
        isEmpty();
        split();
        length();
        split();
        replace('\u00A9', '\u2660');
        split();

    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }

    //Метод replace() заменяет указанный символ (или подстроку) в строке на новый.
    public static void replace(char oldChar, char newChar) {
        char oldChr = '\u00A9';//©
        char newChr = '\u2660';//♠
        String s1 = "Das ist replace erste Char zum " + oldChar;// здесь должен быть знак ©
        System.out.println("Das sind beide Char: " + oldChar + " " + newChar);
        System.out.println(s1.replace(oldChar, newChar));//здесь происходит замена oldChr to newChr

    }

    //проверка содержит ли конкретная строка определенную подстроку.
    public static void contains(CharSequence s) {
        String str = "Это пример метода работы contains ";
        System.out.println("Вывод метода на экран true -" + str.contains("работы contain"));
        System.out.println("Вывод метода на экран false -" + str.contains("Example"));
    }

    //В следующем примере у нас есть две строки str1 и str2,
    // и мы проверяем, заканчиваются ли строки указанными суффиксами.
    public static void endsWith(String suffix) {
        String str1 = new String("Это первый string- тест");
        String str2 = new String("Это второй string-тест");
        boolean var1 = str1.endsWith("string");
        boolean var2 = str2.endsWith("тест");
        boolean var3 = str1.endsWith("Это");
        boolean var4 = str2.endsWith("тест");
        System.out.println("Вывод метода на слово - string: " + var1);//false
        System.out.println("Вывод метода на слово - тест: " + var2);//true
        System.out.println("Вывод метода на слово - Это: " + var3);//false
        System.out.println("Вывод метода на - тест: " + var4);//true
    }

    //Этот метод сравнивает эту строку с указанным объектом.
    // Результат истинен тогда и только тогда, когда аргумент не равен нулю
    // и является строковым объектом, представляющим ту же последовательность символов, что и этот объект.

    public static void equals(String anObject) {
        String str1 = new String("Это проверка работы метода");
        String str2 = str1;
        String str3 = new String("Это проверка работы");
        boolean result1, result2;
        result1 = str1.equals(str2);
        result2 = str2.equals(str3);
        System.out.println("Результат проверки работы метода: " + result1);
        System.out.println("Результат проверки работы метода: " + result2);
    }

    //Метод equalsIgnoreCase() — сравнивает данную строку с другой строкой, игнорируя регистр.
    // Две строки считаются равными, если они имеют одинаковую длину и соответствующие символы у двух строк равны,
    // игнорируя регистр букв.
    public static void equalsIgnoreCase(String anotherString) {
        String str1 = "Das ist ein Test";
        String str2 = str1;
        String str3 = new String("Все время приходится менять язык на клаве!!!");
        String str4 = new String("DAS IST EIN TEST");
        String str5 = "Надоело печатать один и тот же текст";
        String str6 = "НАДОЕЛО ПЕЧАТАТЬ ОДИН И ТОТ ЖЕ ТЕКСТ";
        boolean result, result1, result2;
        result = str1.equalsIgnoreCase(str2);
        System.out.println("str1 = str2 Antwort: " + result);
        result1 = str1.equalsIgnoreCase(str3);
        System.out.println("str1 = str3 Antwort: " + result1);
        result2 = str1.equalsIgnoreCase(str4);
        System.out.println("str1 = str4 Antwort: " + result2);
        boolean test, test1;
        test = str5.equalsIgnoreCase(str6);
        System.out.println("Это проверка русского текста: " + test);
    }

    //Метод isEmpty() возвращает true, если этот список не содержит элементов.
    public static void isEmpty() {
        String s1 = "";
        String s2 = "Example Java isEmpty";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    //метод length() указывает длину сток
    public static void length() {
        String str1 = "Das ist Java length Method";
        String str2 = "Method length macht Spass!;)";
        int length1 = str1.length();
        //int length2 = str2.length();
        System.out.println("Здесь будет указана длина str1: " + length1);
        System.out.println("Здесь будет указана длина str2: " + str2.length());
    }

}
