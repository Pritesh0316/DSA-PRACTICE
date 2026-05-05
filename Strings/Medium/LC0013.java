package Strings.Medium;

public class LC0013{
    public static void main(String[] args) {
        int[] val = new int[128];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;

        String s = "MCMXCIV";
        int result = 0;

        for(int i=0; i<s.length(); i++){
            if(i < s.length()-1 && val[s.charAt(i)] < val[s.charAt(i+1)]){
                result -= val[s.charAt(i)];
            }else{
                result += val[s.charAt(i)];
            }
        }

        System.out.println(result);
    }
}