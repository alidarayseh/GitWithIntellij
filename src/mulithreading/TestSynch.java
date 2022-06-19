package mulithreading;

public class TestSynch {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account= new BankAccount(500);
        Thread t1=new Thread(new Worker(account));
        Thread t2=new Thread(new Worker(account));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(account.getBalance());

    }
}
