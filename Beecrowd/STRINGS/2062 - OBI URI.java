import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int qtdPalavras = ler.nextInt();
    String[] palavras = new String[qtdPalavras];
    for(int i = 0; i < qtdPalavras; i++){
      palavras[i] = ler.next();
    }

    StringBuilder resultado = new StringBuilder();
    for(int i = 0; i < qtdPalavras; i++){
      if(palavras[i].length() == 3){
        if(palavras[i].substring(0, 2).equals("OB")){
          resultado.append("OBI");
        }else if(palavras[i].substring(0, 2).equals("UR")){
          resultado.append("URI");
        }else{
          resultado.append(palavras[i]);
        }
      }else{
        resultado.append(palavras[i]);
      }
      resultado.append(" ");
    }
  System.out.println(resultado.toString().trim());
 
    ler.close();
  }
}
