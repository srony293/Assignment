public class BinaryConverter {
    public static void main(String[] args) {
        int number = 44;
        String binaryRepresentation = toBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
    }

    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
