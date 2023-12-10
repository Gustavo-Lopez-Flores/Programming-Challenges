import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = ler.nextInt();

        for (int i = 0; i < c; i++) {
            int n = ler.nextInt();
            int[] vetor = new int[n];
            double media, porcentagem, soma = 0;

            for (int j = 0; j < n; j++) {
                vetor[j] = ler.nextInt();
                soma += (double) vetor[j];
            }

            media = (double) soma / n;
            int acimaDaMedia = 0;
            for (int j = 0; j < n; j++) {
                if (vetor[j] > media) {
                    acimaDaMedia++;
                }
            }

            porcentagem = ((double) acimaDaMedia * 100.0) / n;

            // Criar um padrão para três casas decimais, incluindo zeros à direita
            DecimalFormat decimalFormat = new DecimalFormat("#.000");

            // Formatando a porcentagem com o padrão de três casas decimais
            String porcentagemFormatada = decimalFormat.format(porcentagem);

            System.out.println(porcentagemFormatada + "%");
        }

        ler.close();
    }
}
