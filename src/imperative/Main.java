package imperative;

import Animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people =  List.of(

            new Person("John", MALE),
            new Person("BONESHAKER", MALE),
            new Person("maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );
        // Imperative approoach
    List<Person> femaleList = new ArrayList<>();
    for (Person person: people) {
        if (FEMALE.equals(Person.gender)){
            femaleList.add(person);
        }
    }

    for (Person female: femaleList){
        System.out.println(female);
    }
List<Person.Animal1> listOfAnimal = new ArrayList<>();

    listOfAnimal.add(new Person.Animal1("goat","molang",2) );
    listOfAnimal.add(new Person.Animal1("bird","fly_fly",1) );
    listOfAnimal.add(new Person.Animal1("house","hugeLove",1) );
    listOfAnimal.add(new Person.Animal1(" bee","honeyBee",1) );
    listOfAnimal.add(new Person.Animal1("com","bahum",1) );
    listOfAnimal.add(new Person.Animal1("com","bahum",1) );



        System.out.println("// decleareative");

      List<Person> female2 = people.stream().filter(person -> FEMALE.equals(person.gender))
              .collect(Collectors.toList());
    female2.forEach(System.out::println);
        System.out.println("dis is my animal class\n");

    List<Person.Animal1> animals = listOfAnimal.stream()
            .filter(animalsK -> animalsK.getId() == 1).toList();
    animals.forEach(System.out::println);

        System.out.println("\ndis is my animal class\n");

    }
    static class Person {
     private final String name;
     private static Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    static  class Animal1{
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String type;
            private String name;
            private int id;

        @Override
        public String toString() {
            return "Animal1{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        public Animal1(String type, String name, int id) {
            this.type = type;
            this.name = name;
            this.id = id;
        }
    }
        @Override
        public String toString() {
            return "Person{" +
                     "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
