import java.util.*;

public class Main {
  static void tabelaHash(int hash, int qtdElem, Scanner ler) {
    Map<String, StringBuilder> mapa = new LinkedHashMap<>();
    for(int i = 0; i < hash; i++) {
      mapa.put(String.format("%d -> ", i), new StringBuilder());
    }

    int[] arr = new int[qtdElem];
    for(int i = 0; i < qtdElem; i++) {
      arr[i] = ler.nextInt();
    }

    for(int i = 0; i < qtdElem; i++) {
      int pos = arr[i] % hash;
      mapa.get(String.format("%d -> ", pos)).append(arr[i]).append(" -> "); 
    }

    StringBuilder resultado = new StringBuilder();
    for(Map.Entry<String, StringBuilder> m : mapa.entrySet()){
      resultado.append(m.getKey()).append(m.getValue() + "\\").append(String.format("%n"));
    }
    System.out.print(resultado.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
    for(int i = 0; i < casos; i++){
      int hash = ler.nextInt();
      int qtdElem = ler.nextInt();
      if(i > 0){
        System.out.println();
      }
      tabelaHash(hash, qtdElem, ler);
    }
    
    ler.close();
  }
}