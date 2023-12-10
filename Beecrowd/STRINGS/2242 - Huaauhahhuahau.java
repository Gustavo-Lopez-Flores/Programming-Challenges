import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    StringBuilder soVogais = new StringBuilder();
    String linha = ler.nextLine();
  
    for(char letra : linha.toCharArray()){
      boolean condicao = (letra == 'a') || 
                         (letra == 'e') ||
                         (letra == 'i') ||
                         (letra == 'o') ||
                         (letra == 'u') ;
      
      if(condicao){
        soVogais.append(Character.toString(letra));
      }
    }

    String normal = soVogais.toString();    
    String reverso = soVogais.reverse().toString();
    if(normal.equals(reverso)){
      System.out.println("S"); 
    }else{
      System.out.println("N");
    }
    
    ler.close();
  }
}