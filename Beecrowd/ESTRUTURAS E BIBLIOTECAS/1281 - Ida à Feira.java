import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
    for(int i = 0; i < casos; i++){
      Map<String, Double> produtos = new HashMap<>();
      
      int numProdutos = ler.nextInt();
      for(int j = 0; j < numProdutos; j++){
        String produto = ler.next();
        double preco = ler.nextDouble();

        produtos.put(produto, preco);
      }

      int numComprados = ler.nextInt();
      double precoTotal = 0.0;
      for(int j = 0; j < numComprados; j++){
        String produto = ler.next();
        int quantidade = ler.nextInt();
        
        precoTotal += (quantidade * produtos.get(produto));
      }

      System.out.printf("R$ %.2f%n", precoTotal);
    }
    
    ler.close();
  }
}
