
/*write a code to print this pattern
#######
######
#####
####
###
##
#*/
public class pattern3{ public static void main(String[] args) {
            
    int i=0;
    for (i=7;i>0;i--){
        for(int j =0;j<i;j++){
            System.out.print("#");
        }
        System.out.println("");
    }
}}