package lesson07;

public class Baikonur {
    public static void main(String[] args) {
        double shuttleSpeedOne = 5.2;
        double shuttleSpeedTwo = 15.1;

        shuttleStart(shuttleSpeedOne);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        shuttleStart(shuttleSpeedTwo);
    }

    public static void shuttleStart(double speed) {
        final double SUPERCONSTANT_G = 10.0;
        //final double PI = 3.14;
        if (speed < SUPERCONSTANT_G){
            System.out.println("Первоначально ускорение недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовка аварийной службы");
        }else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить персс-релиз об успешной службе");
            System.out.println("Подготовить великих программистов к государственной наградам");
        }
    }
}
