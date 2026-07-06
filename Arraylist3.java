import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();

        Student2 a = new Student2("khushi", 20);
        Student2 b = new Student2("mohan", 22);
        Student2 c = new Student2("riya", 25);
        Student2 d = new Student2("rudra", 11);
        Student2 e = new Student2("rohan", 27);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);
    }
    
}
