/* maximum number in 2d array */

public class Array_5 {
    public static void main(String[] args) {
        int[][] arr={
        {1,2,3},
        {4,55,6},
        {7,8,9}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if (max<arr[i][j]) {
                max=arr[i][j];
               }
            }
        }
        System.out.println(max);
    }
    }
