package Strings.Easy;

public class LC0151 {
    public static void main(String[] args) {
        String s = "a good   example  ";
        s = s.trim();
        System.out.println(s);

        StringBuilder sb = new StringBuilder();

        String[] words = s.split("\\s+");
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
