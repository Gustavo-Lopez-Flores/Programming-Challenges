import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, num, maior = 0, posicao = 0;
    for(i=1;i<=100;i++){
      num = ler.nextInt();
      if(i == 1){
      maior = num; 
      }
      if(maior < num){
      maior = num;
      posicao = i;  
      }
    }
    System.out.println(maior);
    System.out.println(posicao);
    ler.close();
  }
}