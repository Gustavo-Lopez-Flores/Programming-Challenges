import java.util.*;

public class Main {
  public static void bubbleSort(int[] arr){
    int n = arr.length;
    int temp = 0, swap = 0;
    for(int i=0; i<n; i++){
      for(int j=1; j<(n-i); j++){
        if(arr[j-1] > arr[j]){
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
          swap++;
        }
      }
    }
    System.out.printf("Optimal train swapping takes %d swaps.%n", swap);
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int testes = ler.nextInt();
    for(int i = 0; i < testes; i++){
      int nums = ler.nextInt();
      int[] vet = new int[nums];
      
      for(int j = 0; j < nums; j++){
        vet[j] = ler.nextInt();
      }

      bubbleSort(vet);
    }

    ler.close();
  }
}