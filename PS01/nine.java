public class nine {
    public static int ReturnSum(int n){
        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
            sum+=lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(ReturnSum(321323));
    }
}
