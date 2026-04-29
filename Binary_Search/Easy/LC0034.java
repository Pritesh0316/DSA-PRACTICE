package Binary_Search.Easy;

public class LC0034 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] res = {-1, -1}; 
        int target = 8;

        res[0] = firstOcc(nums, target);
        res[1] = lastOcc(nums, target);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int firstOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(high>=low){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid] >= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(high>=low){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid] >= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
