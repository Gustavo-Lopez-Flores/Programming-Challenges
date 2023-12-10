import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int v, t, d;
    while(ler.hasNext()){
      v = ler.nextInt();
      t = ler.nextInt();
      d = (v*t) * 2;
      System.out.println(d);
    }
    ler.close();
  }
}