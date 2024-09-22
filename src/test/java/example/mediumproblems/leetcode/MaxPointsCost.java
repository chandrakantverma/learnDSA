package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxPointsCost {

    @Test
    public void testMaxPoints(){
        Assertions.assertEquals(3,maxPoints(new int[][]{{3,2,1}}));
    }
    public long maxPoints(int[][] points) {
        int rows = points.length;
        int cols = points[0].length;

        int prev_c = 0;
        long prev_sum = points[0][0];
        long sum = prev_sum;
        System.out.println(prev_c+" "+sum+" "+prev_sum);

        for(int c=1;c<cols;c++){
            if(prev_sum<points[0][c])
            {
                prev_c = c;
                prev_sum = points[0][c];
                sum = prev_sum;
            }
        }
        System.out.println(prev_c);
        for(int r=1;r<rows;r++){
            int curr_c = 0;
            for(int c=0;c<cols;c++){
                if(prev_sum+points[r][c]-Math.abs(prev_c-curr_c)>sum){
                    curr_c = c;
                    sum = prev_sum+points[r][c]-Math.abs(prev_c-curr_c);
                }
            }
            prev_c = curr_c;
            prev_sum = sum;
            //System.out.println(prev_c);
        }
        return sum;
    }
}
