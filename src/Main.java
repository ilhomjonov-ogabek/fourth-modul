import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) throws InterruptedException {
    Vector<Integer> list = new Vector<>();

    for (int i = 0; i < 1000; i++) {
      final int num = i;

      new Thread(() -> {
        list.add(num);

        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }).start();

    }

    for (int i = 1000; i < 2000; i++) {
      final int num = i;

      new Thread(() -> {
        list.add(num);

        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }).start();

    }
    
    Thread.sleep(2000);
    System.out.println("Result: " + list.size());


  }
}