package lesson_1.homeworks.homework_1;

public class Swimmer implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <=5 ; i++) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println(Thread.currentThread().getName()+"Swimming");
    }
  }
}
