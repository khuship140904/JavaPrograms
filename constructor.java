class Innerconstructor{
    String name="sumit";
    int age=75;

Innerconstructor(String name ,int age){
       name=name;
       age=age;
    System.out.println(name+ " "+ age);
    }    
}
public class constructor {
    public static void main(String[] args) {
        Innerconstructor obj=new Innerconstructor("khushi", 20);
        Innerconstructor obj1=new Innerconstructor("riya", 16);
        Innerconstructor obj2=new Innerconstructor("sumit", 16);
        Innerconstructor obj3=new Innerconstructor("rudra", 9);
        Innerconstructor obj4=new Innerconstructor("ishita", 7);
       System.out.println(obj.name);
       System.out.println(obj.age);
    }
}
