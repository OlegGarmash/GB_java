package OOP.s6.task01.LSP;

public class Square extends QuadRangle {
    private int len;

    public Square(int len) {
        this.len = len;
    }

    @Override
    public int area() {
        return len * len;
    }
}
