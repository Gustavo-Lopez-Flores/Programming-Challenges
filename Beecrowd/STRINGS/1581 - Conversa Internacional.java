import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numeroDeCasos = ler.nextInt();
    
    for(int i = 0; i < numeroDeCasos; i++) {
      int idiomaComum = 1, numeroDePessoas = ler.nextInt();
      ler.nextLine();

      String idiomaComparacao = ler.next();        
      for(int j = 1; j < numeroDePessoas; j++){
        String idioma = ler.next();        
        if(idioma.equals(idiomaComparacao)){
          idiomaComum++;
        }
      }

      if(idiomaComum == numeroDePessoas){
        System.out.println(idiomaComparacao);
      }else{
        System.out.println("ingles");
      }
    }
  
    ler.close();
  }
}