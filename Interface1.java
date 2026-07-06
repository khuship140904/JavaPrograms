class student implements teacher {
    public void print(){
        System.out.println("name of students");
    }
}

interface teacher{
    void print();
}

public class Interface1 {
    public static void main(String[] args) {
        student obj= new student();
        obj.print();
    }
    
}
