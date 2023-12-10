import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextLine()){
      String linha = ler.nextLine();
      int metadeLinha = linha.length() / 2;
      
      while(true){
        if(linha.substring(0, metadeLinha).contains(linha.substring(metadeLinha))){
          break;
        }else{
          metadeLinha++;
        }
      }

      System.out.println(linha.substring(0, metadeLinha));
    }

    ler.close();
  }
}
