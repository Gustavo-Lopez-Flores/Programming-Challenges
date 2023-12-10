import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, t, b, a1, d1, l1, a2, d2, l2;
    double v1, v2;
    t = ler.nextInt();
    for(i=0;i<t;i++){
      b = ler.nextInt();
      a1 = ler.nextInt();
      d1 = ler.nextInt();
      l1 = ler.nextInt();
      a2 = ler.nextInt();
      d2 = ler.nextInt();
      l2 = ler.nextInt();
      v1 = (double)((a1+d1)/(2.0));
      v2 = (double)((a2+d2)/(2.0));
      if(l1 % 2 == 0){
        v1 = (double)(v1+b);
      }
      if(l2 % 2 == 0){
        v2 = (double)(v2+b);
      }
      if(v1 == v2){
        System.out.println("Empate");
      }else if(v1>v2){
        System.out.println("Dabriel");      
      }else if(v2>v1){
        System.out.println("Guarte");
      }
    }
    ler.close();
  }
}
