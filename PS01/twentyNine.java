public class twentyNine {
    public static void ReverseString(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void findMostPalindrome(String s) {   //  "aditya" 
        String du;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                du=""+s.charAt(i)+s.charAt(j);
                 System.out.println(du);
            }
        }
    }
    public static void main(String[] args) {
        String s="aditya";
        // ReverseString(s);
        findMostPalindrome(s);
    }
}


