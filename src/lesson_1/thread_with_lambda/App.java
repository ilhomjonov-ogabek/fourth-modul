package lesson_1.thread_with_lambda;

public class App {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName()+": "+"Hello");

    Runnable runnable = () -> {
      for (int i = 1; i <= 10 ; i++) {
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+": "+i);

      }
    };

    Thread thread = new Thread(runnable, "MyThread");
    thread.start();

    System.out.println(Thread.currentThread().getName()+": "+"bye");
  }

}
