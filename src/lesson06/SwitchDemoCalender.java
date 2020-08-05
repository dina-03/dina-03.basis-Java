package lesson06;

public class SwitchDemoCalender {
    public static void main(String[] args) {

        int monthDigit = 12;
        String monthString ="";
        switch (monthDigit){
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
                monthString = "Invalid month - " + monthDigit;
                break;
        }
        System.out.println(monthString);
    }
}
