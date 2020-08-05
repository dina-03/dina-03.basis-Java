package lesson20;

public class HomeWork20 {
    public static void main(String[] args) {
        System.out.println(cityWeather("Минск"));
        split();
        System.out.println(cityWeather("Лондон"));
        split();
        System.out.println(cityWeather("Лиссабон"));
        split();
        System.out.println(cityWeather("Париж"));
        split();
        System.out.println(cityWeather("Берлин"));
        split();
        System.out.println(cityWeather("Москва"));
        split();
        System.out.println(cityWeather("Berlin"));
        System.out.println(cityWeather("ggg"));

        split();
        cityWeatherDay("Минск", "Пятница");
        cityWeatherDay("Москва", "Понедельник");
        cityWeatherDay("Берлин", "Вторник");
        cityWeatherDay("Париж", "Четверг");
        cityWeatherDay("Лиссабон", "Понедельник");
        split();
       /* System.out.println(citiWeatherSimple("Берлин", "Понедельник"));
        System.out.println(citiWeatherSimple("Лондон", "Вторник"));
        System.out.println(citiWeatherSimple("Лиссабон", "Среда"));
        System.out.println(citiWeatherSimple("Париж", "Четверг"));
        System.out.println(citiWeatherSimple("Москва", "Пятница"));
        System.out.println(citiWeatherSimple("Минск", "Суббота"));*/
    }

    public static void split() {
        System.out.println("---------------------");
    }

    public static int cityWeather(String city) {
        int degree = 0;
        switch (city) {
            case "Берлин":
                degree = 20;
                break;
            case "Лондон":
                degree = 17;
                break;
            case "Лиссабон":
                degree = 25;
                break;
            case "Париж":
                degree = 23;
                break;
            case "Москва":
                degree = 19;
                break;
            case "Минск":
                degree = 18;
                break;
            case "Саратов":
                degree = 15;
                break;
            default:
                degree = 0;
                break;
        }

        return  degree + 6;
    }

    public static void cityWeatherDay(String city, String day) {
        String output = "";
        int degreeDay = 0;
        for (int i = 0; i < degreeDay; i++) {
            //degreeDay = ;
        }
        switch (day) {

            case "Понедельник":
                degreeDay = 0;
                break;
            case "Вторник":
                degreeDay = 1;
                break;
            case "Среда":
                degreeDay = 2;
                break;
            case "Четверг":
                degreeDay = 3;
                break;
            case "Пятница":
                degreeDay = 4;
                break;
            case "Суббота":
                degreeDay = 5;
                break;
            case "Воскресенье":
                degreeDay = 0;
                break;
            default:
                System.out.println(0);
                break;

        }
        System.out.println(city + " " + day + " " + cityWeather(city));
    }

    public static int citiWeatherSimple(String city, String weekDay) {
        int degreeUpp = 0;

        switch (weekDay) {

            case "Понедельник":
                degreeUpp = 0;
                break;
            case "Вторник":
                degreeUpp = 1;
                break;
            case "Среда":
                degreeUpp = 2;
                break;
            case "Четверг":
                degreeUpp = 3;
                break;
            case "Пятница":
                degreeUpp = 4;
                break;
            case "Суббота":
                degreeUpp = 5;
                break;
            case "Воскресенье":
                degreeUpp = 0;
                break;
            default:
                degreeUpp = 0;
                break;
        }
        return degreeUpp + cityWeather(city) -6;
    }
}
