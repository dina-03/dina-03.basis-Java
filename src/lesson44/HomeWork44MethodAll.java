package lesson44;

public class HomeWork44MethodAll {
    public static void main(String[] args) {
        charAt();
        split();
        codePointAt();
        split();
        codePointBefore(3);
        split();
        codePointCount(0, 5);
        split();
        compareToIgnoreCase("DogCat");
        split();
        concat("TelRan");
        split();
        contains("");
        split();
        endsWith("");
        split();
        equals("Object anObject");
        split();
        equalsIgnoreCase("String anotherString");
        split();
        indexOf(5);
        split();
        isEmpty();
        split();
        length();
        split();
        replace('x', 'y');
        split();
        startsWith();
        split();
        substring();
        split();
        toCharArray();
        split();
        toLowerCase();
        split();
        toUpperCase();
        split();
        trim();
    }

    /*Метод codePointAt() возвращает значение Юникода символа по указанному индексу в строке. */
    private static void codePointAt() {
        String str = "Hello";
        int result1 = str.codePointAt(0);
        int result2 = str.codePointAt(1);
        int result3 = str.codePointAt(2);
        System.out.println("Это метод codePointAt, Hello индекс 0 - H Unicode = " + result1);
        System.out.println("Это метод codePointAt, Hello индекс 1 - e Unicode = " + result2);
        System.out.println("Это метод codePointAt, Hello индекс 2 - l Unicode = " + result3);
    }

    /*метод возвращает символ (точку кода Юникода) перед указанным индексом.
     Индекс относится к значениям символа char (единицы юникодного кода) и колеблется от 1 до длины.*/
    private static void codePointBefore(int n) {
        String str = "TelRan";
        int result = str.codePointBefore(n);
        System.out.println("Это метод codePointBefore,TelRan - index 3 R Unicode = " + result);
    }

    /*Метод codePointCount() используется для подсчета количества точек кода Юникода в заданном
    текстовом диапазоне заданной Строки.
    Текстовый диапазон начинается с указанного beginIndex и расширяется до символа char в индексе endIndex - 1.
    Таким образом, длина (в символах) текстового диапазона является endIndex-beginIndex.
    Неправильные заменители в пределах текстового диапазона засчитываются как одна точка кода каждая. */
    private static void codePointCount(int beginIndex, int endIndex) {
        String str = "Hello";
        int result = str.codePointCount(beginIndex, endIndex);
        System.out.println("Это метод codePointCount, Hello - index ab 0 bis 5 = " + result);
    }

    /*Метод Java String comparisonToIgnoreCase() сравнивает две строки лексикографически и возвращает 0,
    если они равны, игнорируя регистр */
    private static void compareToIgnoreCase(String str) {
        String string1 = "HELLO";
        String string2 = "hello";
        String string3 = "HellO";
        String string4 = "DoG";
        System.out.println("Это метод compareToIgnoreCase:");
        int var1 = string1.compareToIgnoreCase(string2);
        System.out.println("HELLO и hello сравнение: " + var1);
        int var2 = string1.compareToIgnoreCase(string3);
        System.out.println("HELLO и HellO сравнение: " + var2);
        int var3 = string1.compareToIgnoreCase("HeLLo");
        System.out.println("HELLO и HeLLo сравнение: " + var3);
        int var4 = str.compareToIgnoreCase(string4);
        System.out.println("DoG и DogCat сравнение: " + var4);
    }

    /*Метод Java String concat() соединяет одну строку с концом другой строки.
    Этот метод возвращает строку со значением переданной в метод строки, добавленной в конец строки. */
    private static void concat(String str) {
        str = str.concat("! учит программировать по настоящему!");
        System.out.println("Это метод concat");
        System.out.println(str);
    }

    /*Метод indexOf() используется для поиска индекса указанного символа или подстроки в заданной строке.  */
    private static void indexOf(int ch) {
        String myStr = "Привет планета земля! я твоя землянка!!";
        System.out.println("Это метод indexOf");
        System.out.println("первое появление буквы \"e\" в строке -Привет планета земля! я твоя землянка!!-, " +
                "начиная поиск с позиции 5:");
        System.out.println(myStr.indexOf("е", ch));
    }

    /*Метод toCharArray() возвращает массив символов после преобразования строки в последовательность символов.
    Возвращаемая длина массива равна длине строки,
    а последовательность символов в массиве соответствует последовательности символов в строке. */
    private static void toCharArray() {
        String str = new String("Добро пожаловать в TelRan!");
        char[] array = str.toCharArray();
        System.out.println("Содержание Массива toCharArray: ");
        for (char c : array) {
            System.out.print(c);
        }
        System.out.println();
    }

    /*Метод charAt() — возвращает символ,
    расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля. */
    public static void charAt() {
        String str = "Я хочу быть хорошим программистом!";
        char result1 = str.charAt(8);
        char result2 = str.charAt(10);
        System.out.println("Это метод charAt: " + str);
        System.out.println("Восьмой символ: " + result1);
        System.out.println("Десятый символ: " + result2);
    }

    //метод length() указывает длину сток
    public static void length() {
        String str1 = "Das ist Java length Method";
        String str2 = "Method length macht Spass!;)";
        int length1 = str1.length();
        System.out.println("метод length:");
        System.out.println("str1 = Das ist Java length Method; str2 = Method length macht Spass!;) ");
        System.out.println("Здесь будет указана длина str1: " + length1);
        System.out.println("Здесь будет указана длина str2: " + str2.length());
    }

    //Метод isEmpty() возвращает true, если этот список не содержит элементов.
    public static void isEmpty() {
        String s1 = "";
        String s2 = "Example Java isEmpty";
        System.out.println("метод isEmpty() возвращает true, если этот список не содержит элементов:");
        System.out.println("Здесь пустая строка s1 " + s1.isEmpty());
        System.out.println("s2 не пустая строка " + s2.isEmpty());
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
        System.out.println("Метод equalsIgnoreCase() — сравнивает данную строку с другой строкой, игнорируя регистр:");
        System.out.println("str1 = str2 Antwort: " + result);
        result1 = str1.equalsIgnoreCase(str3);
        System.out.println("str1 = str3 Antwort: " + result1);
        result2 = str1.equalsIgnoreCase(str4);
        System.out.println("str1 = str4 Antwort: " + result2);
        boolean test, test1;
        test = str5.equalsIgnoreCase(str6);
        System.out.println("Это проверка русского текста: " + test);
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
        System.out.println("Этот метод сравнивает строки. Результат истинен когда аргумент не равен нулю и является " +
                "строковым объектом");
        System.out.println("true  -Это проверка работы метода- : " + result1);
        System.out.println("false -Это проверка работы- " + result2);
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
        System.out.println("Это метод endsWith:");
        System.out.println("Вывод метода на слово - string: " + var1);//false
        System.out.println("Вывод метода на слово - тест: " + var2);//true
        System.out.println("Вывод метода на слово - Это: " + var3);//false
        System.out.println("Вывод метода на - тест: " + var4);//true
    }

    //проверка содержит ли конкретная строка определенную подстроку.
    public static void contains(CharSequence s) {
        String str = "Это пример метода работы contains ";
        System.out.println("Это пример метода работы contains ");
        System.out.println("Вывод метода на экран true -" + str.contains("работы contain"));
        System.out.println("Вывод метода на экран false -" + str.contains("Example"));
    }

    //Метод replace() заменяет указанный символ (или подстроку) в строке на новый.
    public static void replace(char oldChar, char newChar) {
        char oldChr = '\u00A9';//©
        char newChr = '\u2660';//♠
        String s1 = "Das ist replace erste Char zum " + oldChar;// здесь должен быть знак ©
        System.out.println("Это метод работы replace ");
        System.out.println("Das sind beide Char: " + oldChar + " " + newChar);
        System.out.println(s1.replace(oldChar, newChar));//здесь происходит замена oldChr to newChr

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
        System.out.println("метод substring -35 из -Проверка старого метода возвращения строки- ");
        System.out.println("результат: " + input);
    }

    /* Метод Startswith () класса String используется для проверки префикса строки.
    Он возвращает логическое значение true или false в зависимости от того,
    начинается ли данная строка с указанной буквы или слова.*/
    public static void startsWith() {
        String prefix = "Проверка нового метода префикса строки";
        System.out.println("Метод Startswith false - " + prefix.startsWith("метода"));
        System.out.println("Метод Startswith true - " + prefix.startsWith("П"));
        System.out.println("Метод Startswith true - " + prefix.startsWith("Провер"));
        System.out.println("Метод Startswith false - " + prefix.startsWith("Hi"));
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }
}
