import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      int n = ler.nextInt();
      Map<Integer, String> churras = new TreeMap<>();
      for(int i = 0; i < n; i++){
        String carne = ler.next();
        int preco = ler.nextInt();

        churras.put(preco, carne);
      }
      
      StringBuilder sb = new StringBuilder();
      sb.append("");
      for(int key : churras.keySet()){
        sb.append(churras.get(key)).append(" "); 
      }
      System.out.println(sb.toString().substring(0, (sb.length() - 1)));
    }
    
    ler.close();
  }
}