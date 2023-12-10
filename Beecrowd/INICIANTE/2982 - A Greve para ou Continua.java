import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long i, n, v = 0, g = 0;
    char c;
    n = ler.nextLong();
    while(n!=0){
      c = ler.next().charAt(0);
      i = ler.nextLong();
      if(c == 'V'){
        v+=i;
      }else{
        g+=i;
      }
      n--;
    }
    if(g > v){
      System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");
    }else{
      System.out.println("A greve vai parar.");    
    }
    ler.close();
  }
}
