import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, qntd, num, in = 0, out = 0;
    qntd = ler.nextInt();
    for(i=1; i<=qntd; i++){
      num = ler.nextInt();
      in = num >= 10 && num <= 20? in+=1: in;
      out = num < 10 || num > 20? out+=1: out;
    }
    System.out.printf("%d in%n",in);
    System.out.printf("%d out%n",out);
    ler.close();
  }
}