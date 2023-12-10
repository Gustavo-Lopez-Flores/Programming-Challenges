import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int instancia = 1;
    
    while(ler.hasNext()){
      String numero = ler.next();

      if(numero.equals("0")){
        break;
      }else{
        String painel = ler.next();

        if(instancia > 1){
          int index = painel.indexOf(numero);
          
          if(index == -1){
            System.out.printf("%nInstancia %d%nfalsa%n", instancia);  
          }else{
            System.out.printf("%nInstancia %d%nverdadeira%n", instancia);  
          }           
        }else{
          int index = painel.indexOf(numero);
          
          if(index == -1){
            System.out.printf("Instancia %d%nfalsa%n", instancia);  
          }else{
            System.out.printf("Instancia %d%nverdadeira%n", instancia);  
          } 
        }


        instancia++;
      }
    }
  
    ler.close();
  }
}
