package lesson09;

public class BMI {
    public static void main(String[] args) {
        double height = 176.0;
        double weight = 100.0;
       // fundBmi(height, weight);
        System.out.println(fundBmi(height, weight));
    }

    public static double fundBmi(double height, double weight) {
        //I = m/ h^2
         height /= 100;
        //double result = weight / (height * height);

        return weight / (height * height);
    }
}
