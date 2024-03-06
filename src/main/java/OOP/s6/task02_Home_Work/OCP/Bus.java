package OOP.s6.task02_Home_Work.OCP;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "bus");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.5;
    }
}
