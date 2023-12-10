import java.util.Scanner;

public class Main {
  static void qualNumero(String numero) {
    int tamNumero = numero.length();
    
    if(tamNumero > 3){
      System.out.println("3");
    }else{
      int um = 0, dois = 0;
      um = numero.charAt(0) == 'o' ? ++um: um;
      um = numero.charAt(1) == 'n' ? ++um: um;
      um = numero.charAt(2) == 'e' ? ++um: um;

      dois = numero.charAt(0) == 't' ? ++dois: dois;
      dois = numero.charAt(1) == 'w' ? ++dois: dois;
      dois = numero.charAt(2) == 'o' ? ++dois: dois;

      if(dois > um){
        System.out.println("2");
      }else{
        System.out.println("1");
      }
    }
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    
    for(int i = 0; i < n; i++) {
      String numero = ler.next();
      qualNumero(numero);
    }

    ler.close();
  }
}
