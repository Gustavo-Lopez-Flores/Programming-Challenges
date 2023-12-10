import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, amount, num1, num2;
    double f;
    amount = ler.nextInt();
    for(i = 1; i <= amount; i++){
      num1 = ler.nextInt();
      num2 = ler.nextInt();
      if(num2 == 0){
        System.out.println("divisao impossivel");
      }else{
        f = (double)num1/num2;
        System.out.printf("%.1f%n", f);  
      }
    }
    ler.close();
  }
}