public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume = getBaseArea(radius) * height + 2 * getPerimeter(radius);
        return volume;
    }
    public static double getBaseArea(int radius){
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
    public static double getPerimeter(int radius){
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
}
