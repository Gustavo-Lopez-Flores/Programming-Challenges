import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final double PI = 3.14;
    double v, d, al, ar; 
    while(ler.hasNext()){
      v = ler.nextDouble();
      d = ler.nextDouble();
      ar = (PI*(d/2)*(d/2));
      al = (v/ar);
      System.out.printf("ALTURA = %.2f%nAREA = %.2f%n",al,ar);    
    }
    ler.close();
  }
}
