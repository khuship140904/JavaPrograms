import java.util.Scanner;

class L {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String y= S.substring(start,end);
        System.out.println(y);
    }
}