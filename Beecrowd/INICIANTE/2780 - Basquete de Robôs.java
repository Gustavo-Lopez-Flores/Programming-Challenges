import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); 
    int d, p = 0;
    d = ler.nextInt();
    if(d <= 800){
      p = 1;
    }else if(d <= 1400){
      p = 2;
    }else if(d <= 2000){
      p = 3;
    }
    System.out.println(p);  
    ler.close();
  }
}