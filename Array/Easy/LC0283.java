public class LC0283 {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        int n=nums.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}