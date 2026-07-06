<<<<<<< HEAD
/* in this challenge, you must read  integers from stdin and then print them to stdout. 
Each integer must be printed on a new line. To make the problem a little easier,
 a portion of the code is provided for you in the editor below.

Input Format
There are  lines of input, and each line contains a single integer.*/
import java.util.Scanner;
class A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();

         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
        }

}
=======
public class A {
    public static void main(String[] args) {
        try{int y=12/0;}
        catch(ArithmeticException e){
          System.out.println("problem here");  
        }
        //System.out.println(y);
    }
    
}
>>>>>>> cd93c0b9d8c8c8a4ae738f0be340472bbc8e6eaf
