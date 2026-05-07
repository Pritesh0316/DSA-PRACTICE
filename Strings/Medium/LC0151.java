package Strings.Medium;

public class LC0151{
    public static void main(String[] args) {
        String s = "the sky is blue";
        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}