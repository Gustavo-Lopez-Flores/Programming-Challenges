import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, m, f;
    String p;
    n = ler.nextInt();
    m = ler.nextInt();
    f = n;
    for(i=0;i<m;i++){
      p = ler.next();
      if(p.equals("fechou")){
        f++;
      }else{
        f--;
      }
    }
    System.out.println(f);
    ler.close();
  }
}
