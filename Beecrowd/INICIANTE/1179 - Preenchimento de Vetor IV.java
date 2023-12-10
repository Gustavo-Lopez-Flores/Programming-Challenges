import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    final int MAX = 15;
    int i, j, pr = 0, ip = 0;
    int num[] = new int[MAX];
    int par[] = new int[MAX];
    int impar[] = new int[MAX];
    for(i = 0; i < MAX; i++){
      par[i] = 0;
      impar[i] = 0;
    }
    for(i = 0; i < MAX; i++){
      num[i] = ler.nextInt();  
      if(num[i] % 2 != 0){
        impar[ip] = num[i];
        ip++;
        if(ip == 5){
          for(j = 0; j < ip; j++){
            System.out.printf("impar[%d] = %d%n", j, impar[j]);
            impar[j] = 0;
          }
          ip = 0;
        }
      }
      if(num[i] % 2 == 0){
        par[pr] = num[i];
        pr++;
        if(pr == 5){
          for(j = 0; j < pr; j++){
            System.out.printf("par[%d] = %d%n", j, par[j]);
            par[j] = 0;
          }
          pr = 0;
        }
      }
    }
    for(j = 0; j < 5; j++){
      if(impar[j] != 0){
        System.out.printf("impar[%d] = %d%n", j, impar[j]);     
      }
    }
    for(j = 0; j < 5; j++){
      if(par[j] != 0){
        System.out.printf("par[%d] = %d%n", j, par[j]);         
      }
    }
    ler.close();
  }
}