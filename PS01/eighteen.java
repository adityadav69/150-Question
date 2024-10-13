import java.util.*;
public class eighteen {

    public static void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+ i +"="+num*i);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print multliplication Table");
        num=sc.nextInt();
        printTable(num);
    }
}
