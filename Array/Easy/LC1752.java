public class LC1752{
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        System.out.println(count<=1);
    }
}