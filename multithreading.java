class withdrawThread extends Thread{
    static int totalBalance =1000;
    int amount;

    withdrawThread(int amount){
        this.amount=amount;
    }
    
    public void run(){
        if (totalBalance>=amount) {
            System.out.println("money debited from account: "+ amount);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        totalBalance-=amount;
        System.out.println(" total balance - " + totalBalance );
        }
        else{
            System.out.println("insufficient balance");
        }

    }
}

class multithreading {
    public static void main(String[] args) throws InterruptedException {
        withdrawThread x= new withdrawThread(800);
        withdrawThread y = new withdrawThread(400);
        x.start();
        x.join();
        y.start();
    }
}
