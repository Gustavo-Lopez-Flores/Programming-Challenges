import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while (ler.hasNext()) {
      int n = ler.nextInt();
      int l = ler.nextInt();
      int c = ler.nextInt();

      int cont = 0;
      int linhasUsadas = 1;
      
      for(int i = 0; i < n; i++){
        String palavra = ler.next();
        
        if (cont + palavra.length() <= c) {
          cont += palavra.length() + 1;
        }
        else {
          linhasUsadas++;
          cont = palavra.length() + 1;
        }
      }

      int paginas = (linhasUsadas + l - 1) / l; 
      System.out.println(paginas);
    }
  
    ler.close();
  }
}
