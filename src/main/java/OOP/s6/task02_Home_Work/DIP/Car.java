package OOP.s6.task02_Home_Work.DIP;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        engine.start();
    }
}
