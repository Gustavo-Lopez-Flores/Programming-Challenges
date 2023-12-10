import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextLine()){
      Set<Character> myset = new HashSet<>();
      String busca = ler.nextLine();
      
      if (!ler.hasNextLine()) break;
      String texto = ler.nextLine();

      for(char letra : busca.toCharArray()){
        myset.add(letra);        
      }

      int conta = 0;
      for(char letra : texto.toCharArray()){
        if(myset.contains(letra)){
          conta++;
        }
      }

      System.out.println(conta);
    }

    ler.close();
  }
}