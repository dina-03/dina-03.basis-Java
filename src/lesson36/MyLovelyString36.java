package lesson36;

public class MyLovelyString36 {
    public static void main(String[] args) {
        myString();
        //String
        //StringBuffer - synchronized потокобезопасный или многопоточный
        //StringBuilder - однопоточный и не потокобезопасный
        //1.String это желательно неизменяемый литерал
    }

    private static void myString() {
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            pass.append(" ").append(i);
        }
        System.out.println(pass);
    }
}
