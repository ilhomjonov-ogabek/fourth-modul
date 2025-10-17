package lesson_1.homeworks.homework_1;

public class Main {

  public static void main(String[] args) {
    Runner runner = new Runner();
    Swimmer swimmer = new Swimmer();
    Thread swimmerThread = new Thread(swimmer);
    runner.start();
    swimmerThread.start();

    System.out.println("Hello");
  }

}
