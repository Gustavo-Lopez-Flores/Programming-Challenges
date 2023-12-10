import java.util.Scanner;

public class Main {
  static long combinacoes(int n){
    switch(n){
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 4;
      default:
        long r;
        long[] vet = new long[n+1];
        vet[1] = 1;
        vet[2] = 2;
        vet[3] = 4;
        long mod = (long)Math.pow(10, 9) + 7;
        for(int i = 4; i <= n; i++){
          vet[i] = (vet[i-3] + vet[i-2] + vet[i-1]) % mod;
        }
        return vet[n];
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      int n = ler.nextInt();
      System.out.println(combinacoes(n));
    }
    
    ler.close();
 }
}