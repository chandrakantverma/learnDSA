package example.mediumproblems.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        boolean neg = x<0;
        if(neg){
            x = -1*x;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        return (neg?-1:1)*Integer.valueOf(s);
    }
}
