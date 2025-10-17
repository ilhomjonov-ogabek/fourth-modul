package lesson_1;

public class Main {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable);
    myThread.start();
    thread.start();

    System.out.println("Hello");

  }

}
