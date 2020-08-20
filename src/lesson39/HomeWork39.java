package lesson39;

public class HomeWork39 {
    public static void main(String[] args) {
        //дано:
        //workingHour = 27€
        //squareTile = 60 cm = 0,06 м²
        //_________нужно узнать:
        //quantityTile = ?
        //priceMaterial = ?
        //priceWorkHours = ?
        //totalEstimatedCost = ?
        /*double length = 0.0;
        double width = 0.0;
        double height = 0.0;*/
        customerQuestion();
    }

    private static void customerQuestion() {
        System.out.println("площадь пола: " + squarePremisesNatural() + " м²");
        quantityTileTwo();
        System.out.println("общее количество плиток: " + quantityTile() + " шт");
        System.out.println("стоимость материала: " + priceMaterial() + " €");
        System.out.println("Стоимость рабочего времени: " + priceWorkHours() + " €");
        System.out.println("Итоговая ориентировочная стоимость: " + totalEstimatedCost() + " €");
        //System.out.println(quantityTileNatural());
        //System.out.println(quantityTile());
    }

    /*площадь плитки */
    public static double findSquareTile() {
        double lengthTile = 0.3;
        double widthTile = 0.2;
        return lengthTile * widthTile;
    }

    public static void printSquarePremises() {
        System.out.println("площадь комнаты: " + squarePremisesNatural() + " м²");
    }

    /*площадь комнаты */
    public static double squarePremisesNatural() {
        double length, width;
        length = 3.3;
        width = 5.7;
       // height = 2.9;
        double squarePremises = length * width;
        double squarePremisesRound = Math.round(squarePremises);
        //System.out.println("площадь комнаты: " + squarePremisesRound + " м²");
        return squarePremisesRound;
    }

    /*неокругленное количество плиток*/
    public static double quantityTileNatural() {
        double squarePremisesRound = Math.round(squarePremisesNatural());
        return squarePremisesRound / (findSquareTile());
    }

    /*количество целых плиток  и сломанных*/
    private static void quantityTileTwo() {
        double result = quantityTileNatural();
        double wholeTile = Math.round(result - (result % 10));
        double brokenTiles = Math.round(result % 10);
        System.out.println("количество целых плиток : " + wholeTile + " и сломанных " + brokenTiles);

    }

    /*общее количество плиток*/
    private static double quantityTile() {
        double result = quantityTileNatural();
        double wholeTile = Math.round(result - (result % 10));
        double brokenTiles = Math.round(result % 10);
        return wholeTile + brokenTiles;
    }

    private static double priceMaterial() {
        double priceOneTile = 3.0;
        double quantityTile = quantityTile();
        return priceOneTile * quantityTile;
    }


    private static double priceWorkHours() {
        double quantityTile = quantityTile();
        double oneSquareMetre = 1 / findSquareTile();
        double workingHour = 27.0;
        return Math.round(quantityTile / oneSquareMetre) * workingHour;
    }

    private static double totalEstimatedCost() {
        return (priceMaterial() + priceWorkHours());
    }
}
