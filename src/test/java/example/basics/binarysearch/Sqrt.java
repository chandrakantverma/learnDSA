package example.basics.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sqrt {

    @Test
    public void testSqrtBS(){
        Assertions.assertEquals(5,mySqrt(27));
    }

    public int mySqrt(int x) {
        int low = 1;
        int high = x/2;
        int mid = 0 ;
        while(low<high){
            mid = low + (high-low)/2;

            if(mid*mid==x) return mid;
            if(mid*mid>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return mid;
    }

}
