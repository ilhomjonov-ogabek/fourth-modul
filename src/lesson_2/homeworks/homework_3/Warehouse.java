package lesson_2.homeworks.homework_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Warehouse {
  private  int productCount = 0;
  Lock lock = new ReentrantLock();
  Condition condition = lock.newCondition();

  public  void addProduct() {
    lock.lock();
   productCount++;
   condition.signalAll();
   lock.unlock();
  }

  public  void getProductCount() {
    lock.lock();
    while (productCount == 0) {
      try {
        condition.await();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    productCount--;
    lock.unlock();
  }

  public int getProductCount2() {
    return productCount;
  }
}
