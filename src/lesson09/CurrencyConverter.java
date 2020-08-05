package lesson09;

//Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”)
// и выдает курс к доллару. Естественно, “USD” возвращает 1.0
public class CurrencyConverter {
    public static void main(String[] args) {
        /*System.out.println(findCurrencyCourse("usd"));
        System.out.println(findTwoCurrencyCourse("GPB", "RUR"));
        System.out.println(findTwoCurrencyCourse("BYN", "USD"));*/
        System.out.println(currencySum(56000, "RUR", "EUR"));
    }

    public static double findTwoCurrencyCourse(String firstCurrencyName, String secondCurrencyName) {

        return findCurrencyCourse(firstCurrencyName) / findCurrencyCourse(secondCurrencyName);
    }

    public static double currencySum(double amount, String inputName, String outputName) {
        //double currencySun = 0.0;

        return findTwoCurrencyCourse(inputName, outputName) * amount;
    }

    public static double findCurrencyCourse(String currencyName) {
        double currencyCourse = 0.0;
        currencyName = currencyName.toUpperCase();
        switch (currencyName) {

            case "EUR":
                currencyCourse = 1.12;
                break;
            case "RUR":
                currencyCourse = 0.014;
                break;
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.25;
                break;
            case "BYN":
                currencyCourse = 0.41;
                break;
            case "UAH":
                currencyCourse = 0.03;
                break;
            case "TRY":
                currencyCourse = 1.13;
                break;
            default:
                currencyCourse = 0.0;
                break;
        }

        return currencyCourse;
    }
}
