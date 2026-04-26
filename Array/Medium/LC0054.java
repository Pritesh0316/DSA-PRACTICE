package Array.Medium;

public class LC0054{
    public static void main(String[] args) {
        int[][] matrix  = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){
            for(int col=left; col<=right; col++){
                System.out.print(matrix[top][col] + " ");

            }
            top++;

            for(int row=top; row<=bottom; row++){
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            if(bottom>=top){
                for(int col=right; col>=left; col--){
                    System.out.print(matrix[bottom][col] + " ");
                }
            }
            bottom--;

            if(left<=right ){
                for(int row=bottom; row>=top; row--){
                    System.out.print(matrix[row][left] + " ");
                }
            }
            left++;
        }
        
    }
}