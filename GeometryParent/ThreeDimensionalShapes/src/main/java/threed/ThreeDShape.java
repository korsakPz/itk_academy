package threed;

public abstract class ThreeDShape {

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public String getName() {
        return this.getClass().getSimpleName();
    }

}
