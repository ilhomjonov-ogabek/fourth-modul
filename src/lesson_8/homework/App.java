package lesson_8.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String phone = sc.nextLine();
    Pattern pattern = Pattern.compile("^(//+998)((55|88|9[013459](//d{7}$)");
    Matcher matcher = pattern.matcher(phone);
    System.out.println(matcher.matches());
  }

}
