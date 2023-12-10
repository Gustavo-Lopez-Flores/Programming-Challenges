import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, amin, amax, cont, a;
    while(ler.hasNext()){
      n = ler.nextInt();
      amin = ler.nextInt();
      amax = ler.nextInt();
      cont = 0;
      for(i=0;i<n;i++){
        a = ler.nextInt();
        if(a >= amin && a <= amax){
          cont++;
        }
      }
      System.out.println(cont);  
    }
    ler.close();
  }
}