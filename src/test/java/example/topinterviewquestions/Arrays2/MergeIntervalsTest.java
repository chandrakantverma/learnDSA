package example.topinterviewquestions.Arrays2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class MergeIntervalsTest {

    Logger log = Logger.getAnonymousLogger();
    public int[][] merge(int[][] itrvl) {
        int n = itrvl.length;
        Arrays.sort(itrvl, Comparator.comparing(a -> a[0]));
        List<int[]> mergedList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!mergedList.isEmpty()&&itrvl[i][0]<=mergedList.get(mergedList.size()-1)[1]){
                mergedList.get(mergedList.size()-1)[1] = Math.max(mergedList.get(mergedList.size()-1)[1],itrvl[i][1]);
            }else{
                mergedList.add(itrvl[i]);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }

    @Test
    public void testMergeInterval(){
        int[][] mrg =  new int[][]{{1,3},{2,6},{8,10},{15,18}};
        log.info(Arrays.deepToString(mrg));
        log.info(Arrays.deepToString(merge(mrg)));
    }
}
