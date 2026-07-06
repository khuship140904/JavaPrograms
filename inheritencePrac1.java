class Employee {
    void work(){
        System.out.println("work pending");
    }
}

class manager extends Employee{
    void attendmeeting(){
        System.out.println("attend the meeting asap");
    }
}
public class inheritencePrac1 {
    public static void main(String[] args) {
        manager sc= new manager();
        sc.work();
        sc.attendmeeting();
    }
    
}
