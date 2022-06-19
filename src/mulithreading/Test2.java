package mulithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {

    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();

        MyThread1 t1=new MyThread1("t1");
        MyThread1 t2=new MyThread1("t2");
        MyThread1 t3=new MyThread1("t3");
        MyThread1 t4=new MyThread1("t4");
        MyThread1 t5=new MyThread1("t5");


        es.submit(t1);
        es.submit(t2);
        es.submit(t3);
        es.submit(t4);
        es.submit(t5);
        es.shutdown();





    }



}
