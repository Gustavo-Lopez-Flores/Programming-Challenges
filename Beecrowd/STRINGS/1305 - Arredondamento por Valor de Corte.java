import java.util.Scanner;

public class Main {
    static void parteInteira(String numero, String cutoff) {
        int tamNumero = numero.length();
        int pontoNumero = -1;

        // Encontrando ponto
        for (int i = 0; i < tamNumero; i++) {
            if (numero.charAt(i) == '.') {
                pontoNumero = i;
                break;
            }
        }

        if (pontoNumero == -1) {
            System.out.println(Integer.parseInt(numero));
        } else if (pontoNumero == (tamNumero - 1)) {
            System.out.println(Integer.parseInt(numero.substring(0, pontoNumero)));
        } else {
            int arredonda;
            String parteFracionariaStr = numero.substring((pontoNumero + 1), tamNumero);
            parteFracionariaStr = parteFracionariaStr + "0000"; // Acrescentar zeros à direita
            int parteNumero = Integer.parseInt(parteFracionariaStr.substring(0, 4));
            int parteCutoff = Integer.parseInt(cutoff.substring(2, 6));

            if (pontoNumero == 0) {
                arredonda = 0;
            } else {
                arredonda = Integer.parseInt(numero.substring(0, pontoNumero));
            }

            if (parteNumero >= parteCutoff) {
                arredonda++;
            }

            System.out.println(arredonda);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            String num = ler.next();
            String cutoff = ler.next();
            parteInteira(num, cutoff);
        }

        ler.close();
    }
}
