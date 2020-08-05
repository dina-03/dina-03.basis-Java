package lesson06;

public class HomeWork06PurchaseOfAlcohol {
    public static void main(String[] args) {
        int ageCustomer1 = 12;
        int ageCustomer2 = 10;
        int ageCustomer3 = 20;
        int ageCustomer4 = 18;
        int ageCustomer5 = 30;
        int ageCustomer6 = 17;
        String fromAgeCustomer = purchaseOfAlcohol(ageCustomer1);
        split();
        System.out.println(fromAgeCustomer);
        split();
        System.out.println(purchaseOfAlcohol(ageCustomer2));
        split();
        System.out.println(purchaseOfAlcohol(ageCustomer3));
        split();
        System.out.println(purchaseOfAlcohol(ageCustomer4));
        split();
        System.out.println(purchaseOfAlcohol(ageCustomer5));
        split();
        System.out.println(purchaseOfAlcohol(ageCustomer6));
        split();
        System.out.println("Домашнее задание № 2: ");
        System.out.println();
        int monthSeason1 = 1;
        int monthSeason2 = 5;
        int monthSeason3 = 8;
        int monthSeason4 = 9;
        int monthSeason5 = 11;
        int monthSeason6 = 17;
        String seasonMonthViewer = seasonOfYear(monthSeason1);
        System.out.println(seasonMonthViewer);
        System.out.println(seasonOfYear(monthSeason2));
        System.out.println(seasonOfYear(monthSeason3));
        System.out.println(seasonOfYear(monthSeason4));
        System.out.println(seasonOfYear(monthSeason5));
        System.out.println(seasonOfYear(monthSeason6));
        split();
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static String purchaseOfAlcohol(int ageCustomer) {
        String result = "";
        switch (ageCustomer) {
            case 10:
                result = "Продажа алкоголя для лиц в возрасте 10 лет строго запрещена!!!";
                break;
            case 17:
                result = "Продажа алкоголя для лиц в возрасте 17 лет строго запрещена!!";
                break;
            case 18:
                result = "Продажа алкоголя для лиц в возрасте 18 лет разрешена только при наличии документов удостоверяющих личность!";
                break;
            case 20:
                result = "Продажа алкоголя для лиц в возрасте 20 лет разрешена только при наличии документов удостоверяющих личность!";
                break;
            case 30:
                result = "Продажа алкоголя для лиц в возрасте 30 лет разрешена!";
                break;
            default:
                result = " Повторите, пожалуйста, попытку ввода данных: " + ageCustomer + " временно недоступен";
        }
        return result;
    }

    public static String seasonOfYear(int monthSeason) {
        String result = "";
        String winter = " Winter";
        String spring = " Spring";
        String summer = " Summer";
        String autumn = " Autumn";
        switch (monthSeason) {

            case 1:
                result = "Januar -" + winter;
                break;
            case 2:
                result = "Februar -" + winter;
                break;
            case 3:
                result = "März -" + spring;
                break;
            case 4:
                result = "April -" + spring;
                break;
            case 5:
                result = "Mai -" + spring;
                break;
            case 6:
                result = "Juni -" + summer;
                break;
            case 7:
                result = "Juli -" + summer;
                break;
            case 8:
                result = "August -" + summer;
                break;
            case 9:
                result = "September -" + autumn;
                break;
            case 10:
                result = "Oktober -" + autumn;
                break;
            case 11:
                result = "November -" + autumn;
                break;
            case 12:
                result = "Dezember -" + winter;
                break;
            default:
                result = "Invalid season - " + monthSeason;
                break;
        }
        return result;
    }
}
