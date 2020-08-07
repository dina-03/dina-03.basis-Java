
public class CoffeeVendingMachine {
    public static void main(String[] args) {
        String input = args[0];
        switch (input){
            case "hotWatter":
                CoffeeRecipesTwo.hotWatter();
                break;
            case "latte":
                CoffeeRecipesTwo.latte();
                break;
            case "americano":
                CoffeeRecipesTwo.americano();
                break;
            case "cappuccino":
                CoffeeRecipesTwo.cappuccino();
                break;
            default:
                System.out.println("Pleas choose again");
                break;
        }
    }
}
