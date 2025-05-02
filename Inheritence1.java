class animal {
    void eat(){
        System.out.println("animal can eat");
       
    }
}

class dog extends animal{
    void bark(){
        System.out.println("dog always barks");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("cat always meow");
    }

    
}

public class Inheritence1 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.eat();
        obj.bark();
    }
    
}
