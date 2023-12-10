import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int cont = 0, aux = 0, a, n, i, sum=0;
    a = ler.nextInt();
    n = ler.nextInt();
    while(n<=0){
      n = ler.nextInt();
    }  
    while(cont <= n-1){
      sum+=a;
      a++;
      cont++;
    }  
    System.out.println(sum);
    ler.close();
  }
}