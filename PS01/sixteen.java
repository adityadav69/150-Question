public class sixteen {

    public static void ArraySum(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array is "+sum);
    }
    public static void main(String[] args) {
        int arr[]={2,43,53,24,1};
        ArraySum(arr);
    }
}
