package Array.Medium;

public class LC0169{
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}