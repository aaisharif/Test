import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Person personOne;
        personOne = new Person("Fatma",
              "Sadiq",
              Gender.FEMALE,
                LocalDate.of(1997, 05, 17));

        Person personTwo = new Person("Ace",         "Ventura",         Gender.MALE,
             LocalDate.of(1985, 02, 11));

        Car bmw = new Car("bmw", "blue", 2020);
        System.out.println(bmw.getColour());
        bmw.lockDoors();
        System.out.println();


        Garage garage = new Garage(2, true );
        garage.addCarIncCrArray(bmw);


    }


}
