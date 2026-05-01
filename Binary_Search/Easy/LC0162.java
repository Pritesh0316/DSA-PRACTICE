package Binary_Search.Easy;

public class LC0162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = low + (high-low)/2;

            if(nums[mid] < nums[mid+1]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        System.out.println(low);
        System.out.println(nums[low]);
    }
}
