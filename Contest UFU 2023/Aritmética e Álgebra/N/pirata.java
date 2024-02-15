import java.io.*;
import java.util.*;
import java.math.*;

public class pirata {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      double x1 = Double.parseDouble(br.readLine());
      double y1 = Double.parseDouble(br.readLine());
      double x2 = Double.parseDouble(br.readLine());
      double y2 = Double.parseDouble(br.readLine());
      double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
      System.out.println(String.format("%.3f", distancia));
    }
  }
}
