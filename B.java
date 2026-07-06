/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  2 to 5 , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird. */
import java.util.Scanner;


public class B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2!=0)
        {
         System.out.println("weird");
        }
        else if (num%2==0)
        {
            if(num>=2 && num<=5){
         System.out.println("not weird");
            }
            else if(num>=6 && num<=20){
                System.out.println("weird");
                   }
                   else if(num>=20){
                    System.out.println("not weird");
                       }

        }

    }
    
}
