public class LC0136 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,1};
        int n= nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(nums[i]);
            }
            count = 0;
        }
    }
}
