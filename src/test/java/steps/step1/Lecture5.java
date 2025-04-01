package steps.step1;

import java.util.Arrays;
import java.util.List;

public class Lecture5 {
    public static void main(String[] args) {
        //printByRecursion("Hi",5);
        //print1ToNByRecursion(1,5);
        //System.out.println(getSumByRecursion(1,5));
        //int[] arr = new int[]{1,2,3,4,5};
        //reverseArrByRecursion(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        Long start1 = System.currentTimeMillis();
        System.out.println(nThFibonnaci(45));
        System.out.println(System.currentTimeMillis()-start1);

    }

    private static int nThFibonnaci(int i) {
        if(i==1||i==2) return 1;
        return nThFibonnaci(i-1)+nThFibonnaci(i-2);
    }


    private static void reverseArrByRecursion(int[] arr, int i, int i1) {
        {
            if(i>=i1) return;
            int temp = arr[i];
            arr[i] = arr[i1];
            arr[i1] = temp;
            reverseArrByRecursion(arr,i+1,i1-1);
        }
    }

    private static int getSumByRecursion(int i, int i1) {
        if(i>i1) return 0;
        return i+getSumByRecursion(i+1,i1);
    }

    private static void print1ToNByRecursion(int i, int i1) {
        if(i>i1) return;
        System.out.println(i);
        print1ToNByRecursion(i+1,i1);
    }

    private static void printByRecursion(String hi, int i) {
        if(i==0) return;
        System.out.println(hi);
        printByRecursion(hi,i-1);
    }
}
