package pl.idzikpro.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureMergingComposeMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Long> idFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getUserId();
        });

        CompletableFuture<Void> future = idFuture
                .thenCompose(id -> CompletableFuture.supplyAsync((() -> getDiscount(id)))
                        .thenAccept(System.out::println));
        future.get();

    }

    public static Long getUserId() {
        return 144L;
    }

    public static Double getDiscount(Long id) {
        return 1.4;
    }
}
