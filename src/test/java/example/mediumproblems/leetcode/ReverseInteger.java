package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseInteger {
    @Test
    public void testReverse(){
        System.out.println(reverse(-2147483648));
    }

    public int reverse(int x) {
        //if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
        boolean neg = x < 0;

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        if(neg)
            s = s.substring(0,s.length()-1);
        long value = (neg ? -1 : 1) * Long.valueOf(s);
        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) return 0;

        return (int) value;
    }
}
