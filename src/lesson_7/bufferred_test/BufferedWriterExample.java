package lesson_7.bufferred_test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

  public static void main(String[] args) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("src/lesson_7/folder/hello.txt", true));
      bufferedWriter.write("hello");
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }


  }

}
