package OOPS;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
}

public class oops1 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "blue";
        pen.type = "gel";
        pen.write();
        
    }

    
}
