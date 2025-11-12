package lesson_7.homework.entity;

import java.time.LocalDate;

public class Course {

  private int  id;
  private int studyCenterId;
  private String name;
  private LocalDate createdDate;

  public Course(int id, int studyCenterId, String name, LocalDate createdDate) {
    this.id = id;
    this.studyCenterId = studyCenterId;
    this.name = name;
    this.createdDate = createdDate;
  }

  public int getId() {
    return id;
  }


  public int getStudyCenterId() {
    return studyCenterId;
  }

  public void setStudyCenterId(int studyCenterId) {
    this.studyCenterId = studyCenterId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String toString() {
    return String.format("%d#%s#%s#%s", id,studyCenterId,name, createdDate);
  }
}
