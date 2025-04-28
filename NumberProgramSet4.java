/*WAP to find sum of 'n' natural numbers */
import java.util.Scanner;
public class NumberProgramSet4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter N - ");
    int N=sc.nextInt();
    int sum=0;
    for(int i=0;i<=N;i++){
        sum=sum+i;
    }
    System.out.println("the sum of " + N + " Numbers- "+ sum);
    }   
}
