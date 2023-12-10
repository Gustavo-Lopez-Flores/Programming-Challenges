import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static int josephus(int n, int k) {
    List<Integer> circle = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      circle.add(i);
    }
  
    int index = 0;
  
    while (circle.size() > 1) {
      index = (index + k - 1) % circle.size();
      circle.remove(index);
    }
  
    return circle.get(0);
  }
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int casos = ler.nextInt(); 
  
    for (int i = 1; i <= casos; i++) {
      int n = ler.nextInt();
      int k = ler.nextInt();
      int result = josephus(n, k);
      System.out.println("Case " + i + ": " + result);
    }
  }
}