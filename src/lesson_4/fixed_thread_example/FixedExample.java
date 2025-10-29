package lesson_4.fixed_thread_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedExample {

  public static void main(String[] args) {

    ExecutorService executor = Executors.newFixedThreadPool(10);


    for (int i = 1; i <= 100; i++) {
      final int a =i;
      Runnable runnable = () ->{
        System.out.println(a+" - Thread name: "+Thread.currentThread().getName());
      };
      executor.execute(runnable);
    }
    executor.shutdown();



  }

}
