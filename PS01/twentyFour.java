import java.util.*;
public class twentyFour {

    public static boolean checkPrime(int num){
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void PrimeInRange(int range){
        for(int i=2;i<range;i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to print Prime Number");
        int range=sc.nextInt();
        PrimeInRange(range);
    }
}