package OOP.s6.task01.OCP;

public class Bus extends Vehicle{
    public Bus(int maxSpeed) {
        super(maxSpeed, "bus");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.5;
    }
}
