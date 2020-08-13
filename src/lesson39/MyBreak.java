package lesson39;

public class MyBreak {
    public static void main(String[] args) {
        boolean stopLockDown = true;
        quarantineMethode(stopLockDown);
       // quarantineMethode(!stopLockDown);
    }

    private static void quarantineMethode(boolean stopLockDown) {
        //создание карантинной зоны
        quarantineZone:
        {
            if (stopLockDown){
                System.out.println("Карантин закончился");
                break quarantineZone; //выход из зоны карантина
            }
            System.out.println("Мы в карантине");
        }
    }
}
