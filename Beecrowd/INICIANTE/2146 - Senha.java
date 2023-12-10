import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, s, n;
    while(ler.hasNextInt()){
      s = ler.nextInt();
      n = s-1;
      System.out.println(n);
    }
    ler.close();
  }
}
