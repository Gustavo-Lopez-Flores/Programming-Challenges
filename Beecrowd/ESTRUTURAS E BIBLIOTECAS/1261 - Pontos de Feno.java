import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int m = ler.nextInt();
    int n = ler.nextInt();

    Map<String, Integer> mapa = new HashMap<>();
    for(int i = 0; i < m; i++){
      String palavra = ler.next();
      int pontos = ler.nextInt();
      
      mapa.put(palavra, pontos);
    }
    ler.nextLine();
    
    int total = 0;
    while(n != 0){
      String linha = ler.nextLine();

      if(linha.equals(".")){
        System.out.println(total);
        total = 0;
        n--;
      }else{
        String[] palavras = linha.split(" ");
        
        for(String palavra : palavras){
          if(mapa.containsKey(palavra)){
            total += mapa.get(palavra);
          }  
        }
      }
    }
    
    ler.close();
  }
}
