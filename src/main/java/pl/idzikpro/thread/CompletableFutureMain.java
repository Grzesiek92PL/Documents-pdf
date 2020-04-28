package pl.idzikpro.thread;

import java.util.concurrent.*;

public class CompletableFutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        System.out.println(Thread.currentThread().getName());

        //case - CompletableFuture getting result with blocker
        CompletableFuture<Integer> integer=CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 44;
        });
        //blocker
        System.out.println(integer.get());


        //case - CompletableFuture running thread in executor
        CompletableFuture.runAsync(
                () -> System.out.println(Thread.currentThread().getName()), executor
        );

        //case - CompletableFuture running in executor however getting result with blocker
        CompletableFuture<Integer> integer2=CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 44;
        },executor);
        //blocker
        System.out.println(integer2.get());


        //case - CompletableFuture running in executor getting result without blocker
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 44;
        }, executor).exceptionally(exception -> {
            System.out.println("Error");
            return 2;
        })
                .thenApply(r -> {
                    System.out.println(Thread.currentThread().getName());
                    return r * 3;
                })
                .thenAccept(r -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(r);
                });


        executor.shutdown();
    }
}
