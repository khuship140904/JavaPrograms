/* write a program to sum up the digits of the numbers
 * for eg- a=1456
 * sum=1+4+5+6=16 */

public class sumofdigits {
    public static void main(String[] args) {
        int a=45698;
        int sum =0;

        while (a>0) {
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("the sum of the digits of the numbers is -" +sum);
    }
}
