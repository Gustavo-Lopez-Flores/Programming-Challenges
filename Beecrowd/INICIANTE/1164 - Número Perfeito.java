import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, j, amount, num, sum;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      num = ler.nextInt();
      sum = 0;
      for(j = 1; j < num; j++){
        if(num % j == 0){
          sum += j;
        }
      }
      if(sum == num){
        System.out.printf("%d eh perfeito%n",num);
      }else{
        System.out.printf("%d nao eh perfeito%n",num);
      }
    }
    ler.close();
  }
}