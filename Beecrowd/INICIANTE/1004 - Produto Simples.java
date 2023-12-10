import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int a = ler.nextInt();
    int b = ler.nextInt();
    System.out.printf("PROD = %d\n", (a*b));
    ler.close();
  }
}