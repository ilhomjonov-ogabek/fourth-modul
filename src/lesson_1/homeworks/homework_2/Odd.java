package lesson_1.homeworks.homework_2;

public class Odd extends Thread {

  @Override
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 1) {
        System.out.println(Thread.currentThread().getName()+": "+i);
      }
    }
  }
}
