import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());

        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        char l1 = A.charAt(0);
        char l2 = B.charAt(0);

        char u1 = (char)(l1-32);
        char u2 = (char)(l2-32);

        String y1=A.replace(l1,u1);
        String y2=B.replace(l2,u2);

        System.out.println(y1+" "+y2);
     }
} 
