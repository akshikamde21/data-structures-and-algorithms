//import sorting.InsertionSort; 

import sorting.QuickSort;

public class SortingDemo {
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array: ");
        for(int i: arr){
            System.out.println(i + " ");
        }
        //InsertionSort.sort(arr);
        QuickSort.sort(arr);
        System.out.println("Sorted Array: ");
        for(int i: arr){
            System.out.println(i + " ");
        }
    }
}
