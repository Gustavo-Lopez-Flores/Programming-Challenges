import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int e = ler.nextInt();
    int f = ler.nextInt();
    int c = ler.nextInt();

    int garrafas = e + f;
    int bebeu = 0;
    while(garrafas >= c){
      bebeu += (garrafas/c);
      garrafas = (garrafas/c) + (garrafas%c);
    }       

    System.out.println(bebeu);    
    ler.close();
  }
}