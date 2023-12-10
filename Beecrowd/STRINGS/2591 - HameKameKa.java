import java.util.*;

public class Main {
  public static void poder(String palavra){
    int tamanho = palavra.length();
    int index = palavra.indexOf("k");
    int repeticoes = (index-3) * (tamanho-index-3);
    String texto = "a";
    StringBuilder resultado = new StringBuilder();
    
    resultado.append("k");
    resultado.append(texto.repeat(repeticoes));
    
    System.out.println(resultado);
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int casos = ler.nextInt();

    for(int i = 0; i < casos; i++){
      String palavra = ler.next();

      poder(palavra);
    }
    
    ler.close();
  }
}
