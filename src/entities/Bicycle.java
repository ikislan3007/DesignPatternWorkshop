package entities;

public class Bicycle extends Toy {
    private int gear;
    private int speed;

    public Bicycle(String name, String description, int gear, int speed) {
        super(name, description);
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "entities.Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
