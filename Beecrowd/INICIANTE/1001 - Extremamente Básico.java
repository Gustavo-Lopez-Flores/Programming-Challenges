import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a = ler.nextInt();
    int b = ler.nextInt();
    System.out.println("X = " + (a+b));
    ler.close();
  }
}