abstract class payment{
    abstract void pay(int a);
    void success(){
        System.out.println("payment done");
}}
class upi_payment extends payment{
    void pay(int a){
        System.out.println("the payment - "+a);
    }
}
class upi1_payment extends payment{
    void pay(int b){
        System.out.println("the payment - "+b);
    }
}
  class absclass1 {
    public static void main(String[] args) {
        payment x=new upi_payment();
        payment y=new upi1_payment();

        x.success();
        x.pay(200);
        y.pay(400);
    }
 }