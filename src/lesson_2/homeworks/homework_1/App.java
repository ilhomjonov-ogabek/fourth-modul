package lesson_2.homeworks.homework_1;

public class App {

  public static void main(String[] args) {
    Counter counter = new Counter();

    for (int i = 1; i <= 2 ; i++) {
      Runnable runnnable = () -> {
        for (int j = 1; j <= 500; j++) {
          System.out.println(counter.increment());
        }
      };
      Thread thread = new Thread(runnnable);
      thread.start();

    }


  }

}
