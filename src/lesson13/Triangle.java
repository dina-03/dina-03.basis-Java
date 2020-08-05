package lesson13;

public class Triangle {
    public static void main(String[] args) {
        // first(10);
        //second(10);
        //geometryFirst("*",10);
        secondGeometry("*",10);
    }

    public static void first(int line) {
        String star = "*";
        String output2 = "";
        String divider = " ";
        String outputstar = "";
        for (int i = 0; i < line; i++) {
            outputstar = outputstar + star;
            output2 = output2 + divider;
            //System.out.println(divider + outputstar);
        }
        String empty = "";
        for (int i = 0; i < line; i++) {
            empty = outputstar.substring(0, line);
        }
        String finalVariable = "";
        for (int i = 1; i < line; i++) {
            finalVariable = outputstar.substring(0, outputstar.length() - i) + output2.substring(outputstar.length() - i);
            System.out.println(finalVariable);
        }
    }

    public static void second(int line) {
        String star = "*";
        String space = "         ";
        for (int i = 0; i < line; i++) {
            space = space + star;
            space = space.substring(1, space.length() - 1);
            System.out.println(space += star);
        }
    }
    public static void geometryFirst(String divider, int countLine){
        String line ="";
        for (int i = 0; i < countLine; i++) {
            line=line+divider;
            //System.out.println(line);
        }
        System.out.println(line);
    }
    public static void secondGeometry(String divider, int countLines){

    }
}