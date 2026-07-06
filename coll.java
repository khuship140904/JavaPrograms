import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>{
    int age ;
    String name ;

    public student (int age , String name ){
     this.age=age;
     this.name=name;
}
public String toString(){
    return age + " "+ name;
}

public int compareTo(student s) {
    return this.age-s.age;
   }
}


class coll{
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student(17,"rahul"));
        list.add(new student(16,"rohit"));
        list.add(new student(11,"mohit"));
        list.add(new student(51,"om"));
        
        Collections.sort(list);
        for(student s: list){
            System.out.println(s.toString());
        }
    }
}
