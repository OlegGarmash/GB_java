package OOP.s6.task02_Home_Work.OCP;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.8;
    }
}
