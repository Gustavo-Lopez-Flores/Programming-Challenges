import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = ler.nextInt();
    double l = ler.nextDouble();
    double q = ler.nextDouble();
    String[] pessoas = new String[n];
    for(int i = 0; i < n; i++) {
      pessoas[i] = ler.next();
    }

    int i = 0;
    double cuia = l;
    while(cuia > q){
      cuia -= q;
      i = (i+1)%n; 
    }

    System.out.printf("%s %.1f%n", pessoas[i], cuia);  
 
    // 0 = (0+1) % 3
    // 1 = (1+1) % 3
    // 2 = (2+1) % 3

    ler.close();
  }
}
