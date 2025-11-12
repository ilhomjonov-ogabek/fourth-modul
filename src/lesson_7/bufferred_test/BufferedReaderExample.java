package lesson_7.bufferred_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

  public static void main(String[] args) {
    BufferedReader bufferedReader = null;
    try {
      FileReader file = new FileReader("src/lesson_7/folder/hello.txt");
      bufferedReader = new BufferedReader(file);
      String s = bufferedReader.readLine();
      while (s != null) {
        System.out.println(s);
        s = bufferedReader.readLine();
      }


    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        bufferedReader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

}
