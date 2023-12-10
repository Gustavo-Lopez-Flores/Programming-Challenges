import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, min, kms;
    double rdm, attrdm = 0;
    while(ler.hasNext()){
      n = ler.nextInt();
      for(i=0;i<n;i++){
        min = ler.nextInt();
        kms = ler.nextInt();
        rdm = ((double)kms/min);
        if(i==0){
          System.out.println("1");  
          attrdm = rdm;
        }else if(rdm > attrdm){
          System.out.println(i+1);
          attrdm = rdm;
        }
      }
    }
    ler.close();
  }
}