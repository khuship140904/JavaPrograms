import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag;
        char[] x= a.toCharArray();
        char[] y= b.toCharArray();
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length-1-i;j++){
                if(x[j]>x[j+1]){
                    char temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                 }}}
                 for(int i=0;i<y.length;i++){
            for(int j=0;j<y.length-1-i;j++){
                if(y[j]>y[j+1]){
                    char temp=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp;
                 }}}

                 for(char next:x){
                    System.out.print(next);
                 }
                 System.out.println();
                 for(char next:y){
                    System.out.print(next);
                 }
                 
        if(a.length()==b.length()){
            int temp=0;
            if(x==y)
            for(int i=0;i<x.length;i++){
                if(x[i]==y[i]){
                    temp++;
                }
                else{
                    temp=0;
                }
            }
            if(temp!=0){
                flag=true;
            }
            else{
                flag=false;
            }
            
        }
        else{
            flag=false;
        }
        return flag;
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}