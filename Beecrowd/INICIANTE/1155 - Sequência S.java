import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i;
    double sum = 1;
    for(i=2;i<=100;i++){
    sum += (double)1/i;
    }
    System.out.printf("%.2f%n",sum);
    ler.close();
  }
}