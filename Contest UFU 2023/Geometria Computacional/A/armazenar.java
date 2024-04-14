import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.*;

public class armazenar {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int numElements = Integer.parseInt(br.readLine());
      int[] array = Arrays.stream(br.readLine().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();

    sb.append(Arrays.toString(array).replace("[", "").replace("]", "").replace(",", " ")).append("\n");

    
      String line;
      while (!(line = br.readLine()).equals("-1")) {
        int position = Integer.parseInt(line);
        int value = Integer.parseInt(br.readLine());

        if (position >= 0 && position < array.length) {
          array[position] = value;
          sb.append(Arrays.toString(array).replace("[", "").replace("]", "").replace(",", " ")).append("\n");

        }

      }

      System.out.print(sb);
  }
}
