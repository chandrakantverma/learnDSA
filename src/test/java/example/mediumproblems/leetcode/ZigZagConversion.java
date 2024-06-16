package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Test;

public class ZigZagConversion {

    @Test
    public void testZigZag(){
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public String convert(String s, int numRows) {

        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int add = 1;
        for(int idx = 0,i=0;i<s.length();i++){

            sb[idx].append(s.charAt(i));
            if(idx==0){
                add = 1;
            }
            else if(idx==numRows-1) add = -1;
            idx+=add;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder st: sb){
            res.append(st);
        }
        return res.toString();
    }
}
