import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int amount, i, j, num1, num2, higher, smallest, sum = 0;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      num1 = ler.nextInt(); 
      num2 = ler.nextInt();
      higher = num1 > num2? num1: num2;
      smallest = num1 > num2? num2: num1;
      for(j = smallest+1; j <= higher-1; j++){
        if(j % 2 == 0){
        }else{
          sum += j;
        }
      }
      System.out.println(sum);
      sum = 0;
    }
    ler.close();
  }
}