package lesson39;

public class HW39New {
    public static void main(String[] args) {
        double length = 3.3; //длина
        double width = 5.7;// ширина
        double height = 2.9;//высота
        double lengthTile = 0.3;//длина плитки
        double widthTile = 0.2;//ширина плитки
        double priceOneTile = 1.5;//цена одной плитки
        double workingHour = 27.0;//цена за один час работы - в час он делает 1 м²
        //---------------------------------------------------------
        double squareTile = findSquareTile(lengthTile, widthTile);
        double squarePremisesNatural = squarePremisesNatural(length, width, height);
        System.out.println("площадь комнаты: " + squarePremisesNatural + " м²");
        findSquareTile(lengthTile, widthTile); // площадь плитки
        double oneSquareMeter = Math.round(1 / findSquareTile(lengthTile, widthTile));
        System.out.println("плиток на квадратный метр: " + oneSquareMeter + " шт");
        double quantityTile = squarePremisesNatural / squareTile;
        //System.out.println(quantityTile);
        double wholeTileNatural = Math.round(quantityTile);
        double wholeTile = wholeTileNatural - (wholeTileNatural % 10);
        double brokenTiles = wholeTileNatural % 10;
        System.out.println("количество целых плиток : " + wholeTile + " и сломанных " + brokenTiles);
        double allQuantityTile = wholeTile + brokenTiles;
        System.out.println("общее количество плиток: " + allQuantityTile + " шт");
        double priceMaterial = priceOneTile * allQuantityTile;
        System.out.println("стоимость материала: " + priceMaterial + " €");
        double priceWorkHours = Math.round(workingHour * squarePremisesNatural);
        System.out.println("Стоимость рабочего времени: " + priceWorkHours + " €");
        double totalEstimatedCost = priceMaterial + priceWorkHours;
        System.out.println("Итоговая ориентировочная стоимость: " + totalEstimatedCost + " €");
    }

    public static double findSquareTile(double lengthTile, double widthTile) {
        return lengthTile * widthTile;
    }

    public static double squarePremisesNatural(double length, double width, double height) {
        double squarePremises = ((length * 2) + (width * 2)) * height;
        double squarePremisesRound = Math.round(squarePremises);
        return squarePremisesRound;
    }

}
