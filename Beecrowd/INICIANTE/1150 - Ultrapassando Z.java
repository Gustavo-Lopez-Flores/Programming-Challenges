import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int x, z, amount = 0, sum = 0;
    x = ler.nextInt();
    z = ler.nextInt();
    while(z<=x){
      z = ler.nextInt();
    }  
    while(sum <= z){
      sum+=x;
      x++;
      amount++;
    }  
    System.out.println(amount);
    ler.close();
  }
}