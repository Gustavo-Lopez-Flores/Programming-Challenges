import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n1, n2, q = 0, r = 0;
    n1 = ler.nextInt(); 
    n2 = ler.nextInt();
    for(i = 0; i <= Math.abs(n2); i++){
      if((n1 - i) == (n2 * ((n1-i)/n2))){
        q = (n1-i)/n2;
        r = i;
        break;
      }    
    }
    System.out.printf("%d %d%n", q, r);
    ler.close();
  }
}
