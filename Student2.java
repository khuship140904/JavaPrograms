public class Student2 {
    String name;
    int age;

    Student2(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        
        return name + "-" + age;
    }
    
}
