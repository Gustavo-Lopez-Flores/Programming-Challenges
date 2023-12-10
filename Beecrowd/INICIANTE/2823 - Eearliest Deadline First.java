import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n;
    double c, p, cnt = 0.0;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      c = ler.nextDouble();
      p = ler.nextDouble();      
      cnt+=(c/(double)p);
    }
    if(cnt>1){
      System.out.println("FAIL");
    }else{
      System.out.println("OK");
    }
    ler.close();
  }
}  