/*. Check Positive, Negative or Zero
 Input: Any integer
 Output: "Positive", "Negative" or "Zero"
 */

import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the number you want to check-");
        int a=num.nextInt();

        if (a<0) {
            System.out.println("Negative");
        }
        else if (a>0) {
            System.out.println("Positive");
        }
        else if (a==0) {
            System.out.println("Zero");
        }
        else{
            System.out.println("Enter the number broo!!");
        }
    }
}
