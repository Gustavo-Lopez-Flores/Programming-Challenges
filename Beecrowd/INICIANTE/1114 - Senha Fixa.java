import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int aux = 0, num;
    while(aux == 0){
      num = ler.nextInt();
      if(num == 2002){
        System.out.println("Acesso Permitido");
        break;
      }else{ 
        System.out.println("Senha Invalida");
      }
    }
    ler.close();
  }
}