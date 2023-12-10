import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int hora, minuto, segundo;
    double angulo;  
    while(ler.hasNext()){
      angulo = ler.nextDouble();
      if((angulo >= 0 && angulo < 90) || (angulo == 360)){
        System.out.println("Bom Dia!!");      
      }else if(angulo >= 90 && angulo < 180){
        System.out.println("Boa Tarde!!");      
      }else if(angulo >= 180 && angulo < 270){
        System.out.println("Boa Noite!!");      
      }else if(angulo >= 270 && angulo < 360){
        System.out.println("De Madrugada!!");      
      }
      angulo += 90;
      hora = (int)angulo/15;
      angulo -= (hora*15);
      minuto = (int)(angulo*100)/25;
      angulo -= (minuto*0.25);
      segundo = (int)(angulo*1000)/4;
      if(hora >= 24){
        hora %= 24;
      }
      System.out.printf("%02d:%02d:%02d%n",hora,minuto,segundo);
    }
    ler.close();
  }
}