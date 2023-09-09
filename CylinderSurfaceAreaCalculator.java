public class CylinderSurfaceAreaCalculator {
    public static double cylinderSurfaceArea(double radius, double height) {
        // Calculate the surface area of the cylinder using the formula
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        return surfaceArea;
    }

    public static void main(String[] args) {
        // Example call to the cylinderSurfaceArea method
        double result = cylinderSurfaceArea(3.0, 4.5); // Returns 141.3716694115407
        System.out.println("The surface area of the cylinder is: " + result);
    }
}
