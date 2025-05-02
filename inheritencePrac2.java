class Person {
   void displayname(){
    System.out.println("Khushi Patel");}
}

class Student extends Person{
    void displayclass(){
        System.out.println("class 12");
    }
}

class moniter extends Student{
    void discipline(){
        System.out.println("be in discipline");
    }
}
public class inheritencePrac2 {
    public static void main(String[] args) {
    moniter sc=new moniter();
    sc.displayname();
    sc.displayclass();
    sc.discipline();
    }
    
}
