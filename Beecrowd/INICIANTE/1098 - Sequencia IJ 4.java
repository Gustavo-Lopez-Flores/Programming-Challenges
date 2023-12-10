import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float i = 0, j = 1;
    while(i < 2.2){
      if((i > 0 && i < 1) || (i > 1 && i < 2)){
        System.out.printf("I=%.1f J=%.1f%n", i, j);
        System.out.printf("I=%.1f J=%.1f%n", i, j+1);
        System.out.printf("I=%.1f J=%.1f%n", i, j+2);
      }else{
        System.out.printf("I=%.0f J=%.0f%n", i, j);
        System.out.printf("I=%.0f J=%.0f%n", i, j+1);
        System.out.printf("I=%.0f J=%.0f%n", i, j+2); 
      }
      i+= 0.2;
      j+= 0.2; 
    }
    ler.close();
  }
}