/*Find the kth max and min element of an array */
public class Question3 {
   void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i = 0 ; i < n - 1 ; i++ ){
            for(int j = 0 ; j < n - i - 1 ; j++){
            if ( arr[ j ] > arr[ j + 1 ]) {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
    }
    void showArray(int arr[]){
        for(int value : arr ){
            System.out.print(value + " ");
        }
        System.out.println();
    }
    void kthmaxmin(int arr[],int k){
        int n = arr.length;
        
        if ( k>0 && k<n) {
        int kthmax=arr[n-k];
        System.out.println("the "+k+"th maximum element is- "+ kthmax);

        int kthmin=arr[k-1];
        System.out.println("the "+k+"th minimum element is- "+ kthmin);
        }
        else{
            System.out.println("invalid k");
        }
    }
    public static void main(String[] args) {
        Question3 y=new Question3();
       int[] x={56, 8, 12, 4, 77, 32, 69, 58, 15, 26, 78};
       System.out.println("the given array is - ");
       y.showArray(x);
       y.bubbleSort(x);
       System.out.println("the sorted array is - ");
       y.showArray(x);
       y.kthmaxmin(x,3);
    }   
}

