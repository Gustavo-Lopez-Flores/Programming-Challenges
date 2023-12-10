import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, l, k, m, s;
    while(ler.hasNext()){
      n = ler.nextInt();
      l = ler.nextInt();
      s = 0;
      for(i=0;i<n;i++){
        k = ler.nextInt();
        m = ler.nextInt();
        if(k == l && m == 0){
          s++;
        }
      }
      System.out.println(s);  
    }
    ler.close();
  }
}