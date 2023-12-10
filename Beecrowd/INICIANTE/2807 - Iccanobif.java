import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, TAM = 40;
    int vet[] = new int[TAM];
    n = ler.nextInt();
    vet[0]=1;
    vet[1]=1;
    for(i=2;i<n;i++){
      vet[i] = vet[i-1] + vet[i-2];
    }
    for(i=n-1;i>=0;i--){
      if(i!=0){
        System.out.printf("%d ",vet[i]);    
      }else{
        System.out.println(vet[i]);    
      }
    }
    ler.close();
  }
}  