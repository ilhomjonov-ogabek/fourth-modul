package lesson_7.homework.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lesson_7.homework.entity.Course;
import lesson_7.homework.entity.Lesson;
import lesson_7.homework.entity.Module;
import lesson_7.homework.entity.StudyCenter;

public class Repository {

  public void saveCenter(StudyCenter center) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("src/lesson_7/homework/repository/save_center.txt", true));
      bufferedWriter.write(center.toString());
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public String[] getCenterList() {
    BufferedReader bufferedReader = null;
    List<String> list = new ArrayList<>();

    try {
      FileReader file = new FileReader("src/lesson_7/homework/repository/save_center.txt");
      bufferedReader = new BufferedReader(file);

      String s;
      while ((s = bufferedReader.readLine()) != null) {
        String[] parts = s.split("#");
        for (String part : parts) {
          list.add(part.trim());
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println("Fayl topilmadi: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("O‘qishda xatolik: " + e.getMessage());
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close();
      } catch (IOException e) {
        System.out.println("Yopishda xatolik: " + e.getMessage());
      }
    }

    String[] partsArray = list.toArray(new String[0]);


    return partsArray;
  }


  public String[] getCourseList() {
    BufferedReader bufferedReader = null;
    List<String> list = new ArrayList<>();

    try {
      FileReader file = new FileReader("src/lesson_7/homework/repository/save_course.txt");
      bufferedReader = new BufferedReader(file);

      String s;
      while ((s = bufferedReader.readLine()) != null) {
        String[] parts = s.split("#");
        for (String part : parts) {
          list.add(part.trim());
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }


    String[] partsArray = list.toArray(new String[0]);


    return partsArray;
  }

  public void saveCourse(Course course) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("src/lesson_7/homework/repository/save_course.txt", true));
      bufferedWriter.write(course.toString());
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public String[] getModulList() {
    BufferedReader bufferedReader = null;
    List<String> list = new ArrayList<>();

    try {
      FileReader file = new FileReader("src/lesson_7/homework/repository/save_modul.txt");
      bufferedReader = new BufferedReader(file);

      String s;
      while ((s = bufferedReader.readLine()) != null) {
        String[] parts = s.split("#");
        for (String part : parts) {
          list.add(part.trim());
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }


    String[] partsArray = list.toArray(new String[0]);


    return partsArray;
  }

  public void saveModul(Module modul) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("src/lesson_7/homework/repository/save_modul.txt", true));
      bufferedWriter.write(modul.toString());
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }

  public String[] getLessonList() {
    BufferedReader bufferedReader = null;
    List<String> list = new ArrayList<>();

    try {
      FileReader file = new FileReader("src/lesson_7/homework/repository/save_lesson.txt");
      bufferedReader = new BufferedReader(file);

      String s;
      while ((s = bufferedReader.readLine()) != null) {
        String[] parts = s.split("#");
        for (String part : parts) {
          list.add(part.trim());
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }


    String[] partsArray = list.toArray(new String[0]);


    return partsArray;

  }

  public void saveLesson(Lesson lesson) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("src/lesson_7/homework/repository/save_lesson.txt", true));
      bufferedWriter.write(lesson.toString());
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
