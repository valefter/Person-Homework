package ro.adrian.person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2) {
    int result = Integer.compare(p1.getAge(), p2.getAge());

    if (result == 0) {
      result = p1.getName().compareTo(p2.getName());
    }
    return result;
  }
}
