package Recurssion.Easy;

public class LC0008{
    public static int recursiveAtoi(String s, int i, long num, int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            num = num * sign;
            
            if(num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            return (int) num;
        }

        int digit = s.charAt(i) - '0';

        num = (num * 10) + digit;

        long signednum = num * sign;

        if(signednum > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(signednum < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return recursiveAtoi(s, i+1, num, sign);
    }

    public static void main (String args[]){
        String s = "  1337c0d3";

        int n = s.length();
        int i = 0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        System.out.println(recursiveAtoi(s, i, 0, sign));
    }
}