public class countVowelAndString {
    
    public static void CountVandC(String s) {
        int length=s.length();
        int vowelCount=0;
        int consonentCount=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowelCount++;
            }
            else{
            consonentCount++;
            }
        }
        System.out.println("Vowel Count is "+vowelCount +" and consonent count is "+consonentCount);
    }
    public static void main(String[] args) {
        String s="abhishek";
        CountVandC(s);
    }
}
