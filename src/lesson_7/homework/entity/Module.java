package lesson_7.homework.entity;

import java.time.LocalDateTime;

public class Module {

  private int id;
  private int courseId;
  private String name;
  private LocalDateTime createdDateTime;

  public Module(int id, int courseId, String name, LocalDateTime createdDate) {
    this.id = id;
    this.courseId = courseId;
    this.name = name;
    this.createdDateTime = createdDate;
  }

  public int getId() {
    return id;
  }


  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreatedDate() {
    return createdDateTime;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDateTime = createdDate;
  }

  @Override
  public String toString() {
    return String.format("%d#%s#%s#%s", id,courseId,name, createdDateTime);
  }

}
