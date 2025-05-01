class InnerconsChaining {
    String name="mahiii";
        int age;

    InnerconsChaining(){
        System.out.println("hiiii");
    }
       InnerconsChaining(int age){
        this();
        System.out.println("hello");
    }
       InnerconsChaining(String name,int age){
        this(age);
        System.out.println("hey");
    }
}
public class consChaining {
    public static void main(String[] args) {
InnerconsChaining obj=new InnerconsChaining("khushi",14);
System.out.println(obj.name);
    }
}
