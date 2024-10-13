// public class palindrom {
//     public static void palindrome(int n){
//         int original=n;
//         int reverse=0;
//         while (n>0) {
//             int lastDigit=(n%10);
//             reverse=(reverse*10)+lastDigit;
//             n=n/10;
//         }
//         if(original==reverse){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not palindrome");
//         }
//     }
//     public static void main(String[] args) {
//         int n=31313134;
//         palindrome(n);

//     }
// }


public class palindrom {
    public static void palindrome(String s){
        String original=s;
        String duplcate=new StringBuilder(original).reverse().toString();
        if(original.equals(duplcate)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        String s="AdA";
        palindrome(s);

    }
}
