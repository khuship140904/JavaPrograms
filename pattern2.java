
/*to print this pattern -
 * *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *  *
 */
public class pattern2 {
     public static void main(String[] args) {
            
    int i=0;
    for (i=0;i<7;i++){
        for(int j =0;j<=i;j++){
            System.out.print(" * ");

        }
        System.out.println("");
        }
   }

}
