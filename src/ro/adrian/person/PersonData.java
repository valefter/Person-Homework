package ro.adrian.person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonData {

  public static List<Person> createPersons() {
    return List.of(
        new Person("Alexandra", 23, EmploymentStatus.Student),
        new Person("Carlos", 23, EmploymentStatus.Hired),
        new Person("Lukas", 20, EmploymentStatus.Unemployed),
        new Person("Pierre", 25, EmploymentStatus.Hired),
        new Person("Marco", 21, EmploymentStatus.Student));
  }

  public static Map<Person, List<Hobby>> createHobbiesByPerson(
      List<Person> persons, List<Hobby> hobbies) {

    Map<Person, List<Hobby>> hobbiesByPerson = new HashMap<>();

    hobbiesByPerson.put(persons.get(0), List.of(hobbies.get(0), hobbies.get(1)));
    hobbiesByPerson.put(persons.get(1), List.of(hobbies.get(2)));
    hobbiesByPerson.put(persons.get(2), List.of(hobbies.get(3), hobbies.get(4)));
    hobbiesByPerson.put(persons.get(3), List.of(hobbies.get(4)));
    hobbiesByPerson.put(persons.get(4), List.of(hobbies.get(0), hobbies.get(3)));

    return hobbiesByPerson;
  }

  private static List<Address> createAddresses() {
    return List.of(
        new Address("Strada Mihai Viteazul", "Bucharest", Country.Romania),
        new Address("Calle de Alcala", "Madrid", Country.Spain),
        new Address("Unter den Linden", "Berlin", Country.Germany),
        new Address("Rue de Rivoli", "Paris", Country.France),
        new Address("Via Condotti", "Rome", Country.Italy));
  }

  public static List<Hobby> createHobbies() {
    List<Address> addresses = createAddresses();

    return List.of(
        new Hobby("Cycling", 3, List.of(addresses.get(0), addresses.get(2))),
        new Hobby("Swimming", 2, List.of(addresses.get(1))),
        new Hobby("Reading", 4, List.of(addresses.get(3))),
        new Hobby("Painting", 2, List.of(addresses.get(4))),
        new Hobby("Football", 3, List.of(addresses.get(0), addresses.get(1))));
  }
}
