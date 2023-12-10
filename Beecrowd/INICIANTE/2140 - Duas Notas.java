import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int TAM = 6;
    int i, n, m, troco, dvs;
    int[] notas = {100, 50, 20, 10, 5, 2};
    
    while (true) {
        n = ler.nextInt();
        m = ler.nextInt();
        if (n == 0 && m == 0) {
            break;
        }
        
        dvs = 0;
        troco = Math.abs(n - m);
        
        for (i = 0; i < TAM; i++) {
            if (troco >= notas[i]) {
                troco -= notas[i];
                dvs++;
                break;
            }
        }
        
        for (i = 0; i < TAM; i++) {
            if (troco - notas[i] == 0) {
                dvs++;
                break;
            }
        }
        
        if (dvs == 2) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
    
   ler.close();
  }
}
