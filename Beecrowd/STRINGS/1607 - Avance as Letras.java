import java.util.Scanner;

public class Main {
  static void avancaLetras(String primeiraPalavra, String segundaPalavra){
    int tamString = primeiraPalavra.length();
    int trocaLetra = 0;
    
    for(int i = 0; i < tamString; i++){
      char letraUm = primeiraPalavra.charAt(i);
      char letraDois = segundaPalavra.charAt(i);
      
      if(!(letraUm == letraDois)){
        if((int)letraUm > (int)letraDois){
          trocaLetra += 26 - (int)letraUm + (int)letraDois;  
        }else{
          trocaLetra += Math.abs((int)letraUm - (int)letraDois);  
        }
      }
    }

    System.out.println(trocaLetra);
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numeroDeCasos = ler.nextInt();
    
    for(int i = 0; i < numeroDeCasos; i++){
      String primeiraPalavra = ler.next();
      String segundaPalavra = ler.next();

      avancaLetras(primeiraPalavra, segundaPalavra); 
    }
    
    ler.close();
  }
}
