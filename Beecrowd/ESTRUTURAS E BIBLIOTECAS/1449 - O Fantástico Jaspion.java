import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numCasos = ler.nextInt();
    for(int i = 0; i < numCasos; i++){
      int qtdPalavras = ler.nextInt(); 
      int qtdFrases = ler.nextInt();
      
      Map<String, String> dicionario = new HashMap<>();
      for(int j = 0; j < qtdPalavras; j++){
        String palavra = ler.next(); ler.nextLine();
        String traducao = ler.nextLine();
        
        dicionario.put(palavra, traducao);  
      }

      for(int j = 0; j < qtdFrases; j++){
        String linha = ler.nextLine();
        String[] palavras = linha.split(" ");
        StringBuilder novaLinha = new StringBuilder();
        novaLinha.append("");
        
        for(int k = 0; k < palavras.length; k++){
          if(dicionario.containsKey(palavras[k])){
            novaLinha.append(dicionario.get(palavras[k]));
          }else{
            novaLinha.append(palavras[k]);
          }
          if(k < (palavras.length - 1)){
            novaLinha.append(" ");
          }
        }

        System.out.println(novaLinha.toString());
      }

      System.out.println();
    }
    
    ler.close();
  }
}