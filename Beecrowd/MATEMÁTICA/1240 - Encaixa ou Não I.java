import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String a, b;
    int tamA, tamB;
    int qtd = ler.nextInt();
    for(int i=0; i<qtd; i++){
      a = ler.next();
      b = ler.next();
      tamA = a.length();
      tamB = b.length();
      if(tamB > tamA){
        System.out.println("nao encaixa");
      }else{
        a = a.substring((int)(tamA-tamB));
        if(a.equals(b)){
          System.out.println("encaixa");          
        }else{
          System.out.println("nao encaixa");
        }
      }
    }    
    ler.close();
  }
}