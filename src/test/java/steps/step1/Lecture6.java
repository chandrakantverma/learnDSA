package steps.step1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture6 {
    public static void main(String[] args) {
        //finding the highest frequency element in array
        int[] arr = {31,2,3,5,4,3,6,3,5,7,2,32,32,5,5,5,5,5};
        //simple method
        Long start = System.currentTimeMillis();
        printFreqWithoutStream(arr);
        System.out.println(System.currentTimeMillis()-start);
        start = System.currentTimeMillis();
        printFreqWithStream(arr);
        System.out.println(System.currentTimeMillis()-start);
    }

    private static void printFreqWithStream(int[] arr) {
        Map<Integer, Long> freqMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        Map.Entry<Integer, Long> maxEntry = freqMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
    }

    private static void printFreqWithoutStream(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int highestFreq = 0;
        int highestFreqElement = -1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>highestFreq){
                highestFreq = entry.getValue();
                highestFreqElement = entry.getKey();
            }
        }
        System.out.println(highestFreqElement+" "+highestFreq);
    }
}
