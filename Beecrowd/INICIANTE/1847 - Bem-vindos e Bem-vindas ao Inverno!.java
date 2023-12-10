import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n1, n2, n3;
    n1 = ler.nextInt();
    n2 = ler.nextInt();
    n3 = ler.nextInt();
    if((n2 < n1 && n3 >= n2) || (n2 > n1 && n3 > n2 && Math.abs(n3-n2) >= Math.abs(n2-n1)) || (n2 < n1 && n3 < n2 && Math.abs(n3-n2) < Math.abs(n2-n1)) || (n2 == n1 && n3 > n2)){
      System.out.println(":)");    
    }else{
      System.out.println(":(");    
    }
    ler.close();
  }
}
