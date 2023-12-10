import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String t;
    t = ler.nextLine();
    if(t.length() > 140){
      System.out.println("MUTE");
    }else{
      System.out.println("TWEET");
    }
    ler.close();
  }
}