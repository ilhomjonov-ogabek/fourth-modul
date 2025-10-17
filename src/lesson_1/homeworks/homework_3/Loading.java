package lesson_1.homeworks.homework_3;

public class Loading implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("""
          *************
          #############""");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

  }
}
