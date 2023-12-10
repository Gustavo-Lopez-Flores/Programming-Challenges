import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n;
    double xp;
    while(true){
      n = ler.nextInt();
      xp = ler.nextDouble();
      if(n == 0 && xp == 0)
        break;
      xp *= n;
      System.out.printf("%.0f%n", xp);
    } 
    ler.close();
  }
}
