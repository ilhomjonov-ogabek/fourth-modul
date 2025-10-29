package lesson_2.homeworks.homework_3;

public class App {

  public static void main(String[] args) throws InterruptedException {
    Warehouse warehouse = new Warehouse();
    Runnable runnable = () -> {
      warehouse.addProduct();
      System.out.println(warehouse.getProductCount2());
    };
    Thread thAdd = new Thread(runnable);

    Runnable runnable2 = () -> {
      warehouse.getProductCount();
      System.out.println(warehouse.getProductCount2());
    };
    Thread thAdd2 = new Thread(runnable2);
    thAdd2.start();
    thAdd.sleep(2000);
    thAdd.start();

  }

}
