package mulithreading;

public class Test {

    public static void main(String[] args) throws InterruptedException {



        Thread t1= new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread1());


        System.out.println("Before starting threads .....");
        t1.start();
        t2.start();
        t2.join();


System.out.println("After starting threads .....");


    }


}
