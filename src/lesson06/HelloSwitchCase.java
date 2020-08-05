package lesson06;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerValue = 55;
        String fromCoffeeVendingMachine = coffeeVending(customerValue);
        System.out.println(fromCoffeeVendingMachine);
    }

    public static String coffeeVending(int customerValue) {
        String result = "";
        switch (customerValue) {
            case 1:
                result = "Kофе американо готовиться";
                break;
            case 2:
                result = "Кипяток сейчас будет";
                break;
            case 3:
                result = "Кофе эспрессо готовится";
                break;
            case 4:
                result = "Сейчас будет какао!";
                break;
            case 5:
                result = "Вода кипятится " + "\n" + "Кофе мелется" + " " + "\n" + "Сливки добавляются ";
                break;

            default:
                System.out.println("Повторите пожалуйста свой выбор: " + customerValue + " Потому что временно недоступен");
                break;
        }
        //System.out.println("Программа приготовления кофе запущенна без ошибок");
        return result;
    }

}
