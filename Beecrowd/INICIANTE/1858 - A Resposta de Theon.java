import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 101;
    int i, n, m = 0, p = 0;
    int t[] = new int[MAX];
    n = ler.nextInt();
    for(i = 1; i < n+1; i++){
      t[i] = ler.nextInt();
      if(i == 1){
        m = t[i];
        p = i;
      }else if(t[i] < m){
        m = t[i];
        p = i;
      }
    }
    System.out.println(p);
    ler.close();
  }
}