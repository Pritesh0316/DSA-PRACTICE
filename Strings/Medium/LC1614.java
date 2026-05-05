package Strings.Medium;

public class LC1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int count = 0;
        int depth = 0;

        for(char c : s.toCharArray()){
            if(c =='('){
                count++;
            }else if(c ==')'){
                depth = Math.max(depth, count);
                count--;
            }
        }

        System.out.println(depth);
    }
}
