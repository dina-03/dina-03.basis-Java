package lesson39;

public class TilesApplicationHomeWorkNew {
    public static void main(String[] args) {
        //дано:
        //workingHour = 27€
        //squareTile = 60 cm = 0,06 м²
        //_________нужно узнать:
        //quantityTile = ?
        //priceMaterial = ?
        //priceWorkHours = ?
        //totalEstimatedCost = ?
        double lengthRoom = 3.6;
        double widthRoom = 3.6;
        double lengthTile = 30;
        double widthTile = 30;
        double priceOneTile = 3.0;
        double workingHour = 27.0;
        //-----------------------
        double squarePremises = findSquarePremises(lengthRoom, widthRoom);
        double squareTile = findSquareTile(lengthTile, widthTile);
        double quantityTile = (int) Math.round(squarePremises / squareTile);
        double tileLength = lengthTile / 100;
        double tileWidth = widthTile / 100;
        double wholeTile = squareTile * squarePremises;
        /*double lineLength = (int) Math.floor(lengthRoom / tileLength);
        double lineWidth = (int) Math.floor(widthRoom / tileWidth);
        double lineLengthTwo = (int) Math.ceil(lengthRoom / tileLength);
        double lineWidthTwo = (int) Math.ceil(widthRoom / tileWidth);
        double wholeTileLength = lineLength * lineWidth;
        double tileQuantity = lineLengthTwo * lineWidthTwo;*/
        System.out.println("площадь комнаты:" + findSquarePremises(lengthRoom, widthRoom) + " м²");
        System.out.println("количество целых плиток : " + quantityTile);
        System.out.println(findSquareTile(lengthTile, widthTile));
        System.out.println(wholeTile);
    }

    public static int getMyWholeTilesQuantity() {

        return 0;
    }

    private static double findSquareTile(double lengthTile, double widthTile) {
        return (lengthTile / 100) * (widthTile / 100);
    }

    private static double findSquarePremises(double lengthRoom, double widthRoom) {
        return lengthRoom * widthRoom;
    }
}
