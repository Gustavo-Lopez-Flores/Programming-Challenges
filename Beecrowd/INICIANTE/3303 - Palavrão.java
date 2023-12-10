import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String s;
    s = ler.next();
    if(s.length() >= 10){
      System.out.println("palavrao");
    }else{
      System.out.println("palavrinha");
    }
    ler.close();
  }
}
