package lesson_7.homework.utils;

import java.util.Scanner;
import lesson_7.homework.repository.Repository;

public class Utils {
 static Scanner scStr = new Scanner(System.in);
 static Scanner scInt = new Scanner(System.in);

  public static String getText( String text ) {
    System.out.print(text + ": ");
    return scStr.nextLine();
  }


  public static int getInt(String text) {
    System.out.printf("%s: ", text);
    return scInt.nextInt();
  }

  public static int centerId(){
    Repository repository = new Repository();
    String[] list = repository.getCenterList();
    return (list.length+1)/4;
  }


  public static int courseId(){
    Repository repository = new Repository();
    String[] list = repository.getCourseList();
    return (list.length+1)/4;
  }
  public static int modulId(){
    Repository repository = new Repository();
    String[] list = repository.getModulList();
    return (list.length+1)/4;
  }
  public static int lessonId(){
    Repository repository = new Repository();
    String[] list = repository.getLessonList();
    return (list.length+1)/4;
  }

}
