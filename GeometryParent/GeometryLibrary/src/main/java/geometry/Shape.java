package geometry;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
