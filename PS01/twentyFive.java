import java.util.*;
public class twentyFive {

    public static void DigitCount(int num){
        int count=0;
        while (num>0) {
            num=num/10;
            count++;
        }
        System.out.println("Digit Count is "+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count the digit");
        int num=sc.nextInt();
        DigitCount(num);
    }
}
