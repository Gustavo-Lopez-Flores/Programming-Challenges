import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int amount, num = 1, i;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      System.out.printf("%d %d %d%n", num, (int)Math.pow(num,2), (int)Math.pow(num,3));
      System.out.printf("%d %d %d%n", num, (int)Math.pow(num,2)+1, (int)Math.pow(num,3)+1);
      num++;
    }
    ler.close();
  }
}