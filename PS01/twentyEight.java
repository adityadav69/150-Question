import java.util.*;
public class twentyEight {
    public static void factorialSum(int num) {
        int fact=1;
        int factSum=0;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);;
        while (fact>0) {
            int lastDigit=fact%10;
            factSum+=lastDigit;
            fact=fact/10;
        }
        System.out.println("Factorial sum is "+factSum);
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        factorialSum(num);
    }
}
