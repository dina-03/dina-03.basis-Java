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
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        customerQuestion(length, width, height);
    }

    private static void customerQuestion(double length, double width, double height) {
        quantityTileTwo();
        System.out.println("общее количество плиток: " + quantityTile() + " шт"); //3.0, 6.0, 2.7
        System.out.println("стоимость материала: " + priceMaterial() + " €");
        System.out.println("Стоимость рабочего времени: " + priceWorkHours() + " €");
        System.out.println("Итоговая ориентировочная стоимость: " + totalEstimatedCost() + " €");
    }

    public static double findSquareTile() {
        double lengthTile = 0.3;
        double widthTile = 0.2;
        double squareTile = lengthTile * widthTile;
        //System.out.println("Площадь плитки: " + squareTile + " м²");
        return squareTile;
    }

    public static double squarePremises() {
        double length, width, height;
        length = 3.0;
        width = 6.0;
        height = 2.7;
        double squarePremises = ((length * 2) + (width * 2)) * height;
        double squarePremisesRound = Math.round(squarePremises);
        // System.out.println("площадь комнаты: " + squarePremisesRound + " м²");
        double result = squarePremisesRound / (findSquareTile());
        //System.out.println(result);
        return result;
    }

    private static void quantityTileTwo() {
        double result = squarePremises();
        double wholeTile = Math.round(result - (result % 10));
        double brokenTiles = Math.round(result % 10);
        System.out.println("количество целых плиток : " + wholeTile + " и сломанных " + brokenTiles);
    }

    private static double quantityTile() {
        double result = squarePremises();
        double wholeTile = Math.round(result - (result % 10));
        double brokenTiles = Math.round(result % 10);
        double allTile = wholeTile + brokenTiles;
        return allTile;
    }

    private static double priceMaterial() {
        double priceOneTile = 1.5;
        double quantityTile = quantityTile();
        double sum = priceOneTile * quantityTile;
        return sum;
    }


    private static double priceWorkHours() {
        double quantityTile = quantityTile();
        double oneSquareMetre = 1 / findSquareTile();
        double workingHour = 27.0;
        double result = Math.round(quantityTile / oneSquareMetre) * workingHour;

        return result;
    }

    private static double totalEstimatedCost() {
        return (priceMaterial() + priceWorkHours());
    }
}
