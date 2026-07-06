public class I {
    public static void main(String[] args) {
        String c="industrialization";
        int index=0;

        while ((index=c.indexOf('i',index))!=-1) {
            System.out.println(index++);
         }
  
 }
}
