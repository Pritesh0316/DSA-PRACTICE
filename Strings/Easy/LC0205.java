package Strings.Easy;

public class LC0205{
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST[c1] !=0 || mapTS[c2] != 0){
                if(mapST[c1] != c2 || mapTS[c2] != c1){
                    System.out.println(false);
                    return;
                }
            }else{
                mapST[c1] = c2;
                mapTS[c2] = c1;
            }
        }
        System.out.println(true);
    }
}