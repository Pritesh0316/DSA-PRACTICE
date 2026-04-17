public class LC0026 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
        int position = 1;
        int count = 1;

        for(int i=1; i<n; i++){
            if(nums[i-1] != nums[i]){
                nums[position] = nums[i];
                position++;
                count++;
            }
        }
        System.out.println("There are " + count + " unique elements in the array.");
        for(int i=0; i<count ;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
