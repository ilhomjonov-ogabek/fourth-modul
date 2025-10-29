package lesson_3.atomic_classes;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicMain {

  public static void main(String[] args) throws InterruptedException {
    AtomicLong counter = new AtomicLong();
    for (int i = 0; i < 1000; i++) {
      new Thread(() -> {
        System.out.println(counter.incrementAndGet());
        try{
          TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }).start();
    }

    for (int i = 0; i < 1000; i++) {
      new Thread(() -> {
        System.out.println(counter.incrementAndGet());
        try{
          TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }).start();
    }

    Thread.sleep(500);

    counter.addAndGet(500);

    System.out.println(counter.get());


  }

}
