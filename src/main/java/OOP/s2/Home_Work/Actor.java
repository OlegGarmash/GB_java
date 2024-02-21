package OOP.s2.Home_Work;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    protected boolean inQueue;

    public Actor(String name) {
        this.name = name;
        inQueue = false;
        makeOrder = false;
        takeOrder = false;
    }

    public String getName() {
        return name;
    }
}