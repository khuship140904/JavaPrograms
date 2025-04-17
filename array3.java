/* write a program to find the sum of two arrays such that 
 * arr1={1,2,3,4}
 * arr2={5,6,7,8}
 * sum{1+5,2+6,3+7,4+8}
*/
public class array3 {
    public static void main(String[] args) {
        int[] arr1={1,5,6,7};
        int[] arr2={3,5,7,8};
        int[]  sum= new int[arr1.length];
        for( int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
    }
    System.out.print("arr1 + arr2 = {");
    for(int j=0;j<4;j++)
    {
        System.out.print(sum[j]+" ");
    }
    System.out.print("}");
    
}}
