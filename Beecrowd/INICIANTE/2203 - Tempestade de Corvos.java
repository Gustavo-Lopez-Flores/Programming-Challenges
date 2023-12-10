import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double d, xf, yf, xi, yi, vi, r1, r2;
    while(ler.hasNextDouble()){
      xf = ler.nextDouble();
      yf = ler.nextDouble();
      xi = ler.nextDouble(); 
      yi = ler.nextDouble(); 
      vi = ler.nextDouble();
      r1 = ler.nextDouble();
      r2 = ler.nextDouble();
      d = Math.sqrt(Math.pow(xi - xf, 2) + Math.pow(yi - yf, 2)) + (1.5 * vi);
      if((r1+r2) >= d){
        System.out.println("Y");
      }else{
        System.out.println("N");
      }
    }
      
    ler.close();
 }
}