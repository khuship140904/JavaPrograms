/*WAP to find sum of all digits in a given number */
import java.util.Scanner;
public class NumberProgramSet7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Number - ");
        int num=sc.nextInt();
        int sum=0;

        while (num>0) {
            sum = sum + num%10;
            num=num/10;
        }
        System.out.print("the Sum of the digits are - "+ sum);

    }
}
