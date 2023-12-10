import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int r = 0, cA, bA, pA, cR, bR, pR;
    cA = ler.nextInt();
    bA = ler.nextInt();
    pA = ler.nextInt();
    cR = ler.nextInt();
    bR = ler.nextInt();
    pR = ler.nextInt();
    if(cR > cA){
      r += Math.abs(cA-cR);
    }
    if(bR > bA){
      r += Math.abs(bA-bR);
    }
    if(pR > pA){
      r += Math.abs(pA-pR);
    }
    System.out.println(r);
    ler.close();
  }
}