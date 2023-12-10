import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double r1, r2, d;
    double a = ler.nextDouble();
    double b = ler.nextDouble();
    double c = ler.nextDouble();
    if (a == 0){
      System.out.printf("Impossivel calcular\n");
    }else{
      d = (b * b) - (4)*(a)*(c);
      if (d < 0){ 
        System.out.printf("Impossivel calcular\n");
      }else{
        r1 = (-b + Math.sqrt(d)) / (2.0 * a);
        r2 = (-b - Math.sqrt(d)) / (2.0 * a);
        System.out.printf("R1 = %.5f\n",r1);
        System.out.printf("R2 = %.5f\n",r2);
      } 
    }
    ler.close();
  }
}