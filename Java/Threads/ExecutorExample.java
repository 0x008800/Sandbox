import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();// newSingleThreadPool newFixedThreadPool
        for (int i = 0; i < 100; i++)
            executorService.execute(() -> {
            while (true){
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            }
        });
        executorService.shutdown();
    }
}
