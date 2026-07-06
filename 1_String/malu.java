import java.util.Scanner;

public class malu {

    public static String getSmallestAndLargest(String s, int k) {
        String[] str= new String[s.length()-(k+1)];
        for(int i=0,j=0;i<s.length();i++,j++){
            String y= s.substring(i,i+k);
            str[j]=y;
        }

        

        String smallest = str[0];
         String largest = str[0];
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
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
