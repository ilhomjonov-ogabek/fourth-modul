package lesson_5.project;

import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class ProjectCompletableFuture {
static Scanner scStr = new Scanner(System.in);
static Scanner scInt = new Scanner(System.in);
static UserRepository repository = new UserRepository();
static ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
  public static void main(String[] args) {

  }

  public static void registration() {
    System.out.println("Enter your full name: ");
    String fullName = scStr.nextLine();
    System.out.println("Enter your email: ");
    String email = scStr.nextLine();
    boolean res;
    do {
      System.out.println("Enter your username: ");
      String username = scStr.nextLine();
      res = checkUsername(username);
    } while (res);

    System.out.println("Enter your password: ");
    String password = scStr.nextLine();
  }

  private static boolean checkUsername(String username) {
    CompletableFuture<Boolean> future = CompletableFuture.supplyAsync(() -> {
      Optional<UserEntity> user = repository.getUserByUsername(username);
      return user.isPresent();
    }, executor);

    Boolean res = false;
    try {
      res = future.get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    return res;
  }
}
