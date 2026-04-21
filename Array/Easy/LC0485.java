public class LC0485{
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        int n = nums.length;
        int max = 0;
        int ones = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                ones++;
            }else{
                max = Math.max(max, ones);
                ones = 0;
            }
        }
        System.out.println("Max Consecutive ones : "+ Math.max(max, ones));
    }
}