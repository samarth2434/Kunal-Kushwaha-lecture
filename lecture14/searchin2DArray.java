
import java.util.Arrays;

public class searchin2DArray{
    public static void main(String[] args) {
        int[][] arr ={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 34;
        int[] ans = search(arr, target);// fromat of return value {i, j}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        int row;
        int col;
         for(row=0; row<arr.length; row++){
            for(col=0; col<arr[row].length; col++){
                if(arr[row][col] == target)  {
                    return new int[] {row, col};
                }
            }
         }
         return new int[] {-1,-1};
    }
}