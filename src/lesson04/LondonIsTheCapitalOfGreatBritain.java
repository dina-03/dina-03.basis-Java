package lesson04;

public class LondonIsTheCapitalOfGreatBritain {
    public static void main(String[] args) {
        String  articleTitle = "london is the capital if great britain";
        articleTitle = articleTitle.toLowerCase();
        System.out.println(articleTitle);
        articleTitle = articleTitle.substring(0, 1).toUpperCase()+articleTitle.substring(1).toLowerCase();
        System.out.println(articleTitle);
    }
}
