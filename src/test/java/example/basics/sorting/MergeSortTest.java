package example.basics.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class MergeSortTest {

    @Test
    public void testMergeSort(){
        int[] arr = new int[]{2,435534,634,734,5,2};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private int[] mergeSort(int[] arr) {
        return mergeSort(arr,0,arr.length-1);
    }

    private int[] mergeSort(int[] arr, int left, int right) {

        if(left<right){
            int mid =left+ (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
        return arr;
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // Calculate sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}
