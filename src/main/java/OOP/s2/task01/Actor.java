package OOP.s2.task01;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public Actor(String name) {
        this.name = name;
        makeOrder = false;
        takeOrder = false;
    }

    public String getName(){
        return name;
    }
}
