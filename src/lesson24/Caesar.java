package lesson24;

public class Caesar {
    public static void main(String[] args) {
        //genCaesarChar();
        String input = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String output = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        System.out.println(enigmaCaesarNotEnough(input));
        //System.out.println(genCaesarSymbolNotEnough(input));
        String outputFromMethod = enigmaCaesar(input);
        System.out.println(output.equals(outputFromMethod));
    }

    public static String enigmaCaesar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + genCaesarSymbolNotEnough(input.charAt(i));
        }

        return output;
    }

    public static String genCaesarSymbol(char symbol) {
        int key = 3;
        char result = (char) (symbol + 3);
        if (symbol == ' ') {
            result = ' ';
        } else if (symbol == '.') {
            result = '.';
        } else if (symbol == ',') {
            result = ',';
        } else if (symbol == '!') {
            result = '!';
        } else if (symbol == '.') {
            result = '.';
        } else if (symbol == 'э') {
            result = 'а';
        } else if (symbol == 'ю') {
            result = '.';
        }


        return String.valueOf(result);
    }

    private static String enigmaCaesarNotEnough(String input) {
        input = input.toUpperCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = result + genCaesarSymbolNotEnough(input.charAt(i));

        }

        return result;
    }

    private static char genCaesarSymbolNotEnough(char oneLetter) {
        String input = "";
        char outputPlusThree = (char) (oneLetter + 3);
        char result;
        switch (oneLetter) {
            case 'А':
                result = 'Г';
                break;
            case 'Б':
                result = 'Д';
                break;
            case 'В':
                result = 'Е';
                break;
            case 'Г':
                result = 'Ё';
                break;
            case 'Д':
                result = 'Ж';
                break;
            case 'Е':
                result = 'З';
                break;
            case 'Ё':
                result = 'И';
                break;
            case 'Ж':
                result = 'Й';
                break;
            case 'З':
                result = 'К';
                break;
            case 'И':
                result = 'Л';
                break;
            case 'Й':
                result = 'М';
                break;
            case 'К':
                result = 'Н';
                break;
            case 'Л':
                result = 'О';
                break;
            case 'М':
                result = 'П';
                break;
            case 'Н':
                result = 'Р';
                break;
            case 'О':
                result = 'С';
                break;
            case 'П':
                result = 'Т';
                break;
            case 'Р':
                result = 'У';
                break;
            case 'С':
                result = 'Ф';
                break;
            case 'Т':
                result = 'Х';
                break;
            case 'У':
                result = 'Ц';
                break;
            case 'Ф':
                result = 'Ч';
                break;
            case 'Х':
                result = 'Ш';
                break;
            case 'Ц':
                result = 'Щ';
                break;
            case 'Ч':
                result = 'Ъ';
                break;
            case 'Ш':
                result = 'Ы';
                break;
            case 'Щ':
                result = 'Ь';
                break;
            case 'Ъ':
                result = 'Э';
                break;
            case 'Ы':
                result = 'Ю';
                break;
            case 'Ь':
                result = 'Я';
                break;
            case 'Э':
                result = 'А';
                break;
            case 'Ю':
                result = 'Б';
                break;
            case 'Я':
                result = 'В';
                break;
            default:
                result = 'G';
                break;

        }

        return outputPlusThree;
    }

}
