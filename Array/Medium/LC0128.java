package Array.Medium;
import java.util.Arrays;

public class LC0128 {
    public static void main(String[] args) {
        int[] nums = {};
        int n = nums.length;

        if(nums.length == 0){
            System.out.println(0);
            System.out.println("Dont consider below answwers.");
        }

        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for(int i=1; i<n; i++){
            if(nums[i-1]+1 == nums[i]){
                count++;
            }else if(nums[i-1] == nums[i]){
                continue;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
