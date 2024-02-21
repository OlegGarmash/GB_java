package gb_Java.s2.task03;

/**
 * @author Oleg
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return результат
     * @apiNote Метод вычесления длину вектора
     */
    public double lenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vectorTwo
     * @return result
     * @apiNote метод, вычисляющий скалярное произведение
     */
    public double scalar(Vector vectorTwo) {
        return x * vectorTwo.getX() + y * vectorTwo.getY() + z * vectorTwo.getZ();
    }

    /**
     * @param vectorTwo
     * @return
     * @apiNote метод, вычисляющий векторное произведение с другим вектором
     */
    public Vector multiply(Vector vectorTwo) {
        return new Vector(
                y * vectorTwo.getZ() - z * vectorTwo.getY(),
                z * vectorTwo.getX() - x * vectorTwo.getZ(),
                x * vectorTwo.getY() - y * vectorTwo.getX()
        );
    }

    /**
     * @apiNote метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному
     * произведению векторов, деленному на произведение модулей (длин) векторов
     * @param vectorTwo
     * @return
     */
    public double cos(Vector vectorTwo) {
        return scalar(vectorTwo) / (lenght()*vectorTwo.lenght());
    }

    public Vector sum(Vector vectorTwo) {
        return new Vector(x + vectorTwo.getX(), y + vectorTwo.getY(), z + vectorTwo.getZ());
    }

    public Vector degree(Vector vectorTwo) {
        return new Vector(x - vectorTwo.getX(), y - vectorTwo.getY(), z - vectorTwo.getZ());
    }
}