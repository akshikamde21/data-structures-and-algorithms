//import sorting.InsertionSort; 

//import sorting.QuickSort;

//import sorting.SelectionSort;

//import sorting.MergeSort;

import sorting.BubbleSort;

public class SortingDemo {
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array: ");
        for(int i: arr){
            System.out.println(i + " ");
        }
        //InsertionSort.sort(arr);
        //QuickSort.sort(arr);
        //SelectionSort.sort(arr);
        //MergeSort.sort(arr);
        BubbleSort.sort(arr);
        System.out.println("Sorted Array: ");
        for(int i: arr){
            System.out.println(i + " ");
        }
    }
}
