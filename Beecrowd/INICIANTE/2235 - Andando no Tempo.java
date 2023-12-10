import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, c;
    a = ler.nextInt();
    b = ler.nextInt();
    c = ler.nextInt();
    if(Math.abs(a-b) == 0 || Math.abs(b-c) == 0 || Math.abs(a-c) == 0 || Math.abs((a+b)-c) == 0 || Math.abs((b+c)-a) == 0 || Math.abs((a+c)-b) == 0){
      System.out.println("S");    
    }else{
      System.out.println("N");    
    }
    ler.close();
  }
}
