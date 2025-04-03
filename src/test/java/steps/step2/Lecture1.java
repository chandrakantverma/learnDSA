package steps.step2;

import java.util.Arrays;

public class Lecture1 {
    public static void main(String[] args) {
        int[] arr = {1,2,45,43,2,52,67,453};

        Long start = System.currentTimeMillis();
        selectionSort(arr);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 2, 45, 43, 2, 52, 67, 453};
        start = System.currentTimeMillis();
        bubbleSort(arr);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 2, 45, 43, 2, 52, 67, 453};
        start = System.currentTimeMillis();
        insertionSort(arr);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
