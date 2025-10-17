package lesson_1.project_with_thread;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello");


    new Thread(() -> {
      for (int i = 1; i <=10 ; i++) {
        System.out.println(i);
      }
    } ,"Thread ONE").start();

  }

}
