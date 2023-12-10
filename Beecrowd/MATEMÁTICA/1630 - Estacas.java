import java.util.Scanner;

public class Main {
  static long estacas(long x, long y){
    if(x == y){
      return 4;
    }else{
      long menor = x < y ? x : y;
      long maior = x > y ? x : y;
      while(true){
        if(maior % menor == 0){
          break;
        }
        long aux = menor;
        menor = maior % menor;
        maior = aux;
      }  
      return ((y/menor)+(x/menor)) * 2;
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      long x = ler.nextLong();
      long y = ler.nextLong();
      System.out.println(estacas(x, y));
    }
    
    ler.close();
 }
}