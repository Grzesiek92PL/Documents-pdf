package pl.idzikpro.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorMain {
    public static void main(String[] args) {
        Runnable worker1=()->{
            System.out.println("Worker 1 "+Thread.currentThread().getName());
            System.out.println("Going north");
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        };
        Runnable worker2=()->{
            System.out.println("Worker 2 "+Thread.currentThread().getName());
            System.out.println("Going right");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        };
        Runnable worker3=()->{
            System.out.println("Worker 3 "+Thread.currentThread().getName());
            System.out.println("Going back");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        };
        ScheduledExecutorService executorService1= Executors.newScheduledThreadPool(2);
        executorService1.schedule(worker1,5,TimeUnit.SECONDS);
        executorService1.shutdown();

        ScheduledExecutorService executorService2=Executors.newScheduledThreadPool(2);
        executorService2.scheduleAtFixedRate(worker2,0,3,TimeUnit.SECONDS);

    }
}
