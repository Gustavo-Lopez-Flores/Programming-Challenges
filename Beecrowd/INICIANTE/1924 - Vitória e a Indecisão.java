import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int qntd, i;
    String s1;
    qntd = ler.nextInt();
    for(i=0;i<qntd;i++){
      s1 = ler.next();
    }
    System.out.println("Ciencia da Computacao");
    ler.close();
  }
}