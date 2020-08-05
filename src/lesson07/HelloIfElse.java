package lesson07;

public class HelloIfElse {
    //условный оператор if, if-else
    public static void main(String[] args) {
        alcoholPermissionTwo(14);
        alcoholPermissionTwo(16);
        alcoholPermissionTwo(20);
        alcoholPermissionTwo(65);
    }

    public static void alcoholPermissionTwo(int age) {
        if (age < 16) {
            System.out.println("Алкоголь не продавать");
        } else if (age >= 16 & age < 18) {
            System.out.println("Продажа слабоалкогольных напитков разрешена");

        } else {
            System.out.println("Продажа алкоголя разрешена");
        }
    }

    public static void helloIf() {
        boolean permission = true;
        if (permission) {
            System.out.println("ich fahre nach Hamburg");
        } else {
            System.out.println("ich bleibe zu Hause");
        }

    }
}
