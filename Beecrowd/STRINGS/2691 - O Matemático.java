import java.util.*;

public class Main {
  public static void tabuada(String linha){
    int index = linha.indexOf("x");
    int primeiroNumero = Integer.parseInt(linha.substring(0,index));
    int segundoNumero = Integer.parseInt(linha.substring((index+1), linha.length()));

    StringBuilder resultado = new StringBuilder();
    resultado.append("");
    if(primeiroNumero == segundoNumero){
      for(int i = 5; i <= 10; i++){
        resultado.append(String.format("%d x %d = %d%n", primeiroNumero, i, (primeiroNumero * i))); 
      }
    }else{
      for(int i = 5; i <= 10; i++){
        resultado.append(String.format("%d x %d = %d && %d x %d = %d%n", primeiroNumero, i, (primeiroNumero * i), segundoNumero, i, (segundoNumero * i))); 
      }
    }
    
    System.out.print(resultado.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int casos = ler.nextInt();

    for(int i = 0; i < casos; i++){
      String linha = ler.next();
      
      tabuada(linha);
    }
    
    ler.close();
  }
}
