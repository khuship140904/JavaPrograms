import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("mohan");
        list.add("rohan");
        list.add("ratan");
        list.add("sohan");
        list.add("bhupendra jogi");

        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);

        System.out.println(list.remove(0));
    }
    
}
