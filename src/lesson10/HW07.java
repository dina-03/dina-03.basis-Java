package lesson10;

public class HW07 {
    public static void main(String[] args) {
        split();
        System.out.println(speedLimits(50));
        split();
        System.out.println(speedLimits(56));
        split();
        System.out.println(speedLimits(80));
        split();
        System.out.println(speedLimits(120));
        split();
        System.out.println(speedLimits(150));
        split();
        System.out.println(waysOfVikingOne(1));
        System.out.println(waysOfVikingOne(2));
        System.out.println(waysOfVikingOne(3));
        split();
        System.out.println(waysOfVikingTwo("На лево"));
        System.out.println(waysOfVikingTwo("На право"));
        System.out.println(waysOfVikingTwo("Прямо"));
        System.out.println(waysOfVikingTwo("На куда"));
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static String speedLimits(int speed) {
        String result = "";
        if (speed <= 50) {
            result = "Нарушений нет ";
        } else if (speed <= 65) {
            result = "Устное порицание";
        } else if (speed <= 100) {
            result = "40 € Штраф";
        } else if (speed <= 130) {
            result = "500 € Штраф ";
        } else {
            result = "Штраф 1000 €, конфискация прав и транспортного средства на 3 года!!!";
        }
        return result;
    }

    public static String waysOfVikingOne(int way) {
        String result = "";
        if (way == 1) {
            result = "Коня потеряешь";
        } else if (way == 2) {
            result = "Жизнь потеряешь";
        } else {
            result = "Счастье найдешь";
        }
        return result;
    }

    public static String waysOfVikingTwo(String way) {
        String result = "";
        switch (way) {
            case "На лево":
                result = "Коня потеряешь";
                break;
            case "На право":
                result = "Жизнь потеряешь";
                break;
            case "Прямо":
                result = "Счастье найдешь";
                break;
            default:
                result = "Повторите попытку заново";
                break;
        }

        return result;
    }
}
