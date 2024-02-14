import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    int[] dados = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    double tempoEmMinutos = dados[0] + (dados[1] / 60.0);
    double tempoPorKm = tempoEmMinutos / 10.0;
    double tempoMaratonaEmMin = 21 * tempoEmMinutos / 10.0;
    System.out.println(String.format("%.1f%n%.1f", tempoPorKm, tempoMaratonaEmMin));

    br.close();
  }
}
