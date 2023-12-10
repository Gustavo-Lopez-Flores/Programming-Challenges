import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i;
    double metade;
    double vet[] = new double[100];
    vet[0] = ler.nextDouble();
    for(i=1;i<100;i++){
      vet[i] = vet[i-1] / 2;
    }
    for(i=0;i<100;i++){
      System.out.printf("N[%d] = %.4f%n", i, vet[i]); 
    }
    ler.close();
  }
}