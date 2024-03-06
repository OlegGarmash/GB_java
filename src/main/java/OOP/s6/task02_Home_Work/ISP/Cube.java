package OOP.s6.task02_Home_Work.ISP;

public class Cube implements Shape, Shape3D {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double perimetr() {
        return 12 * side;
    }

    @Override
    public double value() {
        return side * side * side;
    }
}
