import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, x, x1, x2, y, y1, y2, total, teste = 1;
    while(true){
      x1 = ler.nextInt();
      y1 = ler.nextInt();
      x2 = ler.nextInt();
      y2 = ler.nextInt();
      if((x1 == 0) && (x2 == 0) && (y1 == 0) && (y2 == 0)){
       break; 
      }
      total = 0;
      n = ler.nextInt();
      for(i=0;i<n;i++){
        x = ler.nextInt();
        y = ler.nextInt();
        if((x >= x1 && x <= x2) && (y <= y1 && y >= y2)){
          total++;
        }
      }
      System.out.printf("Teste %d%n%d%n",teste,total);
      teste++;
    }
    ler.close();
  }
}
