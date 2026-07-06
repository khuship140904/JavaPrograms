/* wap to find the sum of divisor of the given number using interface .For example divisors 
of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.*/

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
   public int divisor_sum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        if (n%i==0) {
            sum=sum+i; } }
    System.out.println(sum);
    return sum;
    }
}
class G{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        AdvancedArithmetic y= new MyCalculator();
        y.divisor_sum(n);
        
    }
}