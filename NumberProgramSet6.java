/*WAP to extract and display all digits from a given number */
import java.util.Scanner;

public class NumberProgramSet6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number- ");
        int num=sc.nextInt();
        System.out.print("the digits are- ");
        int digit =0;

        while (num>0) {
            digit=num%10;
            num=num/10;
            System.out.print(digit+" ");
        }
    }
}
