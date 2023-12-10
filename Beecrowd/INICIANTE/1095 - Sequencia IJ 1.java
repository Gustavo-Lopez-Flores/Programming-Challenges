import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int aux, i = 1, j = 60;
    while(j > -1){
      System.out.printf("I=%d J=%d%n",i,j);
      i+=3;
      j-=5;
    }
    ler.close();
  }
}