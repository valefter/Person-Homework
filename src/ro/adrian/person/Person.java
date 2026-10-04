package ro.adrian.person;

import java.util.Objects;

public class Person {
  private String name;
  private int age;
  private EmploymentStatus employmentStatus;

  public Person(String name, int age, EmploymentStatus employmentStatus) {
    this.name = name;
    this.age = age;
    this.employmentStatus = employmentStatus;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public EmploymentStatus getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(EmploymentStatus employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return String.format("%s -> is %d years old!", name, age);
  }
}
