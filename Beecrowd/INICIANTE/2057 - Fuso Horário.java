import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 10;
    int s, t, f, h;
    s = ler.nextInt();
    t = ler.nextInt();
    f = ler.nextInt();
    h = (s + t) > 23 ? (s + t) - 24: (s + t); 
    h = h + f; 
    if(h < 0){
      h = h + 24;
    }else if(h > 23){
      h = h - 24;
    }
    System.out.println(h);
    ler.close();
  }
}
