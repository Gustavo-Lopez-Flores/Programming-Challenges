import java.util.Scanner;

public class Main {
  static int calcularHash(String texto, int elemento){
    int quantidade = 0, tamTexto = texto.length();

    for(int posicao = 0; posicao < tamTexto; posicao++){
      quantidade += ((int)texto.charAt(posicao)-65) + elemento + posicao;
    }
    
    return quantidade;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    
    for(int i = 0; i < n; i++){
      int hash = 0, linhas = ler.nextInt();

      for(int j = 0; j < linhas; j++){
        String texto = ler.next();
        hash += calcularHash(texto, j);
      }

      System.out.println(hash);
    }
  
    ler.close();
  }
}