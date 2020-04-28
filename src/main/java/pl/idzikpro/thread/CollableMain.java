package pl.idzikpro.thread;

import java.util.concurrent.*;

public class CollableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> thread = () -> {
            TimeUnit.SECONDS.sleep(5);
            return 44;
        };
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> result = executor.submit(thread);
        executor.shutdown();
        System.out.println("Wynik " + result.get());
    }
}
