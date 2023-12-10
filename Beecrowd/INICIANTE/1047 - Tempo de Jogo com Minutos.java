import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);  
    int duracaoHora, duracaoMinuto;
    int horaInicial = ler.nextInt();
    int minutoInicial = ler.nextInt(); 
    int horaFinal = ler.nextInt(); 
    int minutoFinal = ler.nextInt();
    if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
      duracaoHora = 24;
      duracaoMinuto = 0;
    }
    else{ 
      if (horaInicial < horaFinal) {
      duracaoHora = horaFinal - horaInicial;
      }else {
      duracaoHora = (24 - horaInicial) + horaFinal;
      }
      if (minutoInicial == minutoFinal) {
      duracaoMinuto = 0;
      }else{ 
        duracaoMinuto = (60 - minutoInicial) + minutoFinal;
        if (duracaoMinuto == 60) {
          duracaoHora = duracaoHora + 1;
          duracaoMinuto = 0;
        } else if (duracaoMinuto > 60){
          duracaoMinuto = duracaoMinuto % 60;
        } else{
          duracaoHora = duracaoHora - 1; 
        }  
      } 
    }
    if(duracaoHora == 24 && duracaoMinuto > 0){
     duracaoHora = 0;
    }
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHora, duracaoMinuto);
    ler.close();
  }
}