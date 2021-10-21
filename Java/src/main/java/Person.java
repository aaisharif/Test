//1 - Create a class that models a person with the following characteristics.
//- firstName
//- lastName
//- gender
//- dateOfBirth
//
//then create 2 objects. one male and one female using a constructor that has all properties.

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    Gender gender;
    LocalDate dateOfBirth;

    public Person(String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }


}


