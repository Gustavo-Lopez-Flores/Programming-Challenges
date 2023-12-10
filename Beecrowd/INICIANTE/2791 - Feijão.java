import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int TAM = 4;
    int i;
    int c[] = new int[TAM];
    for(i=0;i<TAM;i++){
      c[i] = ler.nextInt();
    }
    for(i=0;i<TAM;i++){
      if(c[i] == 1){
        System.out.println(i+1);
        break;
      }
    }
    ler.close();
  }
}
