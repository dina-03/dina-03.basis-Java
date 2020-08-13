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
        customerQuestion(length, width);
    }

    private static void customerQuestion(double length, double width) {
        System.out.println("количество плиток: " + quantityTile(3.0, 6.0, 2.7) + " шт");
        System.out.println("стоимость материала: " + priceMaterial(1.0, 500) + " €");
        System.out.println("Стоимость рабочего времени: " + priceWorkHours(500) + " €");
        System.out.println("Итоговая ориентировочная стоимость: " + totalEstimatedCost() + " €");
    }

    public static double findSquareTile(double lengthTile, double widthTile) {
        double squareTile = lengthTile * widthTile;
        System.out.println("Площадь плитки: " + squareTile + " м²");
        return squareTile;
    }

    private static double quantityTile(double length, double width, double height) {
        double squarePremises = ((length * 2) + (width * 2)) * height;
        double squarePremisesRound = Math.round(squarePremises);
        System.out.println("площадь комнаты: " + squarePremisesRound + " м²");
        double result = squarePremisesRound / (findSquareTile(0.3, 0.2));
        double wholeTile = Math.round(result - (result % 10));
        double brokenTiles = Math.round(result % 10);
        System.out.println("количество плиток целых : " + wholeTile + " и сломанных " + brokenTiles);
        double allTile = wholeTile + brokenTiles;
        return allTile;
    }

    private static double priceMaterial(double priceOneTile, double quantityTile) {
        double sum = priceOneTile * quantityTile;
        return sum;
    }

    private static double priceWorkHours(double quantityTile) {
        double oneSquareMetre = 1 / findSquareTile(0.3, 0.2);
        double workingHour = 27.0;
        double result = Math.round(quantityTile / oneSquareMetre) * workingHour;

        return result;
    }

    private static double totalEstimatedCost() {
        return (priceMaterial(1.0, 500) + priceWorkHours(500));
    }
}
