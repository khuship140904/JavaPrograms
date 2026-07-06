import java.io.*;
import java.util.*;

public class SOLU {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    char[] arr = A.toCharArray();
    char[] aloo = new char[arr.length];
    int temp=0;
    int i =0;
        
    for(int j=arr.length-1;j>=0;j--){
            aloo[i]=arr[j];
                i++;
            }
            for(int j=0;j<aloo.length;j++){
                
            System.out.println(aloo[j]);
            }


            for(int k=0,j=0;j<arr.length;k++,j++){
                if(aloo[k]==arr[j]){
                    temp++;
                }

                
            }
            if(temp==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
            
        }
    
}