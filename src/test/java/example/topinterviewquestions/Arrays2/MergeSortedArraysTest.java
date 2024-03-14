package example.topinterviewquestions.Arrays2;

import example.topinterviewquestions.Arrays1.NextPermutationTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;


public class MergeSortedArraysTest {

    Logger logger = Logger.getLogger("Merge Array");
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        reverse(nums1,m);
        int i = m-1,j=0;
        for(;i>=0&&j<n;){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums2[j];
                j++;
            }
            else{
                nums1[k--] = nums1[i];
                nums1[i]=0;
                i--;
            }
        }
        if(i==-1){
            while(j<n&&k>=0){
                nums1[k--] = nums2[j++];
            }
        }
        reverse(nums1,m+n);
        return;
    }

    private void reverse(int[] nums1, int m) {
        int start = 0;
        int end = m-1;
        while(start<end){
            NextPermutationTest.swapElement(nums1,start,end);
            start++;
            end--;
        }
    }

    @Test
    public void testMergeArray(){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1,nums1.length-nums2.length,nums2,nums2.length);
        logger.info(Arrays.toString(nums1));

    }
}
