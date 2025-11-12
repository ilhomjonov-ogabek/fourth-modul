package lesson_5;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    int n = Runtime.getRuntime().availableProcessors();

    ExecutorService executorService = Executors.newFixedThreadPool(n);

    Callable<String> callable1 = () ->{
      return "Hello";
    };

    Callable<String> callable2 = () ->{
      return "World";
    };

    List<Future<String>> futures = executorService.invokeAll(List.of(callable1, callable2));

    for (Future<String> future : futures) {
      System.out.println(future.get());
    }



  }

}
