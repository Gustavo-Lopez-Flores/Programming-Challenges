import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int a = ler.nextInt();
    int b = ler.nextInt();
    int c = ler.nextInt();
    int maior = (a + b + Math.abs(a - b)) / 2;
    maior = maior > c ? maior: c;
    System.out.printf("%d eh o maior\n", maior);
    ler.close();
  }
}