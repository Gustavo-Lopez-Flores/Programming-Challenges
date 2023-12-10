import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int qntd, i;
    long n1, n2;
    String s1, s2, p1, p2;
    qntd = ler.nextInt();
    for(i=0;i<qntd;i++){
      s1 = ler.next(); 
      p1 = ler.next(); 
      s2 = ler.next(); 
      p2 = ler.next();
      n1 = ler.nextInt();
      n2 = ler.nextInt();
      if((n1 + n2) % 2 == 0){
        if(p1.equals("PAR")){
          System.out.println(s1);
        }else{
          System.out.println(s2);
        }
      }else{
        if(p1.equals("IMPAR")){
          System.out.println(s1);
        }else{
          System.out.println(s2);
        }
      }
    }
    ler.close();
  }
}