package example.basics.inputoutput;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class TestBufferReader {


  public static void plusMinus(List<Integer> arr) {

    long len = arr.size();
    double positiveCount = arr.stream().filter(n -> n > 0).count();
    double negativeCount = arr.stream().filter(n -> n < 0).count();
    double zeroCount = arr.stream().filter(n -> n == 0).count();

    System.out.println(String.format("%.6f",positiveCount/len));
    System.out.println(String.format("%.6f",negativeCount/len));
    System.out.println(String.format("%.6f",zeroCount/len));

  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
    plusMinus(arr);
    bufferedReader.close();
  }
}
