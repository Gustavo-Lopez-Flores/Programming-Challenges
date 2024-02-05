import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        long inicio = ler.nextInt();
        long fim = ler.nextInt();

        String resultado = numPrimo(inicio, fim);
        System.out.println(resultado);
  
        ler.close();
    }

    static String numPrimo(long inicio, long fim) {
      StringBuilder sb = new StringBuilder();
      
      for (long numero = inicio; numero <= fim; numero++) {
          if (numero < 2) {
              continue;
          }
          boolean ehPrimo = true;
          for (long i = 2; i * i <= numero; i++) {
              if (numero % i == 0) {
                  ehPrimo = false;
                  break;
              }
          }
          if (ehPrimo) {
              sb.append(numero).append(" ");
          }
      }
      return sb.toString().trim();
    }
}
