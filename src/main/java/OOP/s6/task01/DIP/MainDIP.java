package OOP.s6.task01.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Car car = new Car(new DiselEngine());
        car.start();
        car = new Car(new PertolEngine());
        car.start();
    }
}