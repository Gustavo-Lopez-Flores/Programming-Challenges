import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] v = new int[20];
    while (ler.hasNextInt()) {
      int m = ler.nextInt();
      for (int i = 0; i < m; i++) {
        v[i] = ler.nextInt();
      }
      int n = ler.nextInt();
      int s = 0;
      for (int i = m - 1; i >= 0; i -= n) {
        s += v[i];
      }
      if (primo(s)) {
        System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
      } else {
        System.out.println("Bad boy! I’ll hit you.");
      }
  }
    ler.close();
  }
  
  public static boolean primo(int num) {
    int dvs = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        dvs++;
      }
   }
    if (dvs == 2) {
      return true;
    } else {
      return false;
    }
  }
}