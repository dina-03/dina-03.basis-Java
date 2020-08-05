package lesson09;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a += b; //выражение a += b равнозначно значению a = a + b
        System.out.println(a);
        a -= b;
        System.out.println(a);
        int d = 3;
        int f = 4;
        d *= f;// d = d * f
        System.out.println(d);
        d *= f;
        System.out.println(d);
        d /= f;
        System.out.println(d);
        a /= f;
        System.out.println(a);
        d %= a;// d = d % a;
        System.out.println(d);
    }
}
