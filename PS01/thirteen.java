import java.util.Scanner;

public class thirteen{

    public static void reverseStringss(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println("Reverse String is "+reverse);
       
    }
    public static void main(String[] args) {
       String s;
       System.out.println("Enter the string");
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       reverseStringss(s);
    }
}