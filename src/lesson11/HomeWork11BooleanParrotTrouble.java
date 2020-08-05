package lesson11;

/*У нас громко говорит попугай. Параметр "час" - это текущее часовое время в диапазоне 0...23.
Мы попали в беду, если. Попугай разговаривает, а час до 7 или после 20.
Возвращайся, если у нас будут неприятности. */
public class HomeWork11BooleanParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));// → true
        System.out.println(parrotTrouble(true, 7));// → false
        System.out.println(parrotTrouble(false, 6));// → false
    }

    public static boolean parrotTrouble(boolean talk, int hour) {
        if ((hour < 7 || hour > 20) && talk) {
            return true;
        }
        return false; //talk && hour < 7 || hour > 20;
    }
}
