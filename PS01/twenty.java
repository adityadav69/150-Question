import java.util.*;
public class twenty {

    public static void checkPerfectNumber(int num){
        int factorSum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                factorSum+=i;
            }
        }
        if(factorSum==num){
            System.out.println("Number is Perfect Number");
        }
        else{
            System.out.println("Number is not perfect Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        checkPerfectNumber(num);

    }
}
