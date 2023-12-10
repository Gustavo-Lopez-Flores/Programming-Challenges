import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, n;
    a = ler.nextInt();
    b = ler.nextInt();
    if(a == b){
      n = a;
    }else{
      if(a > b){
        n = a;
      }else{
        n = b;
      }
    }
    System.out.println(n);      
    ler.close();
  }
}