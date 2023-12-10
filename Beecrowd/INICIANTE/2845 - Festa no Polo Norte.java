import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    int n = ler.nextInt();
    int maior = ler.nextInt();
    for (int i = 1; i < n; i++) {
      num = ler.nextInt();
      if(num > maior){
        maior = num;
      }
    }
    System.out.println(maior+1);
    ler.close();
  }
}