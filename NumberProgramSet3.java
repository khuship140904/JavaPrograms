/*WAP to print 'n' natural numbers in reverse order */
import java.util.Scanner;
public class NumberProgramSet3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N - ");
        int N=sc.nextInt();

        for(int i=N; 0<i&&i<=N;i--){
            System.out.print(i +" ");
        }
    }
    
}
