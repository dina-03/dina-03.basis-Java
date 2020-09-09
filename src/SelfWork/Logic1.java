package SelfWork;

public class Logic1 {
    public static void main(String[] args) {
        //У вас есть зеленый лотерейный билет, с вставками a, b и c.
        // Если все номера отличаются друг от друга, то результат равен 0.
        // Если сумма имеет больше цифр, чем a, просто возвращают a без b.
        // Если все номера одинаковы, то результат равен 20.
        // Если два номера одинаковы, то результат 10.
        System.out.println(greenTicket(1, 2, 3));// → 0
        System.out.println(greenTicket(2, 2, 2));// → 20
        System.out.println(greenTicket(1, 1, 2));// → 10
        System.out.println(greenTicket(2, 1, 2));// → 10
    }

    private static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }else if (a != b && b == c || b != c && c == a || c != a && a == b) {
            return 10;
        }else
        return 0;
    }

}
