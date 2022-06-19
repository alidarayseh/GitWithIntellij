package mulithreading;

public class Worker implements Runnable{

    private BankAccount account;
    public Worker(BankAccount account)
    {
        this.account=account;
    }

    public void run(){

        for(int i=0;i<10000;i++)
            account.deposit(1);
    }

}
