package lesson39;

public class TilesMaria {
    public static void main(String[] args) {
        customerInquiry();
    }

    private static void customerInquiry() {
        double tileLength = 30.0;
        double tileWidth = 20.0;
        double workingHour = 27.0;
        double tilePrice = 1.0;
        double floorLength = 4.5;
        double floorWidth = 5.9;
        double meterPerHour = 1.0;
///////////////////////////////////////////////////////////////////////////////////////////////////////
        double quantity = tileQuantity(tileLength, tileWidth, floorLength, floorWidth);
        System.out.println("you need " + quantity + " tiles");
        double priceWork = priceWork(workingHour, floorLength, floorWidth, meterPerHour);
        double priceMaterial = priceMaterial(tilePrice, quantity);
        System.out.println("price for material is " + priceMaterial + " €");
        System.out.println("price for work is " + priceWork + " €");
        System.out.println("total price is " + totalPrice(priceWork, priceMaterial) + " €");
    }

    private static double tileQuantity(double tileLength, double tileWidth, double floorLength, double floorWidth) {
        double quantity;
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        quantity = (floorLength * floorWidth) / (tileLength * tileWidth);
        return quantity;
    }

    private static double priceWork(double workingHour, double floorLength, double floorWidth, double meterPerHour) {
        return meterPerHour * workingHour * floorLength * floorWidth;
    }

    private static double priceMaterial(double tilePrice, double quantity) {
        return quantity * tilePrice;
    }

    private static double totalPrice(double priceWork, double priceMaterial) {
        return priceWork + priceMaterial;
    }


}
