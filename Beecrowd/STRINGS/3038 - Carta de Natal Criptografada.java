import java.util.*;

public class Main {
  public static void descriptografa(String linha){
    StringBuilder novaLinha = new StringBuilder();
    novaLinha.append("");

    for(char letra : linha.toCharArray()){
      switch(letra){
        case '@': 
          novaLinha.append("a");
        break;
        case '&':
          novaLinha.append("e");
        break;
        case '!':
          novaLinha.append("i");
        break;
        case '*':
          novaLinha.append("o");
        break;
        case '#': 
          novaLinha.append("u");
        break;
        default:
          novaLinha.append(Character.toString(letra));
      }
    }
    
    System.out.println(novaLinha.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextLine()){
      String linha = ler.nextLine();
      descriptografa(linha);
    }
    
    ler.close();
  }
}
