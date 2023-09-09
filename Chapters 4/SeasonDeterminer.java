public class SeasonDeterminer {
    public static String season(int month, int day) {
        if ((month == 12 && day >= 16) || (month <= 2) || (month == 3 && day <= 15)) {
            return "winter";
        } else if ((month >= 3 && month <= 5) || (month == 6 && day <= 15)) {
            return "spring";
        } else if ((month >= 6 && month <= 8) || (month == 9 && day <= 15)) {
            return "summer";
        } else if ((month >= 9 && month <= 11) || (month == 12 && day <= 15)) {
            return "fall";
        } else {
            return "Invalid date"; // Handle invalid input
        }
    }

    public static void main(String[] args) {
        // Example calls to the season method
        String result1 = season(2, 1);   // Returns "winter"
        String result2 = season(5, 1);   // Returns "spring"
        String result3 = season(7, 1);   // Returns "summer"
        String result4 = season(11, 1);  // Returns "fall"
        String result5 = season(13, 1);  // Returns "Invalid date"

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    }
}
