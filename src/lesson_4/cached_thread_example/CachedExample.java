package lesson_4.cached_thread_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedExample {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();

    for (int i = 1; i <= 100; i++) {
      final int a = i;
      Runnable runnable = () -> {
        System.out.println(a + " - Thread name: " + Thread.currentThread().getName());
      };
      executor.execute(runnable);
    }
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
    }

    System.out.println("-------------------------------------------");

    for (int i = 1; i <= 10; i++) {
      final int a = i;
      Runnable runnable = () -> {
        System.out.println(a + " - Thread name: " + Thread.currentThread().getName());
      };
      executor.execute(runnable);
    }




  }

}
