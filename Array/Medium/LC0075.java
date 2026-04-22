package Array.Medium;

public class LC0075 {
    public static void main(String[] args) {
        int[] nums = {2,1,0,0,0,0,2,2,1};
        int n = nums.length;
        int w=0, x=0, y=0, z=0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                x++;
            }else if(nums[i] == 1){
                y++;
            }else{
                z++;
            }
        }

        while(x>0){
            nums[w] = 0;
            w++;
            x--;
        }
        while(y>0){
            nums[w] = 1;
            w++;
            y--;
        }
        while(z>0){
            nums[w] = 2;
            w++;
            z--;
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
