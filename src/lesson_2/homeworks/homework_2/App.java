package lesson_2.homeworks.homework_2;


public class App {
  public static void main(String[] args) {
    MessageBox box = new MessageBox();

    Thread producer = new Thread(() -> {
      String[] messages = {"Salom"};
      for (String msg : messages) {
        box.put(msg);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });


    Thread consumer = new Thread(() -> {
      for (int i = 0; i < 3; i++) {
        String msg = box.get();
        try {
          Thread.sleep(1500);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });

    producer.start();
    consumer.start();
  }
}
