public class ten {
    public static int highestFactor(int a , int b){
        int index=Math.min(a, b);
        for(int i=index;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a=36;
        int b=60;
        System.out.println(highestFactor(a,b));
    }
}
