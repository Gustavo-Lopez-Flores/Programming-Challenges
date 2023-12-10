import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, count;
    double kgs;
    n = ler.nextInt();
    for(i = 0; i < n; i++){
      kgs = ler.nextDouble();
      count = 1;
      while((kgs/2) > 1){
        kgs /= 2;
        count++;
      }
      System.out.printf("%d dias%n", count);
    }
    ler.close();
  }
}