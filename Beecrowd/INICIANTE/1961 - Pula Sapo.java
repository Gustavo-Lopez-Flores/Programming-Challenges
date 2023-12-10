import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 100;
    int i, p, n, game = 0;
    int m[] = new int[MAX];
    p = ler.nextInt();
    n = ler.nextInt();
    for(i = 0; i < n; i++){
      m[i] = ler.nextInt();
    }
    for(i = 0; i < n-1; i++){
      if(Math.abs(m[i]-m[i+1]) > p){
        game++;
      }
    }
    if(game != 0){
      System.out.println("GAME OVER");
    }else{
      System.out.println("YOU WIN");
    }
    ler.close();
  }
}
