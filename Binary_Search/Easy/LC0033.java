package Binary_Search.Easy;

public class LC0033 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }

            // 🔹 Correct logic for rotated array
            if(nums[low] <= nums[mid]){  // Left sorted
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {  // Right sorted
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        System.out.println(-1);
    }
}
