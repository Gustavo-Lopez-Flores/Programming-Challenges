import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String frase;
    int i, n;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      frase = ler.nextLine();
      System.out.println("I am Toorg!");
    }
    ler.close();
  }
}