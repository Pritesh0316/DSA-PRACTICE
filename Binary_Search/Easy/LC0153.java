package Binary_Search.Easy;

public class LC0153 {
    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        int low = 0;
        int high = nums.length-1;

        while(high >= low){
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(nums[low]);
    }
}
