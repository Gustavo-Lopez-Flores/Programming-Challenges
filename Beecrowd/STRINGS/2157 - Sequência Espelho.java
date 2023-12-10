import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int casos = ler.nextInt();
    
    for (int i = 0; i < casos; i++) {
      int inicio = ler.nextInt();
      int fim = ler.nextInt();

      StringBuilder numero = new StringBuilder();
      StringBuilder reverso = new StringBuilder();
      for(int j = inicio; j <= fim; j++){
        numero.append(Integer.toString(j));
      }
      
      reverso.append(numero);
      reverso.reverse();
      System.out.println(numero.toString() + reverso.toString());
    }
  
    ler.close();
  }
}
