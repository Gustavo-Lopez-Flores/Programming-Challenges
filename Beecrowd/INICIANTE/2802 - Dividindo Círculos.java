import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();

    BigInteger fatorial = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      fatorial = fatorial.multiply(BigInteger.valueOf(i));
    }

    BigInteger resultado = BigInteger.ONE.add(fatorial.divide(fatorial(2)).divide(fatorial(n - 2)))
        .add(fatorial.divide(fatorial(4)).divide(fatorial(n - 4)));

    System.out.println(resultado.toString());
    ler.close();
  }

  private static BigInteger fatorial(int n) {
    BigInteger resultado = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      resultado = resultado.multiply(BigInteger.valueOf(i));
    }
    return resultado;
  }
}