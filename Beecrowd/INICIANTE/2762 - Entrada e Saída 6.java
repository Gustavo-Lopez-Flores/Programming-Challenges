import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int d;
    double num, p1, p2;
    while (ler.hasNext()) {
      num = ler.nextDouble();
      p1 = (int)num;
      p2 = (double)((num - p1) * 1000);
      d = (int)p2;
      if(d % 100 == 0){
        p2 = d/100;
      }else if(d % 10 == 0){
        p2 = d/10;
      }
      System.out.printf("%.0f.%.0f%n",p2,p1);
    }
    ler.close();
  }
}