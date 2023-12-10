import java.util.*;

public class Main {
  public static void novaSenha(String linha){
    StringBuilder senha = new StringBuilder();
    senha.append("");
    
    for(char c : linha.toCharArray()){
      if(Character.isLetter(c)){
        String letra = Character.toString(c); 
        if(senha.length() == 12){
          break;
        }
        
        if(letra.matches(".*[akuGQ].*")){
          senha.append("0");
        }else if(letra.matches(".*[blvIS].*")){
          senha.append("1");
        }else if(letra.matches(".*[cmwEOY].*")){
          senha.append("2");
        }else if(letra.matches(".*[dnxFPZ].*")){
          senha.append("3");
        }else if(letra.matches(".*[eoyJT].*")){
          senha.append("4");
        }else if(letra.matches(".*[fpzDNX].*")){
          senha.append("5");
        }else if(letra.matches(".*[gqAKU].*")){
          senha.append("6");
        }else if(letra.matches(".*[hrCMW].*")){
          senha.append("7");
        }else if(letra.matches(".*[isBLV].*")){
          senha.append("8");
        }else if(letra.matches(".*[jtHR].*")){
          senha.append("9");
        }        
      }
    }

    System.out.println(senha.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int quantidade = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < quantidade; i++){
      String linha = ler.nextLine();
      
      novaSenha(linha);
    }
    
    ler.close();
  }
}
