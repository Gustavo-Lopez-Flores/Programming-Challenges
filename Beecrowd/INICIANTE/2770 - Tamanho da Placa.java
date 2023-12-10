import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, x, y, m, cA, cB, dA, dB;
    while (ler.hasNext()) {
      x = ler.nextInt();
      y = ler.nextInt();
      m = ler.nextInt();
      dA = x * y;
      for(i=0;i<m;i++){
        cA = ler.nextInt();
        cB = ler.nextInt();
        dB = cA * cB;
        if((dB <= dA) && ((cA <= x && cB <= y)||(cB <= x && cA <= y))){
          System.out.println("Sim");        
        }else{
          System.out.println("Nao");        
        }
      
      }
    }
    ler.close();
  }
}  