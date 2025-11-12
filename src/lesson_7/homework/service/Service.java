package lesson_7.homework.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lesson_7.homework.dto.CenterDTO;
import lesson_7.homework.dto.CourseDTO;
import lesson_7.homework.dto.LessonDTO;
import lesson_7.homework.dto.ModulDTO;
import lesson_7.homework.entity.Course;
import lesson_7.homework.entity.Lesson;
import lesson_7.homework.entity.Module;
import lesson_7.homework.entity.StudyCenter;
import lesson_7.homework.repository.Repository;
import lesson_7.homework.utils.Utils;

public class Service {
  Repository repository = new Repository();

  public void createCenter(CenterDTO centerDTO) {
    StudyCenter center = new StudyCenter(Utils.centerId(), centerDTO.name(), centerDTO.address(),LocalDate.now());
    repository.saveCenter(center);
  }

  public void getCenterList() {
    String[] list = repository.getCenterList();
    if (list.length > 3) {
      for (int i = 0; i < list.length; i += 4) {
        System.out.printf("id:%s name:%s adress:%s date:%s\n", list[i], list[i + 1], list[i + 2],
            list[i + 3]);
      }
    }else{
      System.out.println("Hali hech qanday study centerlar mavjud emas!");
    }
  }

  public void createCourse(CourseDTO dto) {
    Course course = new Course(Utils.courseId(),dto.centerId(),dto.name(),LocalDate.now());
    repository.saveCourse(course);
  }

  public void getCourseList(int centerId) {
    String[] list = repository.getCourseList();
    if (list.length > 3) {
      for (int i = 1; i < list.length; i += 4) {
        if(Integer.parseInt(list[i])==centerId) {
          System.out.printf("id:%s centerId:%s name:%s date:%s\n", list[i - 1], list[i], list[i + 1],
              list[i + 2]);
        }
      }
    }else{
      System.out.println("Hali hech qanday study centerda course mavjud emas!");
    }
  }

  public void createModul(ModulDTO dto) {
    Module modul = new Module(Utils.modulId(), dto.courseId(), dto.modulName(), LocalDateTime.now());
    repository.saveModul(modul);
  }

  public void getModulList(int courseId) {
    String[] list = repository.getModulList();
    if (list.length > 3) {
      for (int i = 1; i < list.length; i += 4) {
        if(Integer.parseInt(list[i])==courseId) {
          System.out.printf("id:%s courseId:%s name:%s date:%s\n", list[i - 1], list[i], list[i + 1],
              list[i + 2]);
        }
      }
    }else{
      System.out.println("Hali hech qanday courseda modullar mavjud emas!");
    }

  }

  public void createLesson(LessonDTO dto) {
    Lesson lesson = new Lesson(Utils.lessonId(), dto.modulId(), dto.name(), LocalDateTime.now());
    repository.saveLesson(lesson);
  }

  public void getLessonList(int modulId) {
    String[] list = repository.getLessonList();
    if (list.length > 3) {
      for (int i = 1; i < list.length; i += 4) {
        if(Integer.parseInt(list[i])==modulId) {
          System.out.printf("id:%s modulId:%s name:%s date:%s\n", list[i - 1], list[i], list[i + 1],
              list[i + 2]);
        }
      }
    }else{
      System.out.println("Hali hech qanday modulda lesson mavjud emas!");
    }

  }
}
