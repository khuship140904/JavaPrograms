/* write a program to check whether the given 
 * number is palindrome number or not
 */

public class palindrome {
    public static void main(String[] args) {
        int a=232;
        int original=a;
        int digit;
        int reverse =0 ;
         while (a>0){
            digit=a%10;
            reverse = reverse*10+digit;
            a=a/10;
         }
         System.out.println("the reverse number is " + reverse);
         if (reverse==original) {
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
}
