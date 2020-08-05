package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
       /* int a = 1, b = 2;
        boolean bool = a <= b;
        System.out.println(bool);
        boolean anotherBool = !bool;
        System.out.println(anotherBool);
        // a & b
        boolean sun = true;
        boolean dad = true;
        boolean ice = sun & dad;
        System.out.println(ice);
        // a | b
        boolean mama = true;
        boolean papa = true;
        boolean walking = mama | papa;
        int standart = 0;*/
        System.out.println(walking(26));
    }

    public static void split() {
        System.out.println("----------------------------");
        System.out.println(" " + walking(26));
    }

    public static boolean walking(double temperature) {

        boolean result = false;
        if (temperature > 25) {
            result = true;
        } else {
            result = false;
        }


        return result;
    }
}
