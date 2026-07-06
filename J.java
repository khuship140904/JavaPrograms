import java.util.Scanner;
class J {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        int y=s1.length()+s2.length();

        System.out.println(y);
        if (s1.charAt(0)>s2.charAt(0)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        char lowercase1=s1.charAt(0);
        char lowercase2=s2.charAt(0);

        char uppercase1= (char)(lowercase1-32);
        char uppercase2= (char)(lowercase2-32);

        String y1= s1.replace(lowercase1,uppercase1  );
        String y2= s2.replace(lowercase2,uppercase2  );
        
        System.out.println(y1+" "+y2);
        
    }

}