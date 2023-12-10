import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, j, troca;
    int [] v1 = new int[3];
    int [] v2 = new int[3];
    for(i = 0; i <= 2; i++){
      v1[i] = ler.nextInt();
      v2[i] = v1[i];
    }
    for(i = 0; i <= 1; i++){
      for(j = i + 1; j <= 2; j++){
        if(v2[i] > v2[j]){
            troca = v2[i];
            v2[i] = v2[j];
            v2[j] = troca;
        }
      }   
    }
    for(i = 0; i <= 2; i++){
      System.out.printf("%d%n", v2[i]);
    }
    System.out.println();
    for(i = 0; i <= 2; i++){
      System.out.printf("%d%n", v1[i]);
    }
    ler.close();
  }
}