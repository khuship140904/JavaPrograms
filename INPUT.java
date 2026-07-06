/* how to take input from the user in java  */
import java.util.*;
public class INPUT {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your number");
    char a= in.next().charAt(0);
    System.out.println("user value"+a);
 }
}