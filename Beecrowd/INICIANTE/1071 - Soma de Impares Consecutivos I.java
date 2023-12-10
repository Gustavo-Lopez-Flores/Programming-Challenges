import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, x, y, soma = 0;
    x = ler.nextInt();
    y = ler.nextInt();
    for(i=y+1; i<=x-1; i++){
      if(i%2==0){
      }else{
        soma = soma + i;
      }
    }
    System.out.println(soma);
    ler.close();
  }
}