import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
      int i = 3, j = 2;
      double sum = 1;
      while(i<=39){
        sum += (double)i/j;
        i+=2;
        j = j * 2;
      }
      System.out.printf("%.2f%n",sum);
    ler.close();
  }
}