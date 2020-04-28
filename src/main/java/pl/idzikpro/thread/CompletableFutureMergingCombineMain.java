package pl.idzikpro.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureMergingCombineMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<Long> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100L;
        });

        CompletableFuture<Long> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 200L;
        });

        CompletableFuture<Long> future = future1.thenCombine(future2, (aLong, aLong2) ->
                aLong * aLong2);
        Long result = future.get();
        System.out.println(result);
    }
}
