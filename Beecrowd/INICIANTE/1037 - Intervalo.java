import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double numero = ler.nextDouble();
    if(numero >= 0 && numero <= 25){
        System.out.printf("Intervalo [0,25]\n");
    }else if(numero > 25 && numero <= 50){
        System.out.printf("Intervalo (25,50]\n");        
    }else if(numero > 50 && numero <= 75){
        System.out.printf("Intervalo (50,75]\n");
    }else if(numero > 75 && numero <= 100){
        System.out.printf("Intervalo (75,100]\n");
    }else {
        System.out.printf("Fora de intervalo\n");    
    }
    ler.close();
  }
}