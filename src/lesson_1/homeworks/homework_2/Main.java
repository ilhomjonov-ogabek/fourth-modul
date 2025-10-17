package lesson_1.homeworks.homework_2;

public class Main {

  public static void main(String[] args) {
    Odd odd = new Odd();
    Double doubleNum = new Double();
    Thread t1 = new Thread(doubleNum);
    t1.start();
    odd.start();


  }

}


