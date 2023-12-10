import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, j, amount, num, div;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      num = ler.nextInt();
      div = 0;
      for(j = 1; j <= num; j++){
        if(num % j == 0){
          div++;
        }
      }
      if(div == 2){
        System.out.printf("%d eh primo%n",num);
      }else{
        System.out.printf("%d nao eh primo%n",num);
      }
    }
    ler.close();
  }
}