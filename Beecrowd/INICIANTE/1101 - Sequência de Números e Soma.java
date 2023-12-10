import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int aux = 1, j, num1 = 1, num2 = 1, higher, smallest, sum = 0;
    while(aux == 1){
    num1 = ler.nextInt();
    num2 = ler.nextInt();
    if ((num1 == 0) || (num2==0) || (num1 < 0) || (num2 < 0)){
      break;  
    }
    higher = num1 > num2? num1: num2;
    smallest = num1 > num2? num2: num1;
    for(j = smallest; j <= higher; j++){
      System.out.printf("%d ",j);
      sum += j;
    }
    System.out.printf("Sum=%d%n",sum);
    sum = 0;
    }
    ler.close();
  }
}