class D {
    void pro(){
        System.out.println("hello");
    }
}
class D1 extends D{
    void pro(){
        System.out.println("hiii");}

        public static void main(String[] args) {
            D x= new D1();
            x.pro();
        }

    }
