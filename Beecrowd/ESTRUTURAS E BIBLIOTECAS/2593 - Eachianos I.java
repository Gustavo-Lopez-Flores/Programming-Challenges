import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto = ler.nextLine();
        int qtdPalavras = ler.nextInt();

        String[] palavras = new String[qtdPalavras];
        for (int i = 0; i < qtdPalavras; i++) {
            palavras[i] = ler.next();
        }

        for (int i = 0; i < qtdPalavras; i++) {
            StringBuilder ocorrencias = new StringBuilder();

            String regex = "\\b" + Pattern.quote(palavras[i]) + "\\b";
            Pattern pattern = Pattern.compile(regex);
  
            Matcher matcher = pattern.matcher(texto);
  
            while (matcher.find()) {
                int indiceInicio = matcher.start();
               ocorrencias.append(indiceInicio).append(" ");
           }

            if (ocorrencias.length() > 0) {
                System.out.println(ocorrencias.toString().trim());
            } else {
                System.out.println("-1");
            }
        }

        ler.close();
    }
}
