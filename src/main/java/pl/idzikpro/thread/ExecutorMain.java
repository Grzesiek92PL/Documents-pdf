package pl.idzikpro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorMain {
    public static void main(String[] args) {
        //statyczna metoda fabrykująca
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Runnable runnable=()-> IntStream.rangeClosed(0,100)
                .forEach(i->System.out.println(i+" running "+MyThread.currentThread().getName()));
        executorService.submit(runnable);
        executorService.shutdown();
    }
}
