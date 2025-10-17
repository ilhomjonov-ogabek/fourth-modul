package lesson_1.homeworks.homework_3;

public class Main {
  public static void main(String[] args) {
    System.out.println("Fayl yuklanmoqda...");
    Loading loading = new Loading();
    Thread loadingThread = new Thread(loading);
    loadingThread.start();
  }

}
