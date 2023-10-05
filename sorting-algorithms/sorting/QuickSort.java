//pick a pivot and place it in its correct place 
//how to place pivot in correct place? Need to consider two pointers i and j
//left side should be greater than pivot and right should be smaller than pivot
//find these two elements and swap
//smaller on the left and larger on the right

package sorting;

public class QuickSort {
    public static int partitionFunc(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){ //greater than pivot on left 
                i++; 
            }
            while(arr[j]>pivot && j>=low+1){ //smaller than pivot
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;        
        return j;
    }
    public static void qs(int[] arr, int low, int high){
        if(low<high){
            int pIndex = partitionFunc(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }

    public static void sort(int[] arr){
        qs(arr, 0, arr.length-1);
    }
}
