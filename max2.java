import java.util.Scanner;
/*Find Greatest of Two Numbers using if-else*/

public class max2 {
    public static void main(String[] args) {
        Scanner acc= new Scanner(System.in);
        System.out.print("enter the 1st number- ");
        int num1= acc.nextInt();
        System.out.print("enter the 2st number- ");
        int num2= acc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is greater than "+ num2);
        }
        else if(num2>num1){
            System.out.println(num2+" is greater than "+ num1);
        }
        else{
            System.out.println("both are equal");
        }

    }
    
}
