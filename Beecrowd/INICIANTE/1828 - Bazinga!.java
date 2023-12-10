import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, qntd;
    String p1 = new String();
    String p2 = new String();
    qntd = ler.nextInt();
    for(i = 0; i < qntd; i++){
      p1 = ler.next();
      p2 = ler.next();
      if(p1.equals(p2)){
        System.out.printf("Caso #%d: De novo!%n",i+1);      
      }else{
        if(p1.equals("papel")){
          if(p2.equals("pedra") || p2.equals("Spock")){
            System.out.printf("Caso #%d: Bazinga!%n",i+1);
          }else{
            System.out.printf("Caso #%d: Raj trapaceou!%n",i+1);                       }
        }else if(p1.equals("pedra")){
          if(p2.equals("tesoura") || p2.equals("lagarto")){
            System.out.printf("Caso #%d: Bazinga!%n",i+1);
          }else{
            System.out.printf("Caso #%d: Raj trapaceou!%n",i+1);                       }      
        }else if(p1.equals("tesoura")){
          if(p2.equals("papel") || p2.equals("lagarto")){
            System.out.printf("Caso #%d: Bazinga!%n",i+1);
          }else{
            System.out.printf("Caso #%d: Raj trapaceou!%n",i+1);                       }
        }else if(p1.equals("lagarto")){
          if(p2.equals("Spock") || p2.equals("papel")){
            System.out.printf("Caso #%d: Bazinga!%n",i+1);
          }else{
            System.out.printf("Caso #%d: Raj trapaceou!%n",i+1);                       }
        }else if(p1.equals("Spock")){
          if(p2.equals("tesoura") || p2.equals("pedra")){
            System.out.printf("Caso #%d: Bazinga!%n",i+1);
          }else{
            System.out.printf("Caso #%d: Raj trapaceou!%n",i+1);                       }
        }
      }
    }
    ler.close();
  }
}
