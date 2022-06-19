package mulithreading;


public class BankAccount {

    private  double balance   ;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void  deposit(int amount )
    {
        balance=balance+amount;
    }
}
