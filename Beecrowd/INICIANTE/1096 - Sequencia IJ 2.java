import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i = 1, j = 7;
    while(i < 10){
      System.out.printf("I=%d J=%d%n", i, j);
      System.out.printf("I=%d J=%d%n", i, j-1);
      System.out.printf("I=%d J=%d%n", i, j-2);
      i+=2;
    }
    ler.close();
  }
}