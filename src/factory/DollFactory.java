package factory;

import entities.Doll;
import singlenton.SantaClaus;

public class DollFactory implements ToyFactory {

    @Override
    public void createToy() {
        Doll doll = new Doll("Barbie", "Maria");
        SantaClaus.getInstance().addAToy((doll));


    }
}
