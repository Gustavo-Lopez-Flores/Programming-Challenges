import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n;
    String j1;
    String j2;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      j1 = ler.next();
      j2 = ler.next();;
      if(j1.equals("pedra")){
        if(j2.equals("pedra")){
          System.out.println("Sem ganhador");        
        }else if(j2.equals("papel")){
          System.out.println("Jogador 1 venceu");       
        }else if(j2.equals("ataque")){
          System.out.println("Jogador 2 venceu");
        }
      }else if(j1.equals("papel")){
        if(j2.equals("pedra")){
          System.out.println("Jogador 2 venceu");       
        }else if(j2.equals("papel")){
          System.out.println("Ambos venceram");
        }else if(j2.equals("ataque")){
          System.out.println("Jogador 2 venceu");
        }
      }else if(j1.equals("ataque")){
        if(j2.equals("pedra")){
          System.out.println("Jogador 1 venceu");    
        }else if(j2.equals("papel")){
          System.out.println("Jogador 1 venceu");    
        }else if(j2.equals("ataque")){
          System.out.println("Aniquilacao mutua");    
        }
      }
    }
    ler.close();
  }
}
