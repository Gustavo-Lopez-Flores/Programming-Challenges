import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, t;
    int v[] = new int[5];
    for(i=0;i<5;i++){
      v[i] = ler.nextInt();
    }
    t = 225 + (v[0]*300) + (v[1]*1500) + (v[2]*600) + (v[3]*1000) + (v[4]*150);
    System.out.println(t);  
    ler.close();
  }
}
