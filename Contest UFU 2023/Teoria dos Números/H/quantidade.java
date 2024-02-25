import java.io.*;
import java.util.*;
import java.math.*;

public class quantidade {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      int arr[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      System.out.println(quantidadeDePrimos(arr));
    }
  }
  public static int quantidadeDePrimos(int arr[]) {
    int count = 0;
    
    for(int numero : arr){
      if(numero < 2)
        continue;
      
      boolean ehPrimo = true;
      for (long i = 2; i * i <= numero; i++) {
          if (numero % i == 0) {
              ehPrimo = false;
              break;
          }
      }
      if (ehPrimo) {
        count++;    
      }
    }

    return count;
  }
}