/*Find the kth max and min element of an array */

import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x={56,8,12,4,77,32,69,58,15,26,78};
        int k=sc.nextInt();
        int max=x[0];
        int max1=x[0];

        for(int i=0;i<x.length;i++){
            if (max<x[i]) {
                for(int j=max;j<k;j++){
                    if(max1<x[j]){
                        max1=x[j];
                    }

                }

                
            }

        }

        System.out.println(max1);

        
    }
    
}
