public class BinarySearch {
    public static int BinarySearch() {
        
    int target = 33;
    int[] arr = { 1,2,3,4,5,6,7,8};
    int start =0;
    int endpoint = arr.length-1;

    while (start <= endpoint) 
    {
        int midpoint = (start+ endpoint)/2;

        if (arr[midpoint]== target) {
            return midpoint;
        }
        else if (arr[midpoint]>target) {
            endpoint = midpoint -1;
            
        }
        else{
            start=midpoint+1;
        }
    }
    return -1;
    }
}
