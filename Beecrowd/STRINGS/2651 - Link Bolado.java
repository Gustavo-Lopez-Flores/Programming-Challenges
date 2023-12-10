import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String palavra = ler.next();
    palavra = palavra.toLowerCase();
    
    if(palavra.indexOf("zelda") != -1){
      System.out.println("Link Bolado");
    }else{
      System.out.println("Link Tranquilo");
    }
    
    ler.close();
  }
}
