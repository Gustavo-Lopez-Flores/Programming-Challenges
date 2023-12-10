import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int eB, eM, h, e, a, o, w, x;
    h = ler.nextInt();
    e = ler.nextInt();
    a = ler.nextInt();
    o = ler.nextInt();
    w = ler.nextInt();
    x = ler.nextInt();
    eB = h + e + a;
    eM = o + w;
    if(eB <= eM){
      eB += x;
    }
    if(eB == eM){
      eB += 1;
    }
    if(eB < eM){
      System.out.println("Sauron has returned.");    
    }else{
      System.out.println("Middle-earth is safe.");
    }
    ler.close();
  }
}