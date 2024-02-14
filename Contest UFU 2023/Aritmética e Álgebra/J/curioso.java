import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class curioso {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      double inicial = Double.parseDouble(br.readLine());
      double recorrente = Double.parseDouble(br.readLine());
      int ciclos = Integer.parseInt(br.readLine());

      double valor;
      if (ciclos > 1) {
          valor = inicial + (recorrente * (ciclos - 1));
      } else {
          valor = inicial;
      }

      System.out.printf("%.1f\n", valor);
    } catch (IOException | NumberFormatException e) {
      System.err.println("Erro de entrada: " + e.getMessage());
    }
  }
}
