package lesson_4.callable_example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ExecutorService executorService = Executors.newFixedThreadPool(5);

    Callable<Boolean> callable = ()->{
      System.out.println("Checked");
      Thread.sleep(2000);
      return true;
    };

    Future<Boolean> future = executorService.submit(callable);
    System.out.println(future.get());

  }

}
