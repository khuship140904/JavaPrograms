import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();

        Student3 a = new Student3("khushi", 20);
        Student3 b = new Student3("mohan", 22);
        Student3 c = new Student3("riya", 25);
        Student3 d = new Student3("rudra", 11);
        Student3 e = new Student3("rohan", 27);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);

        Student3 x = new Student3("khushi", 20);

        System.out.println(list.contains(x));
        System.out.println(list.remove(x));

        System.out.println(list);
    }
}
