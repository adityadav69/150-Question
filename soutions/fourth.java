public class fourth {

    public static void checkArmstrong(int num) {
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
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
    public static void main(String[] args) {
        checkArmstrong(153);
    }
}
