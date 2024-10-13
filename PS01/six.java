public class six {
    public static void palindrome(int n){
        int original=n;
        int reverse=0;
        while (n>0) {
            int lastDigit=(n%10);
            reverse=(reverse*10)+lastDigit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    public static void palindromeString(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not plaindrome string");
        }
    }
    public static void main(String[] args) {
        int n=31313134;
        palindrome(n);
        String s="ada";
        palindromeString(s);

    }
}

