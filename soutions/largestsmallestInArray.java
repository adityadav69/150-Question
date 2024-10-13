public class largestsmallestInArray {

    public static void FindLargestandSmallest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Number is "+smallest);
        System.out.println("Smallest Number is "+largest);
    }
    public static void main(String[] args) {
        int arr[]={2,4,2,5431,32,13};
        FindLargestandSmallest(arr);
    }
}
