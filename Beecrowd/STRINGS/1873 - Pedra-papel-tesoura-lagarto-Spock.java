import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numeroDeCasos = ler.nextInt();
    
    for(int i = 0; i < numeroDeCasos; i++){
      String jogadaUm = ler.next();
      String jogadaDois = ler.next();
      
      if(jogadaUm.equals("pedra")){
        if(jogadaDois.equals("pedra")){
          System.out.println("empate");
        }else if(jogadaDois.equals("lagarto") || jogadaDois.equals("tesoura")){
          System.out.println("rajesh");
        }else{
          System.out.println("sheldon");
        }
      }else if(jogadaUm.equals("papel")){
        if(jogadaDois.equals("papel")){
          System.out.println("empate");
        }else if(jogadaDois.equals("pedra") || jogadaDois.equals("spock")){
          System.out.println("rajesh");
        }else{
          System.out.println("sheldon");
        }
      }else if(jogadaUm.equals("tesoura")){
        if(jogadaDois.equals("tesoura")){
          System.out.println("empate");
        }else if(jogadaDois.equals("papel") || jogadaDois.equals("lagarto")){
          System.out.println("rajesh");
        }else{
          System.out.println("sheldon");
        }
      }else if(jogadaUm.equals("lagarto")){
        if(jogadaDois.equals("lagarto")){
          System.out.println("empate");
        }else if(jogadaDois.equals("papel") || jogadaDois.equals("spock")){
          System.out.println("rajesh");
        }else{
          System.out.println("sheldon");
        }
      }else if(jogadaUm.equals("spock")){
        if(jogadaDois.equals("spock")){
          System.out.println("empate");
        }else if(jogadaDois.equals("pedra") || jogadaDois.equals("tesoura")){
          System.out.println("rajesh");
        }else{
          System.out.println("sheldon");
        }
      }
    }
    
    ler.close();
  }
}
