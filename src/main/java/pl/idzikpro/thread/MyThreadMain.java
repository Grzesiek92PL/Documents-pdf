package pl.idzikpro.thread;

import java.util.stream.IntStream;

public class MyThreadMain {
    public static void main(String[] args) {
        System.out.println("-----Main thread of application-----"+Thread.currentThread().getName());
        Thread thread1=new MyThread("Thread number 1");
        Thread thread2=new MyThread("Thread number 2");

        Runnable runnable1=new MyRunnable();
        Thread thread3=new Thread(runnable1,"Thread number 3");
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                IntStream.rangeClosed(0,100)
                        .forEach(i->System.out.println(i+" running "+MyThread.currentThread().getName()));
            }
        };
        Thread thread4=new Thread(runnable2,"Thread number 4");
        Thread thread5=new Thread(()->IntStream.rangeClosed(0,100)
                .forEach(i->System.out.println(i+" running "+MyThread.currentThread().getName())),"Thread number 5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread5.start();
    }
}
