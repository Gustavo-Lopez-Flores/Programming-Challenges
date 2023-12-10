import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long i, v, n;
    double m;
    v = ler.nextLong();
    n = ler.nextLong();
    for(i=1;i<=9;i++){
      m = Math.ceil(((v*n)*(i*10))/100.0);
      if(i == 9){
          System.out.printf("%.0f%n",m);        
      }else{
          System.out.printf("%.0f ",m);        
      }
    }
    ler.close();
  }
}
