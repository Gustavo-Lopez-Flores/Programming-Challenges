import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < num; i++){
      String linha = ler.nextLine();
      String[] palavras = linha.split(" ");
      List<String> lista = new ArrayList<>(Arrays.asList(palavras));

      lista.sort((a, b) -> {
        if(a.length() == b.length()){
          return -1;
        }else{
          return a.length() - b.length();
        }
      });

      StringBuilder novaLinha = new StringBuilder();
      novaLinha.append("");
      for(int j = lista.size() - 1; j >= 0; j--){
        novaLinha.append(lista.get(j));
        
        if(j > 0){
          novaLinha.append(" ");  
        }
      }

      System.out.println(novaLinha.toString());
    }
    
    ler.close();
  }
}
