import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, sum = 0, higher, smallest, num1, num2;
    num1 = ler.nextInt();
    num2 = ler.nextInt();
    higher = num1 > num2 ? num1: num2;
    smallest = num1 < num2 ? num1: num2;
    for(i=smallest+1;i<=higher-1;i++){
      if(i%5==2 || i%5==3){
        System.out.println(i);
      }
    }
    ler.close();
  }
}