abstract class payment {
    abstract void pay();
}

class upipayment extends payment{
    void pay(){
        System.out.println("pay via upi");
    }
}

class absclass {
    public static void main(String[] args) {
    upipayment a= new upipayment();
    a.pay();        
    }
}
