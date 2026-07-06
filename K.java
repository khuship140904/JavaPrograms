/*input-size of array and elements of the array
 * output-print the array
 */
import java.util.Scanner;
class K{
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int size=Sc.nextInt();
        int[] x=new int[size];

        for(int i=0;i<size;i++){
            
            x[i]=Sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(x[i]);
        }
        
    }
}