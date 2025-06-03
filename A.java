public class A {
    public static void main(String[] args) {
        try{int y=12/0;}
        catch(ArithmeticException e){
          System.out.println("problem here");  
        }
        //System.out.println(y);
    }
    
}
