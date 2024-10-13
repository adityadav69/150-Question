import java.util.*;
public class twentySeven {

    public static void printPattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();
        printPattern(rows);
    }
}
