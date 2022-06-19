package mulithreading;

public class MyThread1 implements Runnable {

    public MyThread1() {
    }

    String str;
    public MyThread1(String str) {
        this.str=str;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++)
        {
            System.out.println(str+" : "+i);
        }
    }
}
