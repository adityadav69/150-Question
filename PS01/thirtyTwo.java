public class thirtyTwo {
    public static int median(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr[arr.length/2];

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 2, 1, 9, 87 };
        System.out.println("Median is "+median(arr));
    }
}
