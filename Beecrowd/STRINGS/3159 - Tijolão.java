import java.util.*;

public class Main {
  public static void tijolo(String linha){
    char ultimoDigito = '-';
    int linhaTamanho = linha.length();
    StringBuilder resultado = new StringBuilder();

    for(int i = 0; i < linhaTamanho; i++){
      char letraAtual = linha.charAt(i);
      char digito;
      int repeticoes = 1;
      
      if(Character.isUpperCase(letraAtual)){
        resultado.append("#");
        ultimoDigito = '#';
      }
      
      if((int)letraAtual == 32){
        digito = '0';
      }else{
        repeticoes = (int) Character.toLowerCase(letraAtual);
        
        if(repeticoes >= 97 && repeticoes <= 99){
          digito = '2';
          repeticoes -= 96;
        }else if(repeticoes >= 100 && repeticoes <= 102){
          digito = '3';
          repeticoes -= 99;
        }else if(repeticoes >= 103 && repeticoes <= 105){
          digito = '4';
          repeticoes -= 102;
        }else if(repeticoes >= 106 && repeticoes <= 108){
          digito = '5';
          repeticoes -= 105;
        }else if(repeticoes >= 109 && repeticoes <= 111){
          digito = '6';
          repeticoes -= 108;
        }else if(repeticoes >= 112 && repeticoes <= 115){
          digito = '7';
          repeticoes -= 111;
        }else if(repeticoes >= 116 && repeticoes <= 118){
          digito = '8';
          repeticoes -= 115;
        }else{
          digito = '9';
          repeticoes -= 118;
        }
      }

      if(digito == ultimoDigito){
        resultado.append("*");
      }          
      
      ultimoDigito = digito;
      String texto = Character.toString(digito);
      resultado.append(texto.repeat(repeticoes));
     
      
    }        

    System.out.println(resultado.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int casos = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < casos; i++){
      String linha = ler.nextLine();

      tijolo(linha);
    }
    

    ler.close();
  }
}
