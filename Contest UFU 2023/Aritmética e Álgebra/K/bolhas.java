import java.io.*;
import java.util.*;
import java.math.*;

public class bolhas {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int bubbles = Integer.parseInt(br.readLine());
      int[] bubblesArray = new int[bubbles];
      
      for(int i = 0; i < bubbles; i++){
        bubblesArray[i] = Integer.parseInt(br.readLine()); 
      }

      int oneCentimeter = 0;
      for(int i = 0; i < bubbles; i++){
        if(bubblesArray[i] > 3)
          oneCentimeter += bubblesArray[i] - 3;
      }

      System.out.println(oneCentimeter);
    }
  }
}
