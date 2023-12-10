import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int [] vet = new int[5];
    int i, qntdPar = 0, qntdImpar = 0, qntdPositivos = 0, qntdNegativos = 0;
    for(i = 0; i < 5; i ++){
      vet[i] = ler.nextInt();
      if(vet[i] % 2 == 0){
          qntdPar = qntdPar + 1;
      }else{
          qntdImpar = qntdImpar + 1;
      } 
      if(vet[i] > 0){
          qntdPositivos = qntdPositivos + 1;
      }
      if(vet[i] < 0){
          qntdNegativos = qntdNegativos + 1;
      }
    }
    System.out.printf("%d valor(es) par(es)%n",qntdPar);
    System.out.printf("%d valor(es) impar(es)%n",qntdImpar);
    System.out.printf("%d valor(es) positivo(s)%n",qntdPositivos);
    System.out.printf("%d valor(es) negativo(s)%n",qntdNegativos);
    ler.close();
  }
}