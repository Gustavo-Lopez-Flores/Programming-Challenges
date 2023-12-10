import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double x = ler.nextDouble();
    double y = ler.nextDouble();
    if(x == 0 && y == 0){
    System.out.printf("Origem%n");
    }
    if(x > 0 && y > 0){
    System.out.printf("Q1%n");
    }
    if(x < 0 && y > 0){
    System.out.printf("Q2%n");
    }
    if(x < 0 && y < 0){
    System.out.printf("Q3%n");
    }
    if(x > 0 && y < 0){
    System.out.printf("Q4%n");
    }
    if(x == 0 && y != 0){
    System.out.printf("Eixo Y%n");
    }
    if(x != 0 && y == 0){
    System.out.printf("Eixo X%n");
    }
    ler.close();
  }
}