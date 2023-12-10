import java.util.Scanner;

public class Main {
  static boolean metricaUm(int[] vet, int tam){
    for(int i = 2; i < tam; i+=2){
      if(i == tam-1){
        if(vet[i] >= vet[i-1]){
          return true;
        }
      }else{
        if(vet[i] >= vet[i+1] || vet[i] >= vet[i-1]){
          return true;
        }
      }
    }
    return false;
  } 
  static boolean metricaDois(int[] vet, int tam){
    for(int i = 2; i < tam; i+=2){
      if(i == tam-1){
        if(vet[i] <= vet[i-1]){
          return true;
        }
      }else{
        if(vet[i] <= vet[i+1] || vet[i] <= vet[i-1]){
          return true;
        }
      }
    }
    return false;
  } 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int tam = ler.nextInt();
    int[] vet = new int[tam];
    for(int i = 0; i < tam; i++){
      vet[i] = ler.nextInt();
    }

    StringBuilder sb = new StringBuilder();
    if(tam == 1){
      sb.append("1");
    }else{
      if(vet[0] < vet[1]){
        if(tam == 2){
          sb.append("1");
        }else if(metricaUm(vet, tam)){
          sb.append("0");
        }else{
          sb.append("1");
        }
      }else if(vet[0] > vet[1]){
        if(tam == 2){
          sb.append("1");
        }else if(metricaDois(vet, tam)){
          sb.append("0");
        }else{
          sb.append("1");
        }
      }else{
        sb.append("0");
      }
    }
    System.out.println(sb.toString());
      
    ler.close();
 }
}