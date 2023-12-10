import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      String linha = ler.nextLine();
      StringBuilder novaString = new StringBuilder();
      int underline = 0, asteristico = 0, tamLinha = linha.length();
      
      for(int i = 0; i < tamLinha; i++){
        if(linha.charAt(i) == '_'){
          if(underline % 2 == 0){
            novaString.append("<i>");
          }else{
            novaString.append("</i>");            
          }
          underline = (underline+1)%2;
        }else if(linha.charAt(i) == '*'){
          if(asteristico % 2 == 0){
            novaString.append("<b>");
          }else{
            novaString.append("</b>");            
          }
          asteristico = (asteristico+1)%2;
        }else{
          novaString.append(Character.toString(linha.charAt(i)));
        }
      }

      System.out.println(novaString);
    }
    
    ler.close();
  }
}