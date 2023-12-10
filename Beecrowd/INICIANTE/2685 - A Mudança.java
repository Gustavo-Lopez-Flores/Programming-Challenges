import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int angulo;  
    while(ler.hasNext()){
      angulo = ler.nextInt();
      if((angulo >= 0 && angulo < 90) || (angulo == 360)){
        System.out.println("Bom Dia!!");      
      }else if(angulo >= 90 && angulo < 180){
        System.out.println("Boa Tarde!!");      
      }else if(angulo >= 180 && angulo < 270){
        System.out.println("Boa Noite!!");      
      }else if(angulo >= 270 && angulo < 360){
        System.out.println("De Madrugada!!");      
      }
    }
    ler.close();
  }
}