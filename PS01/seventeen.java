import java.util.Scanner;

public class seventeen{

    public static boolean checkArmstrong(int num){
        int dupl=num;
        int original=num;
        int count=0;
        while (dupl>0) {
            int lastDigit=dupl%10;
            count++;
            dupl=dupl/10;
        }
        int armstrong=0;
        while (num>0) {
            int lastDigit=num%10;
            armstrong=armstrong+(int)Math.pow(lastDigit, count);
            num=num/10;
        }
        if(armstrong==original){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printArmstronginRange(int range) {
        System.out.print("1"+" ");
        for(int i=10;i<=range;i++){
            if(checkArmstrong(i)){
                System.out.print(i + " ");
            }
        }       
       
    }
    public static void main(String[] args) {
       int range;
       System.out.println("Enter the range");
       Scanner sc=new Scanner(System.in);
       range=sc.nextInt();
       printArmstronginRange(range);
    }
}