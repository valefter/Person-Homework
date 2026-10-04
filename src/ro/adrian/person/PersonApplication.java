package ro.adrian.person;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonApplication {

  public static void run() {
    showPersonsSortedByAgeAndName();
    showPersonHobbies();
  }

  private static void showPersonsSortedByAgeAndName() {
    List<Person> persons = PersonData.createPersons();

    TreeSet<Person> personsComparedByAge = new TreeSet<>(new PersonAgeComparator());
    TreeSet<Person> personsComparedByName = new TreeSet<>(new PersonNameComparator());

    personsComparedByAge.addAll(persons);
    personsComparedByName.addAll(persons);

    System.out.println("Persons compared by age:");
    personsComparedByAge.forEach(System.out::println);
    System.out.println("---------------------------------");
    System.out.println("Persons compared by name:");
    personsComparedByName.forEach(System.out::println);
  }

  private static void showPersonHobbies() {
    List<Person> persons = PersonData.createPersons();
    List<Hobby> hobbies = PersonData.createHobbies();

    Map<Person, List<Hobby>> hobbiesByPerson = PersonData.createHobbiesByPerson(persons, hobbies);

    System.out.println("---------------------------------");
    System.out.println("Hobbies for the selected person:");

    Person selectedPerson = persons.getFirst();
    List<Hobby> personHobbies = hobbiesByPerson.get(selectedPerson);

    System.out.println(selectedPerson.getName() + ":");

    personHobbies.forEach(
        hobby -> {
          String countries =
              hobby.getAddresses().stream()
                  .map(address -> String.valueOf(address.getCountry()))
                  .collect(Collectors.joining(", "));

          System.out.println(" " + hobby.getName() + " -> " + countries);
        });
  }
}
