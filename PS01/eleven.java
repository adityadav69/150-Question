public class eleven {

    public static int highestFactor(int a, int b) {
        int index = Math.min(a, b);
        for (int i = index; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int lowestCommon(int a, int b) {
        int hcf = highestFactor(a, b);
        int lcm = (a * b)/hcf;
        return lcm;

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        System.out.println(lowestCommon(a, b));
    }
}
