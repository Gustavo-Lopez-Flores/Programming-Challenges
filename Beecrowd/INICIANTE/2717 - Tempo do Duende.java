import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int tempo = ler.nextInt();
    int a = ler.nextInt();      
    int b = ler.nextInt();

    if((tempo - (a + b) >= 0))
      System.out.println("Farei hoje!");
    else
      System.out.println("Deixa para amanha!");
    
    ler.close();
  }
}