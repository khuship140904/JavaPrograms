public class bubblesort {
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

    public static void main(String[] args) {
        bubblesort y=new bubblesort();
       int[] x={56, 8, 12, 4, 77, 32, 69, 58, 15, 26, 78};
       System.out.println("the array before- ");
        y.showArray(x);
        y.bubbleSort(x);
        System.out.println("the sorted array- ");
        y.showArray(x);
    }
}
