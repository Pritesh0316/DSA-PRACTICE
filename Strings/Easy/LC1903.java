package Strings.Easy;

public class LC1903{
    public static void main(String[] args) {
        String num = "35427";

        for(int i=num.length()-1; i>=0; i--){
            int digit = num.charAt(i) -'0';
            if(digit % 2 == 1){
                System.out.println(num.substring(0, i+1));
                return;
            }
        }
        System.out.println(String.valueOf(""));
    }
}