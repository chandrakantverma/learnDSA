package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinTimeDiff {

    @Test
    public void testFindMinDifference(){
        //"00:00","23:59","00:00"]
        List<String> tempList = new ArrayList<>();

        tempList.add("23:59");
        tempList.add("00:00");
        Assertions.assertEquals(1,findMinDifference(tempList));
    }
    public int findMinDifference(List<String> timePoints) {
        List<Integer> auxilaryList = new ArrayList<>();
        for(String s: timePoints){
            auxilaryList.add(getNumber(s));
        }
        Collections.sort(auxilaryList);
        int res = Integer.MAX_VALUE;
        for(int i=1;i<auxilaryList.size();i++){
            res = Math.min(res,auxilaryList.get(i)-auxilaryList.get(0));
        }

        int circularDiff = (24 * 60 - auxilaryList.get(auxilaryList.size() - 1)) + auxilaryList.get(0);
        res = Math.min(res, circularDiff);
        return res;
    }

    public int getNumber(String s){
        int hour = Integer.valueOf(s.substring(0,2));
        int min = Integer.valueOf(s.substring(3));
        return hour*60+min;
    }
}
