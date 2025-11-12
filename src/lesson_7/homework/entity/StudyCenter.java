package lesson_7.homework.entity;

import java.time.LocalDate;

public class StudyCenter {
  private int id;
  private String name;
  private String address;
  private LocalDate createdDate;


  public StudyCenter(int id, String name, String address, LocalDate createdDate) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.createdDate = createdDate;
  }

  public int getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String toString() {
    return String.format("%d#%s#%s#%s", id, name, address, createdDate);
  }
}
