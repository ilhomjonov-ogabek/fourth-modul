package lesson_7.homework.controller;
import lesson_7.homework.dto.CenterDTO;
import lesson_7.homework.dto.CourseDTO;
import lesson_7.homework.dto.LessonDTO;
import lesson_7.homework.dto.ModulDTO;
import lesson_7.homework.service.Service;
import lesson_7.homework.utils.Utils;

public class MainController {
Service service = new Service();
  public void start() {
    while(true) {
      System.out.println("""
          1.Create Studycenter
          2.Studycenter list
          0.Exit
          """);
      switch (Utils.getInt("Choose one")){
        case 1-> creatCenter();
        case 2-> centerList();
        case 0-> {
          return;
        }
        default -> {
          System.out.println("Invalid choice");
        }
      }
    }
  }

  private void coursePage() {
    while(true) {
      System.out.println("""
          1.Coursega kirish
          0.Exit""");
      switch (Utils.getInt("Choose one")){
        case 1 -> course();
        case 0 -> {
          return;
        }
        default -> {
          System.out.println("Invalid choice");
        }
      }
    }

  }

  private void course() {
    int centerId=Utils.getInt("Enter center id:");
    while(true) {
      System.out.println("""
          1.Create Course
          2.Course list
          0.Exit
          """);
      switch (Utils.getInt("Choose one")){
        case 1-> creatCourse(centerId);
        case 2-> courseList(centerId);
        case 0-> {
          return;
        }
        default -> {
          System.out.println("Invalid choice");
        }
      }
    }

  }

  private void courseList(int centerId) {
    service.getCourseList(centerId);
    modul();
  }

  private void modul() {
    while(true) {
      System.out.println("""
          1.Modulga kirish
          0.Exit""");
      switch (Utils.getInt("Choose one")){
        case 1 -> modulPage();
        case 0-> {
          return;
        }
      }
    }
  }

  private void modulPage() {
    int courseId=Utils.getInt("Enter course id:");
    while(true) {
      System.out.println("""
          1.Modul yaratish
          2.Modullar listi
          0.Exit
      """);
      switch (Utils.getInt("Choose one")){
        case 1 -> createModul(courseId);
        case 2-> modulList(courseId);
        case 0-> {
          return;
        }
        default -> System.out.println("Invalid choice");
      }
    }
  }

  private void modulList(int courseId) {
    service.getModulList(courseId);
    lesson();
  }

  private void lesson() {
    while(true) {
      System.out.println("""
           1.Lessonga kirish
           0.Exit
          """);
      switch (Utils.getInt("Choose one")) {
        case 1-> lessonPage();
        case 0-> {
          return;
        }
        default -> System.out.println("Invalid choice");

      }
    }
  }

  private void lessonPage() {
    int  modulId=Utils.getInt("Enter modul id:");
    while (true) {
      System.out.println("""
          1.Create lesson
          2.Lesson listi
          0.Exit""");

      switch (Utils.getInt("Choose one")) {
        case 1 -> createLesson(modulId);
        case 2 -> lessonList(modulId);
        case 0-> {
          return;
        }
        default -> System.out.println("Invalid choice");
      }
    }
  }

  private void lessonList(int modulId) {
    service.getLessonList(modulId);
  }

  private void createLesson(int modulId) {
    String name = Utils.getText("Enter lesson name:");
    LessonDTO dto = new LessonDTO(modulId,name);
    service.createLesson(dto);
  }

  private void createModul(int courseId) {
    String name = Utils.getText("Enter modul name");
    ModulDTO dto = new ModulDTO(courseId, name);
    service.createModul(dto);
  }

  private void creatCourse(int  centerId) {
    String name = Utils.getText("Enter course name");
    CourseDTO dto = new CourseDTO(name,centerId);
    service.createCourse(dto);
  }

  private void centerList() {
    service.getCenterList();
    coursePage();
  }

  private void creatCenter() {
    String name = Utils.getText("Enter Studycenter's name: ");
    String address = Utils.getText("Enter Studycenter's address: ");
    CenterDTO centerDTO = new CenterDTO(name,address);
    service.createCenter(centerDTO);
  }


}
