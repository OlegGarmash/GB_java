package gb_Java.s3.task03;

public class Cube {
    private Integer lenght;
    private String color;
    private String material;

    public Cube(Integer lenght, String color, String material) {
        this.lenght = lenght;
        this.color = color;
        this.material = material;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "lenght=" + lenght +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public int getVolume() {
        return (int) Math.pow(lenght, 3);
    }
}
