import java.util.Scanner;

public class Main {
    static void criarArvore(int numero) {
        StringBuilder arvore = new StringBuilder();

        // topo
        for (int i = 1; i <= numero; i += 2) {
            int espacos = (numero - i) / 2;
            int estrelas = i;
            arvore.append(" ".repeat(espacos)).append("*".repeat(estrelas)).append("\n");
        }

        // base
        int espacos = (numero - 1) / 2;
        arvore.append(" ".repeat(espacos)).append("*\n");
        arvore.append(" ".repeat(espacos - 1)).append("***\n");

        System.out.println(arvore);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int numero = input.nextInt();

            criarArvore(numero);
        }

        input.close();
    }
}
