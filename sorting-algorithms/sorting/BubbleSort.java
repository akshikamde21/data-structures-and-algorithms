package sorting;

public class BubbleSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<=n-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
