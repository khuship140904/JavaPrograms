class vehicle{
    void run(){
        System.out.println("Vehicle chalti hai");
    }
}

class bike extends vehicle{
    void run(){
        System.out.println("bike bhi chalti hai");
    }
}

class kanan extends bike{
    void run(){
        System.out.println(" ");
    }
}
class Overriding {
    public static void main(String[] args) {
        vehicle sc=new vehicle();
        bike sc1=new bike();

        vehicle sc3=new bike();

        sc.run();
        sc1.run();
    }
}
