import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hack {
    static {
        Scanner sc= new Scanner(System.in);
       int B=sc.nextInt();
       int H=sc.nextInt();
       Boolean flag;
        if(B>=0&&H>=0){
       flag=true;
     }
     else{
        flag=false;
     }
     	if(flag){
			int area=B*H;
			System.out.print(area);
		}
        else{System.out.println("java.lang.Exception: Breadth and height must be positive");}
    }
public static void main(String[] args){}

}