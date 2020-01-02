public class Lab3_1_2_Circle {
    double radius;

    public Lab3_1_2_Circle() {
        radius = 1.0;
    }

    public Lab3_1_2_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCrircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
