import java.util.Scanner;

public class Main {
  static String romano(String numero){
    int tamNumero = numero.length(); 
    switch (tamNumero){
      case 1:
        return unidade(numero);
      case 2:
        return dezena(numero.substring(0, 1)) + unidade(numero.substring(1, numero.length()));
      case 3:
        return centena(numero.substring(0, 1)) + dezena(numero.substring(1, 2)) + unidade(numero.substring(2, numero.length()));
      default:
        return "";
    }
  } 
  static String unidade(String numero){
    String algarismo;
    int und = Integer.parseInt(numero);
    if(und == 0){
      return "";
    }else if(und == 9){
      return "IX";
    } else if(und >= 5){
      algarismo = "I";
      return "V" + algarismo.repeat(und-5);
    } else if(und == 4){
      return "IV";
    } else{
      algarismo = "I";
      return algarismo.repeat(und);
    }
  }
  static String dezena(String numero){
    String algarismo;
    int und = Integer.parseInt(numero);
    if(und == 0){
      return "";
    }else if(und == 9){
      return "XC";
    } else if(und >= 5){
      algarismo = "X";
      return "L" + algarismo.repeat(und-5);
    } else if(und == 4){
      return "XL";
    } else{
      algarismo = "X";
      return algarismo.repeat(und);
    }
  }
  static String centena(String numero){
    String algarismo;
    int und = Integer.parseInt(numero);
    if(und == 0){
      return "";
    }else if(und == 9){
      return "CM";
    } else if(und >= 5){
      algarismo = "C";
      return "D" + algarismo.repeat(und-5);
    } else if(und == 4){
      return "CD";
    } else{
      algarismo = "C";
      return algarismo.repeat(und);
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String numero = ler.next();   
    System.out.println(romano(numero));
    
    ler.close();
 }
}