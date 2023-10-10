package sorting;

public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            //replace arr[i] with arr[mini] 
            //now mini is j
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
