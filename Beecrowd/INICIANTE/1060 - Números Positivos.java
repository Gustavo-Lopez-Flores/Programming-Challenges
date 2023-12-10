import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);  
    int i, qntd = 0;
    double [] vet = new double[6];
    for(i = 0; i <= 5; i++){
      vet[i] = ler.nextDouble();
      if(vet[i] > 0){
        qntd++; 
      }
    }
    System.out.printf("%d valores positivos%n", qntd);
    ler.close();
  }
}