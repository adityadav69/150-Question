public class eight {

    public static int factorial(int n){
        int fact=1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(factorial(n));
    }
}
