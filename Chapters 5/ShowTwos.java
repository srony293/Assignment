public class ShowTwos {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    public static void showTwos(int n) {
        System.out.print(n + " = ");

        while (n % 2 == 0) {
            System.out.print("2 * ");
            n /= 2;
        }

        System.out.println(n);
    }
}
