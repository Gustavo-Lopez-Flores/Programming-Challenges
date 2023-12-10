import java.util.*;

public class Main {
  public static void descritografa(String linha){
    StringBuilder palavra = new StringBuilder();
    palavra.append("");
    StringBuilder inversa = new StringBuilder(linha);
    inversa.reverse();

    for(char letra : (inversa.toString()).toCharArray()){
      if(Character.isLowerCase(letra)){
        palavra.append(Character.toString(letra));
      }
    }
    
    System.out.println(palavra.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int casos = ler.nextInt();

    for(int i = 0; i < casos; i++){
      String linha = ler.next();
      
      descritografa(linha);
    }
    
    ler.close();
  }
}
