class hello {
    int age;
    hello(int age){
        this.age=age;
    }
    void print(){
        System.out.println(age);
    }
}
class overloading {
    public static void main(String[] args) {
        hello s=new hello(15);
        s.print();
        
    }
    
}
