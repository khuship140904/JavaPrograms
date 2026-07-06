import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        Student1 a = new Student1("khushi", 20);
        Student1 b = new Student1("mohan", 22);
        Student1 c = new Student1("riya", 25);
        Student1 d = new Student1("rudra", 11);
        Student1 e = new Student1("rohan", 27);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);
    }
}
