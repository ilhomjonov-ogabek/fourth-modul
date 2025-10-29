package lesson_2.homeworks.homework_1;

public class Counter {
  private int count = 0;

  public synchronized int  increment() {
    count++;
    return count;
  }

}
