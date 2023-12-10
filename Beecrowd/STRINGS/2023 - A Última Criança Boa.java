import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();
    
    while(ler.hasNext()){
      String nome = ler.nextLine();
      nomes.add(nome);
    }

    Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);

    String ultimo = nomes.get(nomes.size() - 1);
    System.out.println(ultimo);
      
    ler.close();
  }
}