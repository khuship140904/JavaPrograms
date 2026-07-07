public class Student3 {
    String name;
    int age;

    Student3(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        
        return name + "-" + age;
    }

    public boolean equals(Object obj){
      return this.name.equals(((Student3)obj).name); 
    }
}
