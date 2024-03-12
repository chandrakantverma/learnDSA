package example.topinterviewquestions.Arrays2;

import example.basics.recursion.pallindromString.PalindromeStringTest;
import example.topinterviewquestions.Arrays1.NextPermutationTest;
import example.topinterviewquestions.Arrays1.PascalsTriangleTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;


public class RotateImageBy90Test {

    Logger log = Logger.getLogger("rotateImageby90");
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix,n);
        leftswap(matrix,n);
    }

    private void leftswap(int[][] mat, int n) {
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n/2;j++)
            {
                NextPermutationTest.swapElement(mat[i],j,n-j-1);
            }
        }
    }

    public void swap(int[][] mat,int i, int j){
        int a = mat[i][j];
        int b = mat[j][i];
        a = a+b;
        b = a-b;
        a = a-b;
        mat[i][j] = a;
        mat[j][i] = b;
    }
    public void transpose(int[][] matrix,int n){
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                swap(matrix,i,j);
               // log.info(Arrays.deepToString(matrix));
            }
        }
    }

    @Test
    public void testRotateMat(){
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        log.info(Arrays.deepToString(mat));

    }
}
