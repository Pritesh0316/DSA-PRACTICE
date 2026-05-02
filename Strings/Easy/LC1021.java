package Strings.Easy;

public class LC1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    sb.append(c);
                }
                depth++;
            }else{
                depth--;
                if(depth > 0){
                    sb.append(c);
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}
