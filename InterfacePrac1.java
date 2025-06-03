interface Walkable {
    void walk();
}

interface runnable {
    void run();
}

public class InterfacePrac1 implements Walkable,runnable {
    public void walk(){
        System.out.println("man can walk");
    }
   public void run(){
        System.out.println("man can run also");
    }

    public static void main(String[] args) {
        InterfacePrac1 obj=new InterfacePrac1();
        obj.walk();
        obj.run();
        
    }


    
}
