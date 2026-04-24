package Array.Medium;

public class LC0121{
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int n = nums.length;
        int buyprice = nums[0];
        int profit = 0;
        int max = 0;

        for(int i=1; i<n; i++){
            if(buyprice <= nums[i]){
                profit = nums[i] - buyprice;
                max = Math.max(max, profit);
            }else{
                buyprice = nums[i];
            }
        }
        System.out.println(max);
    }
}