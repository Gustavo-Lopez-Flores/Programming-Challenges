import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int l = ler.nextInt();
    int c = ler.nextInt();
    if((l+c)%2==0){
      System.out.println("1");
    }else{
      System.out.println("0");
    }
    ler.close();
  }
}
