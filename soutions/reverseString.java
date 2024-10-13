import java.util.Scanner;

public class reverseString{

    public static void reverseStringss(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println("Reverse String is "+reverse);
        if(s.equals(reverse)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not plaindrome string");
        }
    }
    public static void main(String[] args) {
       String s;
       System.out.println("Enter the string");
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       reverseStringss(s);
    }
}