package Strings.Easy;

public class LC0796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        String doubled = s+s;
        System.out.println(doubled.contains(goal));
    }
}
