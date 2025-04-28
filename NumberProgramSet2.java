/*WAP to print all even numbers between two given range */
import java.util.Scanner;
public class NumberProgramSet2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Starting number - ");
        int num1=sc.nextInt();
        System.out.print("Ending number - ");
        int num2=sc.nextInt();

        System.out.println("these are the even numbers between "+ num1 + " and "+ num2+ " - ");
        for (int i=num1;i<=num2;i++){
            if (i%2==0) {
                System.out.println(i+ " ");
             }
        }
    }
}
