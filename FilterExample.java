import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(2);
        ArrayList<Integer> data = (ArrayList<Integer>) list.stream().filter( a->a>2).collect(Collectors.toList());
        System.out.println(data);
    }
    
}
