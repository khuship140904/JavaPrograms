/*WAP to print reverse of a given number */
import java.util.Scanner;
public class NumberProgramset9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter N - ");
        int N =sc.nextInt();
        int rev=0;
        System.out.print("the reverse of the number is- ");
        while(N>0){
            rev=N%10;
            N=N/10;
            System.out.print(rev);
        }
    }
}
