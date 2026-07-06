/*rowwise sum of 2d array */

public class Array_4 {
    public static void main(String[] args) {
        int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        for(int j=0;j<arr[0].length;j++){
            int sum=0;
                for(int i=0;i<arr.length;i++){
               sum=sum+arr[i][j];
            }
       System.out.println(sum);
        }
    }
    
}
