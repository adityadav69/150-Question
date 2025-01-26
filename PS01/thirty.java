public class thirty{

    public static int missing(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]!=arr[i]+1){
                return arr[i]+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9};
        System.out.println( missing(arr));
    }
}