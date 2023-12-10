import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int [] vet = new int[5];
    int i, qntd = 0;
    for(i = 0; i < 5; i ++){
      vet[i] = ler.nextInt();
      if(vet[i] % 2 == 0){
          qntd = qntd + 1;
      }
    }
    System.out.printf("%d valores pares%n",qntd);
    ler.close();
  }
}