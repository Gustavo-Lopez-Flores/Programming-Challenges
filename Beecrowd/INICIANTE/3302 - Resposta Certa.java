import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, nota, t;
    while(ler.hasNext()){
      n = ler.nextInt();
      t = 1;
      for(i=0;i<n;i++){
        nota = ler.nextInt();
        System.out.printf("resposta %d: %d%n",t,nota);
        t++;
      }
    }
    ler.close();
  }
}
