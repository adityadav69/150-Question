import java.util.*;
public class twentyTwo {
    public static void OddSumInRange(int range) {
        int OddSum=0;
        for(int i=1;i<=range;i++){
            if(i%2!=0){
                OddSum+=i;
            }
        }
        System.out.println("Odd sum in range is "+OddSum);
    }
    public static void main(String[] args) {
        int range;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to find the sum of Odd Number");
        range=sc.nextInt();
        OddSumInRange(range);
    }
}
