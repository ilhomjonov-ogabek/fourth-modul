package lesson_7.homework.entity;

import java.time.LocalDateTime;

public class Lesson {

  private int id;
  private int moduleId;
  private String name;
  private LocalDateTime createdDateTime;

  public Lesson(int id, int moduleId, String name, LocalDateTime createdDateTime) {
    this.id = id;
    this.moduleId = moduleId;
    this.name = name;
    this.createdDateTime = createdDateTime;
  }

  public int getId() {
    return id;
  }

  public int getModuleId() {
    return moduleId;
  }

  public void setModuleId(int moduleId) {
    this.moduleId = moduleId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  @Override
  public String toString() {
    return String.format("%d#%s#%s#%s", id,moduleId,name, createdDateTime);
  }
}
