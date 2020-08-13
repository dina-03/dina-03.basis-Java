package lesson39;

public class TilesOld {
    public static void main(String[] args) {
        //1 hour = 27 €
        // 1 tile = 30 * 20 cm
        //1 hour = 1 м²
        //размер стены/пола, стоимость плитки
        double tileLength = 30.0;
        double tileWidth = 20.0;
        double workingHour = 27.0;
        double floorWidth = 3.0;
        double floorLength = 6.0;
        double tilePrice = 1.0;
        customerQuestion(tilePrice, floorLength, floorWidth);
    }

    private static void customerQuestion(double tilePrice, double floorLength, double floorWidth) {
        System.out.println(tileQuantity(30, 20, 3, 6));
        System.out.println(priceMaterial(1.0));
        System.out.println(priceWork(27.0, 3.0, 6.0));
        totalPrice(486.0, 300.0);

    }

    private static double totalPrice(double priceWork, double priceMaterial) {

        return priceWork;
    }

    private static double priceWork(double workingHour, double floorLength, double floorWidth) {
        double hour = 1.0;
        return hour * workingHour * floorLength * floorWidth;
    }

    private static double priceMaterial(double tilePrice) {
        double quantity = tileQuantity(30.0, 20.0, 3.0, 6.0);

        return quantity * tilePrice;
    }

    private static double tileQuantity(double tileLength, double tileWidth, double floorLength, double floorWidth) {
        double quantity;
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        quantity = (floorLength * floorWidth) / (tileLength * tileWidth);
        return quantity;
    }



    /*Мастеру плиточнику Сергею Ивановичу Золотыеруки задают часто один и тот же вопрос.
    Сколько будет стоить положить плитку на определённом участке.
Нам известно, что в час он кладёт примерно один квадратный метр плитки.
Его час стоит 27€ без НДС.
Стандартная плитка 30 на 20 сантиметров.
Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:
Количество требуемых плиток, как целых, так и тех которые надо будет резать.
Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает, как именно её надо класть.
Стоимость материала
Стоимость рабочего времени
Итоговую ориентировочную стоимость */
}
