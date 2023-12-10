import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 501;
    int i, m, num; 
    int lesma[] = new int[MAX];
    while(ler.hasNextInt()){
      num = ler.nextInt();
      m = 0;
      for(i = 1; i <= num; i++){
        lesma[i] = ler.nextInt();
        m = lesma[i] < 10 && m != 2 && m != 3 ? 1 : m;
        m = lesma[i] >= 10 && lesma[i] < 20 && m != 3? 2: m;
        m = lesma[i] >= 20 ? 3 : m;
      }
      System.out.println(m);
    }
    ler.close();
  }
}
