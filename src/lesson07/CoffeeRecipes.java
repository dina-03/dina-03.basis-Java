package lesson07;

public class CoffeeRecipes {

    public static void latte() {

       // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ваш latte готов!");
        milk(12);
        coffee(15);
        water(200);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void cappuccino(){
        milk(30);
        coffee(40);
        water(200);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void hotWatter() {
       // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ваш кипяток готов!");
        milk(0);
        coffee(0);
        water(100);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public static void americano() {
       // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ваш americano готов!");
        milk(0);
        coffee(50);
        water(200);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");


    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);

    }

    public static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }

}
