import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      int n = ler.nextInt();
      int h = ler.nextInt();
      int c = ler.nextInt();    
      int l = ler.nextInt();

      double hipo = Math.sqrt(Math.pow(h, 2) + Math.pow(c, 2));
      double area = ((hipo * l) * n) * (Math.pow(10,-4)); 

      System.out.printf("%.4f%n", area);
    }

    ler.close();
  }
}
