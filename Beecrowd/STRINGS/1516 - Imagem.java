import java.util.Scanner;

public class Main {
  static void dimensionarImagem(int linhas, int colunas, Scanner ler) {
    String[] imagem = new String[linhas];
    
    for (int i = 0; i < linhas; i++) {
      imagem[i] = ler.next();
    }
    
    int dimensaoLinha = ler.nextInt();
    int dimensaoColuna = ler.nextInt();

    int novaColuna = dimensaoColuna / colunas;
    int repete = dimensaoLinha / linhas;
    
    for(int i = 0; i < linhas; i++) {
      StringBuilder novaLinha = new StringBuilder();
      
      for(int j = 0; j < imagem[i].length(); j++) {
        String letra = Character.toString(imagem[i].charAt(j));
        novaLinha.append(letra.repeat(novaColuna));
      }
      
      for(int j = 0; j < repete; j++) {
        System.out.println(novaLinha);        
      }
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while (true) {
      int linhas = ler.nextInt();
      int colunas = ler.nextInt();

      if (linhas == 0 && colunas == 0) {
        break;
      } else {
        dimensionarImagem(linhas, colunas, ler);    
      }
    }
    
    ler.close();
  }
}
