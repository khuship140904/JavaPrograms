/*TASK-2 using array x make same array y but reverse the order of 1d array*/
class H2 {
    public static void main(String[] args) {
        int[][] x={{12,23,45,56},{5,7,9},{3,34}};
        int[][] y= new int[x.length][];

        for(int i=0;i<x.length;i++){
            y[i]=new int[x[i].length];
            for(int j=0;j<y[i].length;j++){
                y[i][j]=x[i][j];
           }
        }
System.out.println("-----------ARRAY BEFORE REVERSE----------");
        
        for(int i=0;i<y.length;i++){
           for(int j=0;j<y[i].length;j++){
               System.out.print(y[i][j]+" ");
           }
           System.out.println();
       }
System.out.println("-----------ARRAY AFTER REVERSE----------");

        for(int i=y.length-1;i<y.length&&i>=0;i--){
        for(int j=0;j<y[i].length;j++){
            System.out.print(y[i][j]+" ");
        }
        System.out.println();
    }
}}