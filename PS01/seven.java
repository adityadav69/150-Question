import java.util.Scanner;

    
public class seven {
    public static void printStar(int rows){
        for(int i=0;i<rows;i++){

            for(int k=1;k<=rows-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the line");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        printStar(rows);
    }
}
