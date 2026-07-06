/* wap to find largest even number and smallest odd number in a array */
class F { 
    public static void main(String[] args) {
    int[] x={23,76,98,35,89,50,47,101,20,13,10,112,7};
    int max=x[0];
    int min=x[0];

    for(int next:x){
        if (max<next) {
            if (next%2==0) {
                max=next;
             }
        }
    }
    for(int next:x){
        if (min>next) {
            if (next%2==1) {
                min=next;
             }
        }
    }
System.out.println("the maximum even number is - "+max);
System.out.println("the minimun odd number is - " +min);
 }
}
