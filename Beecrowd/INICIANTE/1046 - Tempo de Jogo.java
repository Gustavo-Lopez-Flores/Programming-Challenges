import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int horaInicial, horaFinal, duracaoJogo = 0;
    horaInicial = ler.nextInt();
    horaFinal = ler.nextInt();
    if(horaInicial == horaFinal){
      duracaoJogo = 24;
    }else if(horaInicial < horaFinal){
      duracaoJogo = horaFinal - horaInicial;
    }else if(horaInicial > horaFinal){
      duracaoJogo = (24 - horaInicial) + horaFinal;   
    }
    System.out.printf("O JOGO DUROU %d HORA(S)%n",duracaoJogo);
    ler.close();
  }
}