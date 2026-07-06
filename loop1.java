/*print numbers from 1 to N using a for loop
 Input: N
 Output: 1 2 3 ... N
 */

import java.util.Scanner;


public class loop1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the numbers till where you want to print - ");
        int num= sc.nextInt();
        System.out.print("The numbers from 0 to "+ num +" are- ");

        for (int i=1 ; i<=num ; i++) {
            System.out.print(i+" ");
        }
        
    }
    
}
