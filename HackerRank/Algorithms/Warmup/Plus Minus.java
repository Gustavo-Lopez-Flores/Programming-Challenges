import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int size = arr.size();
        int pos = 0, neg = 0, zero = 0;
        for(int i : arr){
            if(i > 0){
                pos++;
            }else if(i == 0){
                zero++;
            }else{
                neg++;
            }
        }

        double porPos, porNeg, porZero;
        porPos = pos == 0 ? 0.0: (pos) / (double)size;
        porNeg = neg == 0 ? 0.0: (neg) / (double)size;
        porZero = zero == 0 ? 0.0: (zero) / (double)size;

        System.out.printf("%.6f%n%.6f%n%.6f%n", porPos, porNeg, porZero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
