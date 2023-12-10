import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int aux = 0, num, i = 1, n = 1;
    num = ler.nextInt();
    while(aux == 0){
      System.out.printf("%d %d %d PUM%n", n, n+1, n+2);
      n+=4;
      i++;
      if(i == num+1){
        break;
      }
    }
    ler.close();
  }
}