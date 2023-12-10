import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      int casos = ler.nextInt();
      int[] livros = new int[casos];

      for(int i = 0; i < casos; i++){
        livros[i] = ler.nextInt();
      }

      Arrays.sort(livros);

      for(int i = 0; i < casos; i++){
      System.out.println(String.format("%04d", livros[i]));
      }

      System.out.println();
    }
  
    ler.close();
  }
}