public class CircleAreaCalculator {
    public static double area(double radius) {
        // Calculate the area using the formula: π * radius^2
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }

    public static void main(String[] args) {
        // Example call to the area method
        double radius = 2.0;
        double result = area(radius);

        System.out.println("The area of the circle with radius " + radius + " is " + result);
    }
}
