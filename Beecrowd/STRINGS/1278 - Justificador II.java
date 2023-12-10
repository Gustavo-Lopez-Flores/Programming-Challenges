import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    boolean primeiroCaso = true;
  
    while (true) {
        int n = Integer.parseInt(ler.nextLine());
        if (n == 0) {
            break;
        }
  
        int maior = 0;
        String[] linhas = new String[n];
  
        for (int i = 0; i < n; i++) {
            String linha = ler.nextLine().trim().replaceAll("\\s+", " ");
            linhas[i] = linha;
            if (linha.length() > maior) {
                maior = linha.length();
            }
        }
  
        if (!primeiroCaso) {
            System.out.println();
        } else {
            primeiroCaso = false;
        }
  
        for (int i = 0; i < n; i++) {
            StringBuilder linhaJustificada = new StringBuilder();
            int espacosEsquerda = maior - linhas[i].length();
            linhaJustificada.append(" ".repeat(espacosEsquerda)).append(linhas[i]);
            System.out.println(linhaJustificada.toString());
        }
    }
  
    ler.close();
  }
}