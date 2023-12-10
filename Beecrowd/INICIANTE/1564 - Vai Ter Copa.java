import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n;
    while (ler.hasNextInt()){
      n = ler.nextInt();
      if (n == 0) {
        System.out.println("vai ter copa!");
      } else if (n > 0){
        System.out.println("vai ter duas!");
      }
    }
    ler.close();
  }
}
