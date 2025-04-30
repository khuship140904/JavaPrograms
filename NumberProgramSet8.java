/*WAP to find the count of all digits in a given number*/
import java.util.Scanner;

public class NumberProgramSet8 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the Number - ");
      int num=sc.nextInt();
      int count=0;

      
      while (num>0){
        int digit=num%10;
        num=num/10;
        count++;
     }
     System.out.print("the number of digits are - "+ count);
  }    
}
