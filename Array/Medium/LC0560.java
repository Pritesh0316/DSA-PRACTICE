package Array.Medium;

public class LC0560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int[] prefix = new int[n];
        int target = 3;
        int sum = nums[0];
        int count = 0;

        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum = (i==0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum == target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
