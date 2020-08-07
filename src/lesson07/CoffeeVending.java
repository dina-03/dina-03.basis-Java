package lesson07;

public class CoffeeVending {
    public static void main(String[] args) {
        int customerChooseOne = 11;
        int customerChooseTwo = 12;
        int customerChooseThree = 13;
        int customerChooseVor = 111;

        coffeeSwitch(customerChooseOne);
        coffeeSwitch(customerChooseTwo);
        coffeeSwitch(customerChooseThree);
        coffeeSwitch(customerChooseVor);
    }

    public static void coffeeSwitch(int customerValue) {
        String result = "";

        switch (customerValue) {
            case 11:
                lesson07.CoffeeRecipesTwo.americano();
                break;
            case 12:
                lesson07.CoffeeRecipesTwo.cappuccino();
                break;
            case 13:
                lesson07.CoffeeRecipesTwo.latte();
                break;
            case 14:
                lesson07.CoffeeRecipesTwo.hotWatter();
                break;
            default:
                System.out.println("Извините, аппарат временно недоступен");
                break;

        }
        /*switch (customerValue) {
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
        }*/
        //System.out.println("Программа приготовления кофе запущенна без ошибок");
    }
}
