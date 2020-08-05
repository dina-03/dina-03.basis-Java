package lesson09;

public class ClassWork09 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        System.out.println(fundIntegers(a, b));
        System.out.println(addition(a, b));
         System.out.println(getStringMonth(a));
    }

    public static boolean fundIntegers(int a, int b) {

        /*if (a >= 10 && a < 21 || b >= 10 && b < 21) {
            return true;
        }*/

        return a >= 10 && a < 21 || b >= 10 && b < 21;
    }

    public static int addition(int a, int b) {
        //int c = a + b;
        return a + b;
    }

    public static String getStringMonth(int month) {
        //int month = 12;
        String monthString ="";
        switch (month){
            case 1:
                monthString = "Januar";
                break;
            case 2:
                monthString = "Februar";
                break;
            case 3:
                monthString = "März";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "Mai";
                break;
            case 6:
                monthString = "Juni";
                break;
            case 7:
                monthString = "Juli";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "Oktober";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "Dezember";
                break;
            default:
                monthString = "Invalid month - " + month;
                break;
        }


        return monthString;
    }
}
