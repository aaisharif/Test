//2 - Model a car garage using classes.
// Use your imagination and think about the properties and behaviours.
// Note that you might want to create 2 classes.
// One for Garage and another for Car.
// The garage holds a list/array of cars....



public class Car {
    String make;
    String colour;
    int year;
    boolean selfDriveMode;

    public Car(String make2, String colour, int year) {
        make = make2;
        this.colour = colour;
        this.year = year;
        this.selfDriveMode = false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //behaviours and setters/getters
    public void setSelfDriveMode(boolean value){
        this.selfDriveMode = value;
    }

    public boolean getSetDriveMode(){
        return this.selfDriveMode;
    }

    public void lockDoors(){
        System.out.println("Doors are locked!");
    }

    public void unlockDoors(){
        System.out.println("Doors are unlocked!");
    }


}

