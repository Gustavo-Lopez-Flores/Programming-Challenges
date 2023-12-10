import java.util.*;

public class Main {
  public static void operar(String linha){
      int indexSoma = linha.indexOf("+");
      int indexIgual = linha.indexOf("=");
      int resultado;
    
    if(linha.contains("R")){
      resultado = Integer.parseInt(linha.substring((indexIgual+1), linha.length())) - 
                  Integer.parseInt(linha.substring((indexSoma+1), indexIgual));
      System.out.println(resultado);
    }else if(linha.contains("L")){
      resultado = Integer.parseInt(linha.substring((indexIgual+1), linha.length())) - 
                  Integer.parseInt(linha.substring(0, indexSoma));
      System.out.println(resultado);
    }else{
      resultado = Integer.parseInt(linha.substring(0, indexSoma)) + 
                  Integer.parseInt(linha.substring((indexSoma+1), indexIgual));
      System.out.println(resultado);
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      String linha = ler.next();
      
      operar(linha);
    }
    
    ler.close();
  }
}
