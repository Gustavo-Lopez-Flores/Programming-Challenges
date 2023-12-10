import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int aux = 0, draw = 0, inter = 0, gremio = 0, amount = 0;
    int num1, num2, answer;
    while(aux == 0){
      num1 = ler.nextInt();
      num2 = ler.nextInt();
      if(num1 > num2){
        inter++;
      }else if (num2 > num1){
        gremio++;
      } else{
        draw++;
      }
      amount++;
      System.out.println("Novo grenal (1-sim 2-nao)");
      answer = ler.nextInt();
      if(answer==2){
        System.out.printf("%d grenais%n",amount);
        System.out.printf("Inter:%d%n",inter);
        System.out.printf("Gremio:%d%n",gremio);
        System.out.printf("Empates:%d%n",draw);
        if(inter > gremio){
          System.out.println("Inter venceu mais");    
        }else if(gremio > inter){
          System.out.println("Gremio venceu mais");        
        }else{
          System.out.println("Nao houve vencedor"); 
        }
        break;
      }
    }
    ler.close();
  }
}