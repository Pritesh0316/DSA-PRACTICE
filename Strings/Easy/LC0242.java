package Strings.Easy;

public class LC0242{
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(s.length() != t.length()){
            System.out.println("false");
            return;
        }

        int[] freq = new int[256];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        for(int i=0; i<t.length(); i++){
            if(--freq[t.charAt(i)] < 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}