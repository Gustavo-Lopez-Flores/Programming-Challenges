import java.util.*;

public class magica {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String linha = sc.nextLine();
    String[] palavras = linha.split(" ");
    
    int maior = 0, index = 0;
    for(int i = 0; i < palavras.length; i++){
      if(palavras[i].length() > maior){
        maior = palavras[i].length();
        index = i;
      }
    }

    System.out.println(palavras[index]);
    sc.close();
  }  
}