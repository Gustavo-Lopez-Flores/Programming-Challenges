import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int horas, minutos, segundos, tempo;
    tempo = ler.nextInt();
    horas = tempo / 3600;
    minutos = (tempo % 3600) / 60;
    segundos = (tempo % 3600) % 60;
    String texto = String.format("%d:%d:%d", horas, minutos, segundos);  
    System.out.println(texto);
    ler.close();
  }
}