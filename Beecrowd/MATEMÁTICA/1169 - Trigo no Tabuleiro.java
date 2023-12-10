import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int graos = ler.nextInt();
            BigDecimal kgs = calcularPesoTrigo(graos);
            System.out.println(kgs + " kg");
        }

        ler.close();
    }

    private static BigDecimal calcularPesoTrigo(int graos) {
        BigDecimal gt = BigDecimal.ONE;
        BigDecimal multiplicador = BigDecimal.valueOf(2);
        
        if (graos < 12) {
            return BigDecimal.ZERO;
        } else {
            for (int j = 1; j <= graos; j++) {
                gt = gt.multiply(multiplicador);
            }
            BigDecimal kgs = gt.divide(BigDecimal.valueOf(12_000), RoundingMode.DOWN);
            return kgs;
        }
    }
}
