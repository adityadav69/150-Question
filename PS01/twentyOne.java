import java.util.*;
public class twentyOne {
    public static void EvenSumInRange(int range) {
        int evenSum=0;
        for(int i=2;i<=range;i++){
            if(i%2==0){
                evenSum+=i;
            }
        }
        System.out.println("Even sum in range is "+evenSum);
    }
    public static void main(String[] args) {
        int range;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to find the sum of Even Number");
        range=sc.nextInt();
        EvenSumInRange(range);
    }
}
