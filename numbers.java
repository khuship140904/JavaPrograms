import java.util.*;
/* write a program to print the spelling of the number on entering the number */

public class numbers {
    public static void main(String[] args){
        int num;
        Scanner obj =new Scanner(System.in);
System.out.println("Enter your number");

num =obj.nextInt();
switch (num) {
    case 1:
    System.out.println("ONE"); 
    break;

    case 2:
    System.out.println("TWO");
    break;

    case 3:
    System.out.println("THREE");
    break;

    case 4:
    System.out.println("FOUR");
    break;

    case 5:
    System.out.println("FIVE");
    break;

    case 6:
    System.out.println("SIX");
    break;


    case 7:
    System.out.println("SEVEN");
    break;

    case 8:
    System.out.println("EIGHT");
    break;

    case 9:
    System.out.println("NINE");
    break;

    default:
        break;
}
    
}
}
