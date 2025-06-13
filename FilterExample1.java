import java.util.ArrayList;

public class FilterExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(2);

        int sum = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);
    }
    
}
