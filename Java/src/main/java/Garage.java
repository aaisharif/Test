import java.util.ArrayList;
public class Garage {

    ArrayList carArray;
    int numberOfWindows;
    boolean isItClean;

    public Garage (int numberOfWindows, boolean isItCLean){
        this.numberOfWindows = numberOfWindows;
        this.isItClean = isItCLean;
        carArray = new ArrayList();
    }

    public ArrayList getCarArray() {
        return carArray;
    }

    public void addCarIncCrArray(Car c){
        carArray.add(c);
        System.out.println("car added");
    }
}
