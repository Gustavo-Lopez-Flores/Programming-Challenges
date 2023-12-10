import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double num = ler.nextDouble();
    System.out.printf("%+.4E%n", num);
    ler.close();
  }
}