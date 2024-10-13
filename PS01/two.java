import java.util.Scanner;

public class two{

    public static boolean checkPrime(int n){
        if(n==2){
            return true;
        }
        else{

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
    }
        return true;
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n=sc.nextInt();
        
        if(checkPrime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("not Prime number");
        }
    } 
}