import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      int index = 0, cont = 0;
      char digito = ler.next().charAt(0);
      String numero = ler.next();
      
      if(digito == '0' && numero.equals("0")){
        break;
      }else {
        StringBuilder resultado = new StringBuilder();
          
        for (char caracter : numero.toCharArray()) {
          if(caracter == '0'){
            cont++;
          }
          if (caracter != digito) {
            resultado.append(Character.toString(caracter));
          }
        }

        for (int i = 0; i < resultado.length(); i++) {
          if(resultado.charAt(i) != '0'){
            index = i;            
            break;
          }
        }
        
        if(cont == resultado.length()){
          System.out.println("0");        
        }else{
          System.out.println(resultado.substring(index, resultado.length()));
        }
      }
    }
    ler.close();
  }
}