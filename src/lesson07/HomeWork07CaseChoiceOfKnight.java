package lesson07;

public class HomeWork07CaseChoiceOfKnight {
    public static void main(String[] args) {
        split();
        trafficPoliceProgram(200);
        System.out.println("200 km/ч ");
        split();
        trafficPoliceProgram(50);
        System.out.println("50 km/ч");
        split();
        trafficPoliceProgram(77);
        System.out.println("77 km/ч");
        split();
        trafficPoliceProgram(120);
        System.out.println("120 km/ч");
        split();
        trafficPoliceProgram(150);
        System.out.println("150 km/ч");
        split();
        trafficPoliceProgram(60);
        System.out.println("60 km/ч");
        split();
        trafficPoliceProgram(101);
        System.out.println("101 km/ч");
        split();
        choiceOfKnight(1);
        choiceOfKnight(2);
        choiceOfKnight(3);
        choiceOfKnight(7);

    }

    public static void trafficPoliceProgram(int speed) {
        if (speed <= 50) {
            System.out.println("Нарушений нет - молодец!!!");
        } else if (speed <= 65) {
            System.out.println("Устное порицание и лекция на 5 минут!");
        } else if (speed <= 100) {
            System.out.println("Штраф 40 € ");
        } else if (speed <= 130) {
            System.out.println("Штраф 500 € ");
        } else {
            System.out.println("Штраф 1000 €, конфискация прав и транспортного средства на 3 года!!! ");
        }
    }

    public static void split() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void choiceOfKnight(int selection) {
        switch (selection) {

            case 1:
                System.out.println("Пойдешь прямо - смерть найдешь! ");
                break;
            case 2:
                System.out.println("Пойдешь на лево - богатство найдешь! ");
                break;
            case 3:
                System.out.println("Пойдешь на право - жену-красавицу найдешь!!!");
                break;
            default:
                System.out.println("Извините, но у вас только три варианта! В противном случае возвращайтесь домой!");
                break;

        }
    }

}

