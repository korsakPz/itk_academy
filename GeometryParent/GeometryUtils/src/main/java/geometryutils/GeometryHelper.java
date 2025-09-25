package geometryutils;

import geometry.Shape;


public class GeometryHelper {


    public static boolean isLargerArea(Shape a, Shape b) {
        return a.getArea() > b.getArea();
    }

    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}
