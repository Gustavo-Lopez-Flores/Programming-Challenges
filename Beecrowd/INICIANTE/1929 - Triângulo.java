import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, c, d;
    a = ler.nextInt();
    b = ler.nextInt();
    c = ler.nextInt();
    d = ler.nextInt();
    if((a > Math.abs(b-c) && b > Math.abs(a-c) && c > Math.abs(a-b)) || (b > Math.abs(c-d) && c > Math.abs(b-d) && d > Math.abs(b-c)) || (a > Math.abs(c-d) && c > Math.abs(a-d) && d > Math.abs(a-c)) || (a > Math.abs(b-d) && b > Math.abs(a-d) && d > Math.abs(a-b))
      ){
      System.out.println("S");    
    }else{
      System.out.println("N");
    }
    ler.close();
  }
}