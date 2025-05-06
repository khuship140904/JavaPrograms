class Sorting { 
    public static void main(String[] args) {
    

    int[] a={43,64,13,65,88,221,67,42,18,20};
    int[] b= new int[a.length];
    
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++){

        if (a[i]>a[j+1]) {
            

            //for(int j=0;j<a.length;j++){
                int temp=a[j+1];
                b[i]=temp;

            }}


            
        }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
    }
}

