import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 5;
    int i, t, c = 0;
    int p[] = new int[MAX];
    t = ler.nextInt();
    for(i=0;i<MAX;i++){
      p[i] = ler.nextInt();          
    }
    for(i=0;i<MAX;i++){
      c = t == p[i] ? c + 1: c + 0;
    }
    System.out.println(c);
    ler.close();
  }
}
