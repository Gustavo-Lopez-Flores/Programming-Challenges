import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double troca;
    double [] vet = new double[3];
    int i, j;
    for(i = 0; i <= 2; i++){
        vet[i] = ler.nextDouble();
    }
    for(i = 0; i <= 1; i++){
      for(j= i + 0; j <= 2; j++){
        if(vet[i] < vet[j]){
          troca = vet[i];
          vet[i] = vet[j];
          vet[j] = troca;
        }    
      }
    }
    if(vet[0] >= (vet[1]+vet[2])){
      System.out.println("NAO FORMA TRIANGULO");    
    } else {
        if(Math.pow(vet[0],2) == (Math.pow(vet[1],2) + Math.pow(vet[2],2))){
          System.out.println("TRIANGULO RETANGULO");    
        }
        if(Math.pow(vet[0],2) > (Math.pow(vet[1],2) + Math.pow(vet[2],2))){
          System.out.println("TRIANGULO OBTUSANGULO");    
        }
        if(Math.pow(vet[0],2) < (Math.pow(vet[1],2) + Math.pow(vet[2],2))){
          System.out.println("TRIANGULO ACUTANGULO");    
        }
        if(vet[0] == vet[1] && vet[1] == vet[2]){
          System.out.println("TRIANGULO EQUILATERO");    
        }else if(vet[0] == vet[1] || vet[1] == vet[2] || vet[0] == vet[2]){
          System.out.println("TRIANGULO ISOSCELES");    
        }
      }
    ler.close();
  }
}