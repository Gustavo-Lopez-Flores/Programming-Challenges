import java.util.Scanner;

public class Main {
  static void classificacaoProblema(String linha) {
    String[] palavras = linha.split(" ");
    int quantidadePalavras = 0, mediaComprimento = 0;
    
    for (int i = 0; i < palavras.length; i++) {
      int tamPalavra = palavras[i].length();
      byte posicaoPonto = -1;
      boolean confere = true;
      
      for (byte j = 0; j < tamPalavra; j++) {
        char caracter = palavras[i].charAt(j);
        if(!Character.isLetter(caracter)){
          if(caracter == '.'){
            posicaoPonto = j;
          }else{
            confere = false;
          }
          break;
        }
      }

      if(posicaoPonto > -1){
        boolean pontoCerto = posicaoPonto == (tamPalavra - 1) && tamPalavra > 1 ? true: false;
        
        if(pontoCerto){
          tamPalavra--;
        }else{
          confere = false;
        }  
      }

      if(confere){
        mediaComprimento += tamPalavra; 
        quantidadePalavras++;        
      }
    }
    
    if (quantidadePalavras > 0) {
      mediaComprimento /= quantidadePalavras;
    }
    
    if (mediaComprimento <= 3) {
      System.out.println("250");
    } else if (mediaComprimento <= 5) {
      System.out.println("500");
    } else {
      System.out.println("1000");
    }
  }
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while (ler.hasNextLine()) {
      String linha = ler.nextLine();
      classificacaoProblema(linha);
    }
    
    ler.close();
  }
}