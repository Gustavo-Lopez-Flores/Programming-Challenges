import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    double [] vet = new double[6];
    double soma = 0, media;
    int i, qntd = 0;
    for(i = 0; i < 6; i ++){
      vet[i] = ler.nextDouble();
      if(vet[i]>0){
          qntd = qntd + 1;
          soma = soma + vet[i];
      }
    }
    System.out.printf("%d valores positivos%n",qntd);
    media = soma/qntd;
    System.out.printf("%.1f%n", media);
    ler.close();
  }
}