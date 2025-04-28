public class missingNum {
    public static void main(String[] args) {
        int[] arr={3,0,1,2,5};
        int sum=0;
        int maximum=0;
       int  withMisSum=0;
        for(int i=0;i<=4; i++) {
           sum=sum+arr[i];
        } 
        for (int k=0;k<arr.length; k++){

            if (arr[k]>maximum) {
                maximum=arr[k];
                
            }
        }
       withMisSum=maximum*(maximum+1);
       System.out.println(withMisSum);
        int missingNum=0;

        missingNum=withMisSum-sum;
        System.out.println(missingNum);

    }

}
