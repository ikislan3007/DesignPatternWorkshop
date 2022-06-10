package factory;

import entities.Bicycle;
import singlenton.SantaClaus;

public class BicycleFactory implements ToyFactory {

    @Override
    public void createToy() {
        Bicycle bike=new Bicycle("bike","speed bike",2,2);
        SantaClaus.getInstance().addAToy((bike));

    }

}
