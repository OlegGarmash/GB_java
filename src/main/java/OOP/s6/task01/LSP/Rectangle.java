package OOP.s6.task01.LSP;

public class Rectangle extends QuadRangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return height * width;
    }
}
