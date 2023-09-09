public class SphereVolumeCalculator {
    public static double sphereVolume(double radius) {
        // Calculate the volume of the sphere using the formula
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public static void main(String[] args) {
        // Example call to the sphereVolume method
        double result = sphereVolume(2.0); // Returns 33.510321638291124
        System.out.println("The volume of the sphere is: " + result);
    }
}
