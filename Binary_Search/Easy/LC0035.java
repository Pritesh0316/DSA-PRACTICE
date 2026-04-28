package Binary_Search.Easy;

public class LC0035 {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;
        int low = 0;
        int high = nums.length - 1;

        while(high >= low){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }else if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}

