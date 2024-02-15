import java.io.*;
import java.util.*;
import java.math.*;

public class maratona {
  public static int calcularMDC(int a, int b) {
    if(a == b)
      return a;

    int mdc = 1, aux = 1;
    while(aux <= a && aux <= b){
      if(a % aux == 0 && b % aux == 0){
        mdc = aux;
      }
      aux++;
    }

    
    return mdc;
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int cases = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < cases; i++){
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        sb.append(calcularMDC(a, b)).append("\n");
      }
      System.out.print(sb.toString());
    }
  }
}
