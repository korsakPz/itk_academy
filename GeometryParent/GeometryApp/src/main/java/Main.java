import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometryutils.GeometryHelper;
import threed.Cube;
import threed.Sphere;
import threed.ThreeDShape;


public class Main {


    public static void main(String[] args) {
        System.out.println("=== 2D FIGURES ===");
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);

        System.out.println("Circle: " + circle.getName());
        System.out.println("Area: " + GeometryHelper.round(circle.getArea(), 2));
        System.out.println("Perimeter: " + GeometryHelper.round(circle.getPerimeter(), 2));

        System.out.println("\nRectangle: " + rect.getName());
        System.out.println("Area: " + GeometryHelper.round(rect.getArea(), 2));
        System.out.println("Perimeter: " + GeometryHelper.round(rect.getPerimeter(), 2));

        System.out.println("\nIs circle larger than rect? " +
                GeometryHelper.isLargerArea(circle, rect));

        System.out.println("\n=== 3D FIGURES ===");
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(2);

        System.out.println("Cube: " + cube.getName());
        System.out.println("Volume: " + GeometryHelper.round(cube.getVolume(), 2));
        System.out.println("Surface: " + GeometryHelper.round(cube.getSurfaceArea(), 2));

        System.out.println("\nSphere: " + sphere.getName());
        System.out.println("Volume: " + GeometryHelper.round(sphere.getVolume(), 2));
        System.out.println("Surface: " + GeometryHelper.round(sphere.getSurfaceArea(), 2));
    }

}
