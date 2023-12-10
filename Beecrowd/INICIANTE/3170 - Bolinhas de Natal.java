import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int b= 0, g = 0, d = 0;
    b = ler.nextInt();
    g = ler.nextInt();
    if(g % 2 != 0){
      g--;
    }
    d = g/2; 
    if(b>=d){
      System.out.println("Amelia tem todas bolinhas!");
    }else{
      b = Math.abs(b-d);
      System.out.printf("Faltam %d bolinha(s)%n",b);
    }
    ler.close();
  }
}