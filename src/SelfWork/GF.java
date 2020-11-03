package SelfWork;

public class GF {
    public static void main(String[] args) {
        /*double pi = 3.14;
        String myPI = String.valueOf(pi);
        System.out.println(myPI);
        String number = "10";
        System.out.println(number);
        int result = Integer.parseInt(number);
        System.out.println(result);
        String name = "Андрей";
        char myChar = name.charAt(2); //д
        System.out.println(myChar);*/
        /*String s1 = "Das is String";
        String s2 = "Das is String";
        String s3 = "Das ist auch String";
        int result = s1.compareTo(s2);
        System.out.println(result);
        result = s2.compareTo(s3);
        System.out.println(result);
        result = s3.compareTo(s1);
        System.out.println(result);
        String str = "Hello";
        str = str.concat(" world!");
       // System.out.println(str);
        str = str.concat(" my dear Man!");
        System.out.println(str);*/
        int i = 0;
       /* do {
            System.out.println("i = " + i);
            i += 10;
        }
        while (i < 20);
        System.out.println(i);*/

        while (true) {
            System.out.print(i + ", ");
            i++;
            if (i > 20)
                break;
        }
        System.out.println();
        StringBuffer sb = new StringBuffer("Cat");
        sb.setCharAt(1, 'o');
        System.out.println(sb);
        // tvInfo.setText(sb.toString());
        sb.insert(3, " love");
        System.out.println(sb);
        //sb.delete(0, 4); // -> love
        sb.deleteCharAt(2); // -> Co love
        System.out.println(sb);
        StringBuilder builder = new StringBuilder();
        builder.append('c');
        builder.append("orona");
        System.out.println(builder);
        builder.append(" virus");
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
