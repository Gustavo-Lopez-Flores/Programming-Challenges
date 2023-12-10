import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int aux, cont, i, num1, num2, amount, sum = 0;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      num1 = ler.nextInt();
      num2 = ler.nextInt();
      aux = num1;
      cont = 0;
      while(cont < num2){
        if((aux % 2) != 0){
          sum+=aux;
          cont++;
        }
        aux++;
      }
      System.out.println(sum);
      sum = 0;
    }
    ler.close();
  }
}