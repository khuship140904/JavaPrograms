/*WAP to find product of 'n' natural numbers */
import java.util.Scanner;
public class NumberProgramSet5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter N - ");
        int N= sc.nextInt();
        int product=1;

        for(int i=1;i<=N;i++){
            product=product*i;
         } 
         System.out.println("the product of "+N+ " numbers is - " + product);
        }
}
