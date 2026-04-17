package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestAFac {
    public static void main(String[] args) {


        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            {
                List<Future<Integer>> list = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    Fact task = new Fact(i);
                    list.add(service.submit(task));
                }
                if (service.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.printf("bahut hua .......");
                    service.shutdownNow();
                }
                for (Future<Integer> future : list) {
                    System.out.printf("\n rESULT IS : %d", future.get());
                }


            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}