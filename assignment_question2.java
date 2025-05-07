abstract class animal{
    abstract void sound();
}

class cat extends animal{
    void sound(){
        
        System.out.println("cat meows");
    }
}
class dog extends animal{
    void sound(){
        
        System.out.println("dog barks");
    }
}
class assignment_question2 {
    public static void main(String[] args) {
        animal x=new cat();
        animal y=new dog();

        x.sound();
        y.sound();
    }
}
