import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 100;
    int i, aux, qntd;
    int aluno[] = new int[MAX];
    float nota[] = new float[MAX];
    qntd = ler.nextInt(); 
    for(i=0;i<qntd;i++){
      aluno[i] = ler.nextInt();
      nota[i] = ler.nextFloat();
    }
    aux = 0;
    for(i=1;i<qntd;i++){
      if(nota[aux] < nota[i]){
        aux = i;
      }
    }
    if(nota[aux] >= 8){
      System.out.println(aluno[aux]);    
    }else{
      System.out.println("Minimum note not reached");
    }
    ler.close();
  }
}
