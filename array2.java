import java.util.Scanner;
/* here is a program to take input of the array from the user  */

public class array2 {
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of the array-");
    int n=sc.nextInt();
    System.out.println("enter the values-");
    int[] arr=new int[n];
    int sum=0;
    int maximum=arr[0];
    int minimum=arr[0];
    int even=0;
    int odd=0;

    for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }


    System.out.println("the array is -");
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]+" ");
  }
   
    for (int k=0;k<arr.length; k++){
    sum=sum+arr[k];
   }
   System.out.println("the sum is-"+sum);

   for (int k=0;k<arr.length; k++){
    if (arr[k]%2==0) {
        System.out.println("the number "+ arr[k]+" is even number");
        even++;
    }
    else {
        System.out.println("the number "+ arr[k]+" is odd number");
        odd++;
    }
}
 System.out.println("there are "+ even + " even numbers");
 System.out.println("there are "+ odd + " odd numbers");
    for (int k=0;k<arr.length; k++){

        if (arr[k]>maximum) {
            maximum=arr[k];
            
        }
    }
   System.out.println("the number "+ maximum +" is maximum");
for (int k=0;k<arr.length; k++){

    if (arr[k]<minimum) {
        minimum=arr[k];
        
    }
    
}
System.out.println("the number "+ minimum +" is minimum");
 }
}

