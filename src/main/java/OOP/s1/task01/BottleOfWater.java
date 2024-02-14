package OOP.s1.task01;

public class BottleOfWater extends Product{
    private int volume;
    public BottleOfWater(String name, int cost) {
        super(name, cost);
    }

    public BottleOfWater(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

}
