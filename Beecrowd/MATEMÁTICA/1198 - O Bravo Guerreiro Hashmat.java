import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    while (ler.hasNext()) {
      long primeiro = ler.nextLong();
      long segundo = ler.nextLong();
      
      System.out.println(Math.abs(primeiro-segundo));
    }
  
    ler.close();
  }
}
