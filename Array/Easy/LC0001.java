public class LC0001{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int n = nums.length;
        int target = 9;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}