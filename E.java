import java.io.*;
import java.util.*;


class parallellogram{

        
        static {
            Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
            if(n1>0&&n2>0){
            int res=n1*n2;
            System.out.println(res);
            }
            else{
             System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
}

public class E {
public static void main(String[] args) {
         parallellogram obj=new parallellogram();
    }
} 