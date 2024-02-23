import java.io.*;
import java.util.*;
import java.math.*;

public class escoteiros {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine()); 
      int resultado;
      if(num == 0){
        resultado = 0;
      }else{
        resultado = 1; 
        int arr[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for(int i : arr){
          resultado *= i;
        }
      }
      System.out.println(resultado);
    }
  }
}