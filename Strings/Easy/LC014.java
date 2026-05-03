package Strings.Easy;

public class LC014 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        
        String prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("null");
                    return;
                }
            }
        }
        System.out.println(prefix);
    }
}
