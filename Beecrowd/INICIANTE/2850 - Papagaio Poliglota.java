import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String caso;
    while(ler.hasNext()){
      caso = ler.nextLine();
      if(caso.equals("esquerda")){
        System.out.println("ingles");
      }else if(caso.equals("direita")){
        System.out.println("frances");
      }else if(caso.equals("nenhuma")){
        System.out.println("portugues");
      }else if(caso.equals("as duas")){
        System.out.println("caiu");  
      }
    }
    ler.close();
  }
}  