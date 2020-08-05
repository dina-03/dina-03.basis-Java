package lesson24;

public class HomeWork24 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));// →2
        System.out.println(dateFashion(5, 2));// →0
        System.out.println(dateFashion(5, 5));// →1
        split();
        System.out.println(sortaSum(3, 4));// →7
        System.out.println(sortaSum(9, 4));// →20
        System.out.println(sortaSum(10, 11));// →21
        split();
        /*System.out.println(in1To10(5, false));// →true  эту задачу вы не задавали!!!!! :)
        System.out.println(in1To10(11, false));// →false
        System.out.println(in1To10(11, true));// →true*/
        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10
        System.out.println(blueTicket(14, 6, 4));// → 5
        System.out.println(blueTicket(12, 8, 2));// → 5
        System.out.println(blueTicket(12, 2, 8));// → 5
        System.out.println(blueTicket(2, 12, 8));// → 5
        System.out.println(blueTicket(16, 6, 4));// → 5
        split();
        /*System.out.println(blueTicketTwo(14, 6, 4));// 5
        System.out.println(blueTicketTwo(6, 1, 4));// 10
        System.out.println(blueTicketTwo(9, 1, 0));// 10
        System.out.println(blueTicketTwo(9, 2, 0));// 0*/
    }

    /*  У вас есть синий лотерейный билет, с вставками a, b и c.
    Это делает три пары, которые мы называем ab, bc и ac.
    Рассмотрим сумму цифр в каждой паре. Если любая пара сложится ровно в 10, то результат будет 10.
    Иначе, если сумма ab ровно на 10 больше, чем сумма bc или ac, то результат равен 5. Иначе результат равен 0.*/
    //(Math.abs(a - c) == 10 || Math.abs(b - a) == 10 || Math.abs(a - b) == 10)
    private static int blueTicket(int a, int b, int c) {
        int n1, n2, n3;
        n1 = a + b;
        n2 = b + c;
        n3 = c + a;

        if (n1 - n2 == 10 || n3 - n2 == 10 || n2 - n3 == 10) {
            return 5;
        } else if (n1 == 10 || n2 == 10 || n3 == 10) {
            return 10;
        }
        return 0;
    }

   /* public static int blueTicketTwo(int a, int b, int c) {
        int n1, n2, n3;
        n1 = a + b;
        n2 = b + c;
        n3 = c + a;
        if (n1 - n2 == 10 || n1 - n3 == 10) {
            return 5;
        } else if (n1 == 10 || n2 == 10 || n3 == 10) {
            return 10;
        }
        return 0;
    }*/

    /* Учитывая число n, верните true, если n находится в диапазоне 1...10, включительно.
      Если вне режима верно, возвращаем true, если число меньше или равно 1, или больше или равно 10.
    private static boolean in1To10(int n, boolean b) {
        if (n >= 1 || n <= 10) {
            return true;
        } else if ((n >= 1 || n <= 10) && b == true) {
            return false;
        }
        return false;
    }*/


    /* Учитывая 2 inta, а и б, возвращают свою сумму.
        Однако суммы в диапазоне 10...19 включительно, запрещены, поэтому в таком случае просто верните 20.*/
    private static int sortaSum(int a, int b) {
        if ((a + b) < 10 || (a + b) > 19) {
            return (a + b);
        } else
            return 20;
    }


    /* you и твое date свидание пытаетесь получить столик в ресторане.
       Параметр "you" - стильность вашей одежды, в диапазоне 0...10, а "date" - стильность одежды вашей пары.
       Результат получения таблицы кодируется как значение int с 0=нет, 1=может быть, 2=да.
       Если кто-то из вас очень стильный, 8 или больше, то результат - 2 (да).
       За исключением того, что если кто-то из вас имеет стиль 2 или меньше,
       то результат будет 0 (нет). В противном случае результат - 1 (возможно).*/
    private static int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public static void split() {
        System.out.println("_________________________");
    }


}
