import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, qntd;
    long n, t;
    qntd = ler.nextInt();
    for(i = 0; i < qntd; i++){
      n = ler.nextLong();
      t = 2015-n;
      if(n > 2014){
        t = (t*(-1))+1;
        System.out.printf("%d A.C.%n",t);    
      }else{
        System.out.printf("%d D.C.%n",t);    
      }    
    }
    ler.close();
  }
}
