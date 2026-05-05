package Strings.Medium;

public class LC0008 {
    public static void main(String[] args) {
        String s = "0-1";
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;
        if(i<n && s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        int result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > (Integer.MAX_VALUE - digit)/10){
                if(sign == 1){
                    System.out.println(Integer.MAX_VALUE);
                }else{
                    System.out.println(Integer.MAX_VALUE);
                }
                return;
            }

            result = (result * 10) + digit;
            i++;
        }

        System.out.println(result * sign);
    }
}
