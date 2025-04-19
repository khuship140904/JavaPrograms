/*Check whether a character is vowel or consonant using switch-case */
import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
    System.out.print("enter the character-");
    char character = sc.next().charAt(0);
    
   switch (character) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
    
            System.out.println("the character is vowel");
            
    default:
    if (character>='a' && character <='z') {
        System.out.println("the character is consonant");
        
    }
    else{
        System.out.println("enter a character bro");

    }
            break;
    }
  }
}
