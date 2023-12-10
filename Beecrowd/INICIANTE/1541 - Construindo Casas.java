import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, c, area, lado;
    while(true){
      a = ler.nextInt();
        if(a == 0){
          break;
        }
      b = ler.nextInt();
      c = ler.nextInt();;
      lado = 1;
      area = ((a*b)*100)/c;
      while(lado*lado <= area){
        lado++;
      }
      System.out.println(lado-1);
    }
    ler.close();
  }
}
