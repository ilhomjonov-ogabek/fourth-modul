package lesson_2.homeworks.homework_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MessageBox {

  private String message;
  private boolean empty = true;

  private final Lock lock = new ReentrantLock();
  private final Condition notEmpty = lock.newCondition();
  private final Condition notFull = lock.newCondition();


  public void put(String msg) {
    lock.lock();
    try {
      while (!empty) {
        notFull.await();
      }
      message = msg;
      empty = false;
      System.out.println("Producer qo‘ydi: " + msg);
      notEmpty.signal();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock();
    }
  }

  public String get() {
    lock.lock();
    try {
      while (empty) {
        notEmpty.await();
      }
      String msg = message;
      empty = true;
      System.out.println("Consumer oldi: " + msg);
      notFull.signal();
      return msg;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return null;
    } finally {
      lock.unlock();
    }
  }
}
