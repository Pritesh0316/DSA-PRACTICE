package Binary_Search.Easy;

public class LC0081 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;

        int low = 0;
        int high = nums.length-1;
        while(high >= low){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                System.out.println("True");
                return;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        System.out.println("False");
    }
}
