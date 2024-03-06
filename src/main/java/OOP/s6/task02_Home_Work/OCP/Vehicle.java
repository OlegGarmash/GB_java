package OOP.s6.task02_Home_Work.OCP;

public class Vehicle {
    private int maxSpeed;

    private String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double calculateMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }
}
