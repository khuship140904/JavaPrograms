/* Find the minimum and maximum element in an array */

class Question1 {
    public static void main(String[] args) {
        int[] x={23,76,43,74,98,55,12};

        int max=x[0];
        int min=x[0];
        for(int i=0;i<x.length;i++){
            if (max<x[i]) {
                max=x[i];
            }
        }
        System.out.println("the maximum number in the array is - "+max);

        for(int i=0;i<x.length;i++){
            if (min>x[i]) {
                min=x[i];
            }
        }
        System.out.println("the minimum number in the array is - "+min);
    }
    
}
