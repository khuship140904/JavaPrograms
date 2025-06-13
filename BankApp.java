import java.util.ArrayList;
import java.util.Scanner;

class Transactions{
    String type;
    double amount;
        Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
        public String toString() {
        return type + ": Rs. " + amount;
    }

}

class Account{
    private  int accountNumber;
    private   String name;
    private   double balance;
    ArrayList<Transactions> transaction=new ArrayList<>();

    public Account(int accountNumber,String name,double balance) {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transaction.add(new Transactions("Deposit", amount));
            System.out.println("Deposited successfully!");
        }
    }
        public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.add(new Transactions("Withdrawal", amount));
            System.out.println("Withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


        public void viewTransactions() {
        if (transaction.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transactions t : transaction) {
                System.out.println(t);
            }
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    } 
    }
    class BankApp{
            static Scanner sc = new Scanner(System.in);
        static Account account;
        public static void main(String[] args) {
                    System.out.print("Enter account holder name: ");
                   String name = sc.nextLine();
            account=new Account(47267, name, 0);
         System.out.println("Account created successfully. Account Number: " );
    
            int choice;
            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.withdraw(with);
                        break;
                    case 3:
                        account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }
}