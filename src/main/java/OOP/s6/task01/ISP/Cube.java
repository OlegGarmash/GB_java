package OOP.s6.task01.ISP;

public class Cube implements Shape, Shape3D{
    private int len;

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double perimetr() {
        return 12 * len;
    }

    @Override
    public double value() {
        return len * len * len;
    }
}
