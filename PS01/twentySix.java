import java.util.*;
public class twentySix {

    public static void checkNarcissistic(int num) {
        int sum=0;
        int count = String.valueOf(num).length();
        int original=num;
        int lastDigit;
       
        while (num>0) {
            lastDigit=(num%10);
            sum=sum+(int)Math.pow(lastDigit, count);
            num=num/10;
        }
        if(sum==original){
            System.out.println("Narcissistic number");
        }
        else{
            System.out.println("Not Narcissistic number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Narcissistic Number");
        int num=sc.nextInt();
        checkNarcissistic(num);
    }
}
