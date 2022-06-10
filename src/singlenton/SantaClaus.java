package singlenton;

import entities.Toy;
import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    private static SantaClaus instance;
    private final List<Toy> toys;

    public SantaClaus() {
        this.toys = new ArrayList<>();
    }

    public void addAToy(Toy toy) {
        if (toy != null) {

            toys.add(toy);
        }
    }

    public void showAllToys() {
        for (Toy toy : toys) {
            System.out.println(toy.toString() + ", ");
        }
        System.out.println("The number of toys is: " + toys.size());
    }


    public static SantaClaus getInstance() {
        if (instance == null)
            instance = new SantaClaus();
        return instance;
    }

    public static void setInstance(SantaClaus instance) {
        SantaClaus.instance = instance;
    }

    public String giveMeToy(String toyName) {
        return toyName;
    }


}

