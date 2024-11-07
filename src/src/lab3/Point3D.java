package lab3;

public class Point3D extends Point {
    private final double z; // Координата Z

    public Point3D(double x, double y, double z) {
        super(x, y); // Вызов конструктора родительского класса
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + z + "}"; // Переопределенное текстовое представление
    }

    public double getZ() {
        return z;
    }
}