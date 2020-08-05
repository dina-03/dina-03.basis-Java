package lesson04;

public class CalculatorTest {
    public static void main(String[] args) {
        int test = Calculator.addition(3, 5);
        System.out.println("Вывод расчета сложения двух чисел 3 и 5 = "+ test);
        double secondTest = Calculator.division(7,10);
        System.out.println("division 7 und 10 = " + secondTest);
    }
}
