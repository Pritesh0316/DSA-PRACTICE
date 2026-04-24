package Array.Medium;

public class LC2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0;
        int neg = 1;

        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                res[pos] = nums[i];
                pos+=2;
            }else{
                res[neg] = nums[i];
                neg+=2;
            }
        }

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
