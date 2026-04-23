package Array.Medium;

public class LC0053 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int n = nums.length;
        int cs = nums[0];
        int ms = nums[0];

        for(int i=1; i<n; i++){
            cs = Math.max(nums[i], cs+nums[i]);
            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }
}
