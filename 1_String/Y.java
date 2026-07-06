import java.util.Scanner;
public class Y {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        //System.out.println(s.length()-(k-1));

        String[] str= new String[s.length()-(k-1)];
        for(int i=0,j=0;j<str.length;i++,j++){
            String y= s.substring(i,i+k);
            str[j]=y;
        }
        String largest=str[0];

        String smallest=str[0];

        for(String next: str){
            if (next.compareTo(largest)>0) {
                largest=next;
             }
        }
        for(String next: str){
            if (next.compareTo(smallest)<0) {
                smallest=next;
             }
        }

        System.out.println(largest);
        System.out.println(smallest);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    
}
}
